package com.example.hotelmanagement.controller;
import com.example.hotelmanagement.model.Room;
import com.example.hotelmanagement.service.HotelService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
//Marks this class as spring MVC controller that handle http request
//It combines @cotroller+@ResponeBody-> returns data directly(usually JSON)

@RequestMapping("/rooms")
//sets the base URL path for all endpoints in this controller
public class HotelController {
    private final HotelService service;
    public HotelController(HotelService service){
        this.service = service;
    }
    @GetMapping
    public List<Room> getAllRooms(){
        return service.getRooms();
    }
    //Handles HTTP POST request at /rooms.
    //@RequestBody -> Maps the JSON body of the request into a room object
    @PostMapping
    public String addRoom(@RequestBody Room room){
        service.addRoom(room);
        return "Room Added Successfully";
    }
    //Handles GET request like /rooms/101.
    //@PathVariable -> Extracts the roomNumber from the URL and passes
    @GetMapping("/{roomNumber}")
    public Room getRoom(@PathVariable int roomNumber){
        return service.getRoomByNumber(roomNumber);
    }
}
