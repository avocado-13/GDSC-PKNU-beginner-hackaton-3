package com.example.gdscproject.domain.service;

import com.example.gdscproject.domain.dto.request.UserCreateRequest;
import com.example.gdscproject.domain.dto.request.UserUpdateRequest;
import com.example.gdscproject.domain.dto.response.UserFindResponse;
import com.example.gdscproject.model.entity.User;
import com.example.gdscproject.model.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional
    public Long save(UserCreateRequest userCreateRequest){
        return userRepository.save(userCreateRequest.toEntity(userCreateRequest)).getId();
    }

    @Transactional
    public UserFindResponse findById(Long id){
        return modelMapper.map(userRepository.findById(id), UserFindResponse.class);
    }

    @Transactional
    public void update(Long id, UserUpdateRequest userUpdateRequest){
        User user = userRepository.findById(id).orElseThrow(()->new RuntimeException(id + " User not found"));
        user.update(userUpdateRequest.getName(), userUpdateRequest.getEmail(), userUpdateRequest.getAge(), user.getJob());
    }

    @Transactional
    public void deleteById(Long id){
        userRepository.deleteById(id);
    }



}
