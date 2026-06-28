package com.example.movieticket.service;

import com.example.movieticket.entity.Movie;
import com.example.movieticket.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<Movie> getAllMovies() {
        return repository.findAll();
    }

    public void saveMovie(Movie movie) {
        repository.save(movie);
    }

    public void deleteMovie(Integer id) {
        repository.deleteById(id);
    }
}