package edu.wctc.lab_jpa.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "FoodPhoto")
public class FoodPhoto {
    @Id
    @Column(name="food_photo_id")
    private int id;
    @Column(name="recipe_id")
    private int recipeId;
    @Column(name="file_name")
    private String fileName;
    @Column(name="caption")
    private String caption;
    @Column(name="date_stamp")
    private LocalDateTime dateStamp;
    @Column(name="visible")
    //Just want to make sure, would this be a boolean?
    private boolean visible;

}
