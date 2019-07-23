package com.company.GameStoreProject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

    @Entity
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @Table(name="games")

    public class Games {
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
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
        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }
        public double getDecimal() {
            return Decimal;
        }

        public void setDecimal(double decimal) {
            Decimal = decimal;
        }

        public Integer getQuantity() {
            return Quantity;
        }

        public void setQuantity(Integer quantity) {
            Quantity = quantity;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @NotNull
        @Length(max=11)
        private Integer id;
        @NotNull
        @Length(max=50)
        private String studio;
        @NotNull
        @Length(max=50)
        private String ESRBRating;
        @NotNull
        @Length(max=50)
        private String Description;
        @NotNull
        @Length(max=50)
        private String Title;
        @NotNull
        @Length(max=5, min=2)
        private double Decimal;
        @NotNull
        @Length(max=11)
        private Integer Quantity;

    }


