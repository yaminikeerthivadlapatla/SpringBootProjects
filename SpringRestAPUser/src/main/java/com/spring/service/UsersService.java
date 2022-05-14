package com.spring.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.main.Users;
import com.spring.dao.UsersRepository;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;
    public ResponseEntity<Object> getAllUsers() {
        List<Users> dbUsers = usersRepository.findAll();
        if (dbUsers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        // TODO Auto-generated method stub
        return new ResponseEntity<>(dbUsers, HttpStatus.OK);
    }
}