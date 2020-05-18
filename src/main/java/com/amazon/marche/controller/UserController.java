package com.amazon.marche.controller;

import com.amazon.marche.model.User;
import com.amazon.marche.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping(value = "/all", headers = "Accept=application/json")
    public List<User> getAllUsers(){
        return userService.getAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUserById(@PathVariable("id") int id){
        User user = userService.getById(id);
        if(user == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(user, HttpStatus.FOUND);
    }

    @PostMapping(value = "/create", headers = "Accept=application/json")
    public ResponseEntity<User> saveUser(@RequestBody User user){
       User savedUser = userService.save(user);
        if(savedUser == null)
            return new ResponseEntity<>(HttpStatus.CONFLICT);
       return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @PutMapping(value = "/", headers = "Accept=application/json")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        User updatedUser = userService.update(user);
        if(updatedUser == null)
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}", headers = "Accept=application/json")
    public ResponseEntity<String> deleteUser(@PathVariable("id") int id){
        int deleteResponse = userService.delete(id);
        if(deleteResponse == 0)
            return ResponseEntity.badRequest()
                        .body("Couldn't delete user with id: " + id);
        return ResponseEntity.status(HttpStatus.OK)
                .body("Deleted user: " + id);
    }
}
