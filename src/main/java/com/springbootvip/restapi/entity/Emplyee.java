package com.springbootvip.restapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Emplyee")
public class Emplyee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Emplyee_Fname")
    private String Fname;
    @Column(name = "Emplyee_Lname")
    private String Lname;
    @Column(name = "emplyee_Emails",nullable = false)
     private String email;
}
