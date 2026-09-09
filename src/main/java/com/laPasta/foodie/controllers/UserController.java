package com.laPasta.foodie.controllers;


import com.laPasta.foodie.common.ApiResponse;
import com.laPasta.foodie.dto.UserRequestdto;
import com.laPasta.foodie.dto.UserResponsedto;
import com.laPasta.foodie.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@Slf4j
@RequiredArgsConstructor

public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<ApiResponse<UserResponsedto>> createUser(@Valid @RequestBody UserRequestdto request){



        return null;

    }



}
