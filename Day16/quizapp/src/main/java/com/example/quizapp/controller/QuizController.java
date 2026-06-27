package com.example.quizapp.controller;

import com.example.quizapp.model.Question;
import com.example.quizapp.service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private final QuizService service;

    public QuizController(QuizService service) {

        this.service = service;

    }

    @GetMapping
    public List<Question> getAllQuestions() {

        return service.getQuestions();

    }

    @PostMapping
    public String addQuestion(@RequestBody Question question) {

        service.addQuestion(question);

        return "Question Added Successfully";

    }

    @GetMapping("/{id}")
    public Question getQuestion(@PathVariable int id) {

        return service.getQuestionById(id);

    }

}