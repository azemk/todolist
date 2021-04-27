package com.example.demo.service;

import com.example.demo.model.Task;
import com.example.demo.model.UserRole;

import java.util.List;

public interface UserRoleService {
public UserRole create (UserRole userRole);
public UserRole update (UserRole userRole);
public List<UserRole> getAll();
void delete (Long id);

}
