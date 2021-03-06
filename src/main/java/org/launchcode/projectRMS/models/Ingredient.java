package org.launchcode.projectRMS.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=100)
    private String ingredientName;

    @OneToMany
    @JoinColumn(name = "ingredient_id")
    private List<AddIngredientsToRecipe> addIngredientsToRecipes = new ArrayList<>();

    public Ingredient(){}

    public Ingredient(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public int getId() {
        return id;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public List<AddIngredientsToRecipe> getAddIngredientsToRecipes() {
        return addIngredientsToRecipes;
    }
}
