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
@Table(name = "Photo")
public class Photo {
    @Id //primary key
    @Column(name="photo_id")
    private int id;
    //Does it know its a foreign key?
    //We have an @Id bean for the primary key, was
    //just thinking they would have something for the foreign key.
    @Column(name="collector_id")
    private int collectorId;
    @Column(name="file_name")
    private String fileName;
    @Column(name="date_stamp")
    private LocalDateTime dateStamp;
    @Column(name="visible")
    private boolean visible;

}
