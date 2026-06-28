package com.example.hotelmanagement.service;
import com.example.hotelmanagement.model.Room;
import com.example.hotelmanagement.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelService{
    private final HotelRepository repository;
    public HotelService(HotelRepository repository){
        this.repository = repository;
    }
    public void addRoom(Room room){
        repository.addRooms(room);
    }
    public Room getRoomByNumber(int roomNumber){
        for(Room room:repository.getRooms()){
            if(room.getRoomNumber() == roomNumber){
                return room;
            }
        }
        return null;
    }

    public List<Room> getRooms() {
        return repository.getRooms();
    }
}
