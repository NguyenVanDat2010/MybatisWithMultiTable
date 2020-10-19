package com.example.multitable.controller;

import com.example.multitable.model.User;
import com.example.multitable.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author nvdat2
 */
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @GetMapping("getUserWithAccount/{id}")
    public ResponseEntity<User> getUserWithAccount(@PathVariable("id") Long id) {
        return new ResponseEntity<>(userService.getUserWithAccount(id), HttpStatus.OK);
    }

    @GetMapping("getUserWithCompany/{id}")
    public ResponseEntity<User> getUserWithCompany(@PathVariable("id") Long id) {
        return new ResponseEntity<>(userService.getUserWithCompany(id), HttpStatus.OK);
    }
}
