package com.med.recipe_app_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "instructions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Instruction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stepNumber;
    private String instruction;
}
