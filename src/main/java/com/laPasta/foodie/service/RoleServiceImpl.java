package com.laPasta.foodie.service;

import com.laPasta.foodie.dto.RoleRequestdto;
import com.laPasta.foodie.dto.RoleResponsedto;
import com.laPasta.foodie.entity.Roles;
import com.laPasta.foodie.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository rolerepo;

    @Override
    public RoleResponsedto createRole(RoleRequestdto request) {

        try {
            Roles rolentity = Roles.builder().
                    roleName(request.getRoleName()).
                    description(request.getDescription()).build();

            rolerepo.save(rolentity);

            return RoleResponsedto.builder().id(rolentity.getId()).roleName(rolentity.getRoleName()).description(rolentity.getDescription()).build();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public RoleResponsedto updateRoleById(Long id, RoleRequestdto request) {
        Roles role = rolerepo.findById(id).orElseThrow(() -> new RuntimeException("Role not found"));

        role.setRoleName(request.getRoleName());
        role.setDescription(request.getDescription());

        Roles updatedRole = rolerepo.save(role);
        return RoleResponsedto.builder().id(updatedRole.getId()).roleName(updatedRole.getRoleName()).description(updatedRole.getDescription()).build();
    }
}
