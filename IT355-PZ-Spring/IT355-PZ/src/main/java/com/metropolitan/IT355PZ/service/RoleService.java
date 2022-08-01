package com.metropolitan.IT355PZ.service;

import com.metropolitan.IT355PZ.entity.Role;
import java.util.List;

public interface RoleService {
    List<Role> findAll();
    Role findById(Integer roleId);
    Role save(Role role);
    Role update(Role role);
    void deleteById(Integer roleId);
}