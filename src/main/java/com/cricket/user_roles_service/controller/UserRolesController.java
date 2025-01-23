package com.cricket.user_roles_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.user_roles_service.service.UserRolesService;

@RestController  // Add this annotation to mark the class as a controller
@RequestMapping("/api/user-roles")  // Define the base path for the controller
public class UserRolesController {
    
	@Autowired
    private UserRolesService userRolesService;

    @GetMapping("/{userId}/roles")
    public List<String> getRolesByUserId(@PathVariable Integer userId) {
        return userRolesService.getRolesByUserId(userId);
    }
}