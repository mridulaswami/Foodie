package com.laPasta.foodie.service;

import com.laPasta.foodie.dto.RoleRequestdto;
import com.laPasta.foodie.dto.RoleResponsedto;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {

    RoleResponsedto createRole(RoleRequestdto request);

    RoleResponsedto updateRoleById(Long id, RoleRequestdto request);
}
