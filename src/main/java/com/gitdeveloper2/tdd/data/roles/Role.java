package com.gitdeveloper2.tdd.data.roles;

import com.gitdeveloper2.tdd.data.users.entity.User;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "role")
public class Role{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
//   @ManyToOne()
//           @JoinColumn(name = "user_id")
//    List<User> user;

}