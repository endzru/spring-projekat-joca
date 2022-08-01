package com.metropolitan.IT355PZ.repository;

import com.metropolitan.IT355PZ.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByIsAdmin(boolean isAdmin);
}