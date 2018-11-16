package com.endava.amcourse.mvc.service;

import com.endava.amcourse.mvc.dto.UserDto;
import com.endava.amcourse.mvc.model.Status;
import com.endava.amcourse.mvc.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUsers();

    Optional<User> getUserById(int id);

    List<User> getUsersByStatus(Status status);

    boolean validateUser(UserDto userDto);

}