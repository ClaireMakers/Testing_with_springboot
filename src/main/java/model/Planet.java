package model;

import jakarta.persistence.*;

public class Planet {

    private Long id;
    private String description;
    private Number circumference;

    public Planet(String description, Number circumference) {
        this.description = description;
        this.circumference = circumference;
    }

    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    public Number getCircumference() { return this.circumference; }
    public void setCircumference(Number circumference) { this.circumference = circumference; }
}
