package com.company.GameStoreProject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

    @Entity
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @Table(name="games")

    public class Games {
        public Integer getGame_id() {
            return game_id;
        }

        public void setGame_id(Integer game_id) {
            this.game_id = game_id;
        }

        public String getStudio() {
            return studio;
        }

        public void setStudio(String studio) {
            this.studio = studio;
        }

        public String getESRBRating() {
            return ESRBRating;
        }

        public void setESRBRating(String ESRBRating) {
            this.ESRBRating = ESRBRating;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @NotNull
        private Integer game_id;
        @NotNull
        private String studio;
        @NotNull
        private String ESRBRating;
        @NotNull
        private String Title;
    }


