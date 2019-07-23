package com.company.GameStoreProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ConsoleServiceLayer {
    @Autowired
    private ConsoleRepository consoleRepo;

    public Consoles addConsoles(Consoles consoles) {
        consoleRepo.save(consoles);
        return consoles; //POST
    }

    public List<Consoles> getAllConsoles() {
        return consoleRepo.findAll();  //GET
    }

    public List<Consoles> findConsolesByManufacturer(String manufacturer) {
        return consoleRepo.findByManufacturer(manufacturer); //GET
    }


    public void deleteConsoles(int consoleId) {
        consoleRepo.deleteById(consoleId); //DELETE
    }

public void updateConsoles(Consoles consoles, int consoleId) {
        if (consoles.getConsoleId() != consoleId) {
            throw new IllegalArgumentException("Console id must match the id provided");
        }
        consoleRepo.save(consoles);   //PUT
}




}
