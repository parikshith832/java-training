package com.example.studentmanagement.controller;
import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    private final StudentService service;
    public StudentController(StudentService service){
        this.service=service;
    }
    //Model acts like a Container(map->key,value pairs)
    //Without Model, HTML template won't know what to display
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("students",service.getAllStudents());
        return "index";
    }
    @GetMapping("/add")
    public String addStudent(Model model){
        model.addAttribute("student",new Student());
        return "add-student";
    }
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student){
        service.saveStudent(student);
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable Integer id,
                              Model model){
        model.addAttribute("student",
                service.getStudentById(id));
        return "edit-student";
    }
   @PostMapping("/update")
   public String updateStudent(@ModelAttribute Student
                                          student){
        service.saveStudent(student);
        return "redirect:/";
   }
   @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Integer id){
        service.deleteStudent(id);
        return "redirect:/";
   }

}
