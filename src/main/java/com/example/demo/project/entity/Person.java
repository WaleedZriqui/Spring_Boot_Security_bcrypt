package com.example.demo.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class Person {

    @Id
    @SequenceGenerator(
            name = "person_sequence",
            sequenceName = "person_sequence",
            initialValue = 1,
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "person_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private long id;
    private String name;
    private int age;
    private String city;
    @OneToOne(targetEntity = Car.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "pc_fk", referencedColumnName = "cid")
    private Car car;

}
