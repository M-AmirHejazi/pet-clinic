package com.brehon.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Pet {

    @Setter
    @Getter
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

}
