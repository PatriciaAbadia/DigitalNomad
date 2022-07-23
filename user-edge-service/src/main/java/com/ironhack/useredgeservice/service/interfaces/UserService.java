package com.ironhack.useredgeservice.service.interfaces;


import com.ironhack.useredgeservice.controller.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO store(UserDTO user);
    List<UserDTO> findAll();
}
