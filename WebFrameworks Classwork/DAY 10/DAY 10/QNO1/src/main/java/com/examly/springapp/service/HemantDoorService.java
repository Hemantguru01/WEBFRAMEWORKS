package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.HemantDoor;
import com.examly.springapp.repository.HemantDoorRepo;

@Service
public class HemantDoorService {
    @Autowired
    private HemantDoorRepo doorRepo;

    public HemantDoor postData(HemantDoor door) {
        return doorRepo.save(door);
    }

    public List<HemantDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public HemantDoor updateDetail(int doorid, HemantDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<HemantDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<HemantDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public HemantDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}