package com.sprinboot_crud.sprinboot_crud.service;

import com.sprinboot_crud.sprinboot_crud.dto.UserDTO;
import com.sprinboot_crud.sprinboot_crud.model.User;
import com.sprinboot_crud.sprinboot_crud.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserDTO> getUsers() {
        List<User> userList = userRepo.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDTO>>() {
        }.getType());
    }

    public UserDTO addUser(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public String updateUser(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
        return "User Updated..!";
    }

    public String deleteUser(Integer userID) {
        // userRepo.delete(modelMapper.map(userDTO, User.class));
        userRepo.deleteById(userID);
        return "User Deleted..!";
    }

    public UserDTO getUserById(Integer userId) {
        User user = userRepo.getUserById(userId);
        return modelMapper.map(user, UserDTO.class);
    }
}
