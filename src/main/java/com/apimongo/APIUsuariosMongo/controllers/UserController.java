package com.apimongo.APIUsuariosMongo.controllers;

import com.apimongo.APIUsuariosMongo.constants.Constants;
import com.apimongo.APIUsuariosMongo.models.User;
import com.apimongo.APIUsuariosMongo.services.UserService;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(Constants.API_USERS)
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping(Constants.API_USERS + "/{id}")
    public ResponseEntity<Optional<User>> findById(@PathVariable("id") String id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @PostMapping(Constants.API_USERS)
    public ResponseEntity<User> save(@RequestBody User user) {
        return ResponseEntity.status(201).body(userService.save(user));
    }

    @PutMapping(Constants.API_USERS)
    public ResponseEntity<User> update(@RequestBody User user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @DeleteMapping(Constants.API_USERS + "/{id}")
    public ResponseEntity<User> delete(@PathVariable("id") String id) {
        userService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
