package com.laPasta.foodie.controllers;


import com.laPasta.foodie.common.ApiResponse;
import com.laPasta.foodie.dto.RoleRequestdto;
import com.laPasta.foodie.dto.RoleResponsedto;
import com.laPasta.foodie.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/roles")
@Slf4j
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;

    @PostMapping
    public ResponseEntity<ApiResponse<RoleResponsedto>> createRole (@RequestBody RoleRequestdto request){

       RoleResponsedto roleCreated = roleService.createRole(request);

        return ResponseEntity.ok(new ApiResponse<>(true, "Role created successfully" , roleCreated));

    }

    @PatchMapping("/id/{id}")
    public ResponseEntity<ApiResponse<RoleResponsedto>> updateRoleById(@PathVariable Long id,  @RequestBody RoleRequestdto request){

        RoleResponsedto updatedrole = roleService.updateRoleById(id, request);

        return ResponseEntity.ok(new ApiResponse<>(true,"Role updated successfully",updatedrole));

    }

}
