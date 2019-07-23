package com.company.GameStoreProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameService {
    @Autowired
    private GameRepo GamesRepo;

    public Games addGame(Games games) {
        GamesRepo.save(games);
        return games;
    }

    public void updateGames(Games games, Integer  id) {
        if (games.getId()!= (id)) {
           throw new IllegalArgumentException("Game ID must match ID provided");
        }
        GamesRepo.save(games);
    }
    public List<Games> getAllGames() {
        return GamesRepo.findAll();
    }

    public Games getGamesById(Integer  id) {
        return GamesRepo.getOne(id);
    }

    public void deleteGame(Integer id) {
        GamesRepo.deleteById(id);
    }

    public void updateGame(Games games, Integer id) {
    }


}

