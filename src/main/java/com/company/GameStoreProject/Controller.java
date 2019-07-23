package com.company.GameStoreProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

        @Autowired
        private GameService service;

        @RequestMapping(value="/games", method = RequestMethod.GET)
        public List<Games> getAllGames() {
            return service.getAllGames();
        }

        @RequestMapping(value="/games", method = RequestMethod.POST)
        public Games createGame(@RequestBody Games games) {
            service.addGame(games);
            return games;
        }


        @RequestMapping(value="/games/{id}", method = RequestMethod.PUT)
        public void updateGame(@RequestBody Games games, @PathVariable Integer id) {
            service.updateGame(games,id);
        }

        @RequestMapping(value="/games/{game_id}", method = RequestMethod.DELETE)
        public void deleteGame(@PathVariable Integer id) {
            service.deleteGame(id);
        }

}
