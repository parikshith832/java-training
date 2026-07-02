package com.example.studentmanagement.service;
import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;
    public StudentService(StudentRepository repository){
        this.repository=repository;
    }
    public List<Student> getAllStudents(){
        return repository.findAll();
    }
    public void saveStudent(Student student){
        repository.save(student);
    }
    public Student getStudentById(Integer id){
        return repository.findById(id).orElse(null);
    }
    public void deleteStudent(Integer id){
        repository.deleteById(id);
    }
}
