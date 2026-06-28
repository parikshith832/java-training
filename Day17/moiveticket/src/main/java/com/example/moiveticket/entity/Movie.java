package com.example.movieticket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String movieName;
    private String customerName;
    private int seatNumber;
    public Movie(){}
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public String getMovieName(){
        return movieName;
    }
    public void setMovieName(String movieName){
        this.movieName=movieName;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public int getSeatNumber(){
        return seatNumber;
    }
    public void setSeatNumber(int seatNumber){
        this.seatNumber=seatNumber;
    }
}
