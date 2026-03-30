package com.sprinboot_crud.sprinboot_crud.controller;

import com.sprinboot_crud.sprinboot_crud.dto.UserDTO;
import com.sprinboot_crud.sprinboot_crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/")

public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getusers")
    public List<UserDTO> getUser() {
        return userService.getUsers();
    }

    @PostMapping("/adduser")
    public UserDTO addUser(@RequestBody UserDTO userDTO) {
        return userService.addUser(userDTO);
    }

    @PutMapping("/updateuser")
    public String updateUser(@RequestBody UserDTO userDTO) {
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteuser/{userid}")
    public String deleteUserById(@PathVariable Integer userid) {
        return userService.deleteUser(userid);
    }

    @GetMapping("/getuserbyid/{userid}")
    public UserDTO getUserById(@PathVariable Integer userid){
        return userService.getUserById(userid);
    }
}
