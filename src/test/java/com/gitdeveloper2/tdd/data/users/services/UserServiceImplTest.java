package com.gitdeveloper2.tdd.data.users.services;

import com.gitdeveloper2.tdd.data.users.entity.User;
import com.gitdeveloper2.tdd.data.users.repos.UserRepo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

//@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
    @Mock
    UserRepo userRepo;

    @InjectMocks
    UserService userService;

    @Test
//    check about the parameters if i need to passs the user here
    public void save(){
        User user=new User();
        user.se
//        get repo
//        call repo.save
        User _user = userRepo.save(user);

//        assert ---  given method
        Mockito.verify(userRepo,Mockito.times(1)).save(user);
//        get d  return value



    }


}