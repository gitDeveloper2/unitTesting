package com.gitdeveloper2.tdd.data.users.entity;

import com.gitdeveloper2.tdd.data.roles.Role;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "user")
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
//    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = false,targetEntity = Role.class)
//    Role role;


}
