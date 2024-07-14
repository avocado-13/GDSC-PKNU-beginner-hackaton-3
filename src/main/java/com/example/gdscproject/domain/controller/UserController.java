package com.example.gdscproject.domain.controller;

import com.example.gdscproject.domain.service.UserService;
import com.example.gdscproject.domain.dto.request.UserCreateRequest;
import com.example.gdscproject.domain.dto.request.UserUpdateRequest;
import com.example.gdscproject.domain.dto.response.UserFindResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/")
    public Long addUser(@RequestBody UserCreateRequest userCreateRequest){
        return userService.save(userCreateRequest);
    }

    @GetMapping("/{id}")
    public UserFindResponse findUser(@PathVariable Long id){
        return userService.findById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody UserUpdateRequest userUpdateRequest){
        userService.update(id, userUpdateRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userService.deleteById(id);
    }

}
