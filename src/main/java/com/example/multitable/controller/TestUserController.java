package com.example.multitable.controller;

import com.example.multitable.dao.UserDAO;
import com.example.multitable.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author nvdat2
 */
@RestController
@RequestMapping("/api/users")
public class TestUserController {
    @Autowired
    private UserDAO userDAO;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userDAO.getAllUsers(), HttpStatus.OK);
    }
}
