package com.gitdeveloper2.tdd.data.users.repos;

import com.gitdeveloper2.tdd.data.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
