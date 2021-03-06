package org.launchcode.projectRMS.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class AddIngredientsToRecipe {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max = 100)
    private String quantity;

    @ManyToOne
    private Recipe recipe;

    @ManyToOne
    private Ingredient ingredient;

    public AddIngredientsToRecipe(String quantity) {
        this.quantity = quantity;
    }

    public AddIngredientsToRecipe() {
    }

    public int getId() {
        return id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
