package com.med.recipe_app_backend.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="meals")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private String area;
    private String imageUrl;
    private String imageSource;
    private String youtubeUrl;
    private String mealSource;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Ingredient> ingredientList;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Instruction> instructionList;
}
