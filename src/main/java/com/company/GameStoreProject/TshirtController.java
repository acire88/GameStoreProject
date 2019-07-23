package com.company.GameStoreProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TshirtController {
    @Autowired
    private TshirtServiceLayer tshirtRepo;


    @RequestMapping(value = "/tshirts", method = RequestMethod.POST)
    public Tshirt addTshirt(@RequestBody @Valid Tshirt tshirt) {
        tshirtRepo.addTshirt(tshirt);
        return tshirt;
    }


    @RequestMapping(value = "/tshirts", method = RequestMethod.GET)
    public List<Tshirt> getAllTshirt() {
        return tshirtRepo.getAllTshirts();
    }

    @RequestMapping(value = "/tshirts/{id}", method = RequestMethod.GET)
    public Tshirt getTshirtById(@PathVariable int id) {
        return tshirtRepo.getTshirtById(id);

    }
    @RequestMapping(value = "/tshirts/{size}", method = RequestMethod.GET)
    public Tshirt getTshirtBySize(@PathVariable String size) {
        return tshirtRepo.getTshirtBySize(size);

    }
    @RequestMapping(value = "/tshirts/{color}", method = RequestMethod.GET)
    public Tshirt getTshirtByColor(@PathVariable String color) {
        return tshirtRepo.getTshirtByColor(color);

    }

    @RequestMapping(value = "/tshirts/{size}", method = RequestMethod.PUT)
    public void updateTshirt(@RequestBody @Valid Tshirt tshirt, @PathVariable String size) {
        tshirtRepo.updateTshirt(tshirt, size);
    }

    @RequestMapping(value = "/tshirts/{size}", method = RequestMethod.DELETE)
    public void deleteTshirt(@PathVariable String size) {
        tshirtRepo.deleteTshirt(size);
    }
}




