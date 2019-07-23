package com.company.GameStoreProject;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GameRepo extends JpaRepository<Games, Integer> {
    List<Games> findByESRBRating(String ESRBRating);
    List<Games> findByStudio(String studio);
    List<Games> findByTitle(String title);

}

