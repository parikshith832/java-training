package com.example.quizapp.service;

import com.example.quizapp.model.Question;
import com.example.quizapp.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    private final QuizRepository repository;

    public QuizService(QuizRepository repository) {

        this.repository = repository;

    }

    public List<Question> getQuestions() {

        return repository.getQuestions();

    }

    public void addQuestion(Question question) {

        repository.addQuestion(question);

    }

    public Question getQuestionById(int id) {

        for (Question q : repository.getQuestions()) {

            if (q.getId() == id) {

                return q;

            }

        }

        return null;

    }

}