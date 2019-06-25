package com.example.repository;

import org.springframework.stereotype.Repository;

import com.example.model.Role;

@Repository
public interface RoleRepository  {
    Role findByRole(String role);
}
