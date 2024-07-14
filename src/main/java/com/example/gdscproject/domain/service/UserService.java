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

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;


    @Transactional
    public Long save(UserCreateRequest userCreateRequest){
        return userRepository.save(userCreateRequest.toEntity(userCreateRequest)).getId();
    }

    @Transactional
    public UserFindResponse findById(Long id){
        return UserFindResponse.of(userRepository.findById(id).get());
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
