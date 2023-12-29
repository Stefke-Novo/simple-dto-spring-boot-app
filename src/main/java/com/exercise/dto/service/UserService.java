package com.exercise.dto.service;

import com.exercise.dto.dto.UserLocationDTO;
import com.exercise.dto.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public List<UserLocationDTO> getAllusersLocation(){
        return this.userRepository.findAll().stream().map(UserLocationDTO::convertEntityToDto).toList();
    }
}
