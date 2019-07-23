package com.company.GameStoreProject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="Fees")
public class Fees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Length(max=20)
    private String productType;
    private Float fee;


}
