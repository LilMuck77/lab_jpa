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
@Table(name = "Collector")
//I was wondering how do we make an .sql class?
//I couldn't find it anywhere.
public class Collector {
    @Id //primary key
    @Column(name="collector_id")
    private int id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="avatar")
    private String avatar;

}
