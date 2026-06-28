package com.example.hotelmanagement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelmanagementApplication.class, args);

	}
}
//@SpringBootApplication->meta annotation that combines three import
//spring annotation
//1.@configuration->Marks the class as a score of bean
//2.@EncbleAutoConfiguration-> Tells SpringBoot to automatically configure
//based on the dependencies added in spring initilizer
//3.@component-> scan thr package and sunpackages(@Controller,@Service
// and register them as beans