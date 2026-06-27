package com.example.quizapp.repository;
import com.example.quizapp.model.Question;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QuizRepository {
    private List<Question> questions=new ArrayList<>();
    public QuizRepository(){
        questions.add(new Question(1,"Capital Of India ?","New Delhi"));
        questions.add(new Question(2,"2+2 ?","4"));
    }
    public List<Question> getQuestions(){
        return questions;
    }
    public void addQuestion(Question question){
       questions.add(question);
    }
}
