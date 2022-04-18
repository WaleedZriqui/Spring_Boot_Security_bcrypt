package com.example.demo.project.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
@NoArgsConstructor
@Setter
@Getter
//here all setter and getter genareted automatically
public class Users {
    @Id
    private int id;
    private String name;
    private String password;


}
