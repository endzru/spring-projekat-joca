package com.metropolitan.IT355PZ.service.impl;

import com.metropolitan.IT355PZ.entity.Role;
import com.metropolitan.IT355PZ.repository.RoleRepository;
import com.metropolitan.IT355PZ.service.RoleService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class RoleServiceImpl implements RoleService {
    
    private final RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findById(Integer roleId) {
        return roleRepository.findAll().get(roleId);
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role update(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteById(Integer roleId) {
        roleRepository.deleteById(roleId);
    }
    
}