package com.example.domain;

import io.micronaut.core.annotation.ReflectiveAccess;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Vote {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private @NotNull int id;

    @Enumerated(EnumType.STRING)
    private @NotNull Vote.Type type;


    @ReflectiveAccess
    public enum Type {
        YES,
        NO,
        NEUTRAL;
    }

}
