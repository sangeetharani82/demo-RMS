package org.launchcode.projectRMS.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class RateComment {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String rating;

    @NotNull
    private String comment;

    @ManyToOne
    private Recipe recipe;

    public RateComment(String rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    public RateComment() {
    }

    public int getId() {
        return id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
