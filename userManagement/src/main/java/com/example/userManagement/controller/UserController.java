package com.example.userManagement.controller;

import com.example.userManagement.model.User;
import com.example.userManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/userManagement")
public class UserController {
    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("findAllUser")
    public List<User> findAllUsers()
    {
        return userService.findAll();
    }

    @GetMapping("id/{id}/findById")
    public User getById(@PathVariable int id)
    {
        return userService.getUserById(id);
    }
    @PostMapping("AddUser")
    public void AddUser(@RequestBody User user)
    {
        userService.addUser(user);
    }
    @PutMapping("UpdateById/id/{id}")
    public void UpdateUser(@PathVariable int id,@RequestBody User user)
    {
        userService.UpdateUser(id,user);

    }
    @DeleteMapping("Delete-User/id/{id}")
    public void DeleteUser(@PathVariable int id)
    {
        userService.deleteUser(id);
    }


}
