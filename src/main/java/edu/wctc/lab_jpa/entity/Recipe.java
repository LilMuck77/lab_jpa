package edu.wctc.lab_jpa.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Recipe")
public class Recipe {
    @Id
    @Column(name = "recipe_id")
    private int id;
    @Column(name="chef_id")
    private int chefId;
    @Column(name="title")
    private String title;
    @Column(name="description")
    private String description;
}
