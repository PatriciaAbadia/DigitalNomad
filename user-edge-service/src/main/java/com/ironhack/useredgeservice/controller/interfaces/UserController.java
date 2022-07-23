package com.ironhack.useredgeservice.controller.interfaces;

import com.ironhack.useredgeservice.controller.dto.UserDTO;
import com.ironhack.useredgeservice.model.User;

import java.util.List;

public interface UserController {
    UserDTO register(UserDTO userDTO);
    List<UserDTO> findAll();
    UserDTO login(User user);
}
