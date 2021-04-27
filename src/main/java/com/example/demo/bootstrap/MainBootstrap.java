package com.example.demo.bootstrap;

import com.example.demo.model.Task;
import com.example.demo.model.User;
import com.example.demo.model.UserRole;
import com.example.demo.repository.TaskRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.UserRoleRepository;
import com.example.demo.service.UserRoleService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

@Component
public class MainBootstrap implements ApplicationRunner {
    @Autowired
    UserService userService;
    @Autowired
    UserRoleService userRoleService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        try{
            User user = new User ("azem3","123");
            userService.create(user);
            UserRole userRole = new UserRole("ROLE_USER",user);
            userRoleService.create(userRole);


        }catch (Exception exception){
            exception.printStackTrace();

        }finally {
            System.out.println("Your app is working !");
        }
    }
}
