package com.example.movieticket.controller;

import com.example.movieticket.entity.Movie;
import com.example.movieticket.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MovieController {

    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("movies", service.getAllMovies());

        return "index";

    }

    @GetMapping("/add")
    public String addForm(Model model) {

        model.addAttribute("movie", new Movie());

        return "add-movie";

    }

    @PostMapping("/save")
    public String save(@ModelAttribute Movie movie) {

        service.saveMovie(movie);

        return "redirect:/";

    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {

        service.deleteMovie(id);

        return "redirect:/";

    }

}