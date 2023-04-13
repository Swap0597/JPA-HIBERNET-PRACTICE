package com.example.JPABasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/get-by-id")
    public User getById(@RequestParam("id") Integer id){
        return userService.getById(id);
    }

    @GetMapping("/getAll")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @DeleteMapping("/delete-all-user")
    public String deleteAllUser(){
        return userService.deleteAllUser();
    }

    @DeleteMapping("/detete-user-by-id")
    public String deleteUserById(@RequestParam("id") Integer id){
        return userService.deleteUserById(id);
    }

    @PutMapping("/update-name-with-id")
    public void updateNameWithId(@RequestParam("id") Integer id, @RequestParam("name") String name){
         userService.updateNameWithId(id, name);
    }
}
