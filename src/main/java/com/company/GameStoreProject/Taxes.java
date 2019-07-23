package com.company.GameStoreProject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="Taxes")

public class Taxes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Length(max=2)
    private String state;
    @NotNull
    private Float rate;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }
}
