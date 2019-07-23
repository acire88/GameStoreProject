package com.company.GameStoreProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TshirtServiceLayer {
    @Autowired
    private TshirtRepository tshirtRepo;

    public Tshirt addTshirt(Tshirt tshirt) {
        tshirtRepo.save(tshirt);
        return tshirt;
    }

    public List<Tshirt> getAllTshirts() {
        return tshirtRepo.findAll();
    }
    public List<Tshirt> getTshirtById() {
        return tshirtRepo.findTshirtById(int id);
    }
    public Tshirt getTshirtBySize(String size) {
        return tshirtRepo.findTshirtBySize(String size);
    }
    public List<Tshirt> getTshirtByColor() {
        return tshirtRepo.findTshirtByColor(String color);
    }

    public void updateTshirt(Tshirt tshirt, String size) {
        if (tshirt.getSize() != size) {
            throw new IllegalArgumentException("Size must match the size provided");
        }
        tshirtRepo.save(tshirt);
    }

    public void deleteTshirt(int id) {
        tshirtRepo.deleteById(id);
    }

}