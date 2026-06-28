package com.example.hotelmanagement.repository;

import com.example.hotelmanagement.model.Room;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class HotelRepository {
    private List<Room> rooms=new ArrayList<>();
    public HotelRepository() {
        rooms.add(new Room(101,"Single",1500));
        rooms.add(new Room(102,"Double",2500));
        rooms.add(new Room(103,"Deluxe",4000));
    }
    public List<Room> getRooms(){
        return rooms;
    }
    public void addRooms(Room room){
        rooms.add(room);
    }
}
