package com.company.GameStoreProject;  // this is the DAO

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


public interface TshirtRepository extends JpaRepository {<Tshirt, Integer>
    List<Tshirt>findTshirtById(int id);
    List<Tshirt>findTshirtByColor(String color);
    List<Tshirt>findTshirtBySize(String size);
}
