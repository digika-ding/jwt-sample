package com.digika.jwt.controller;

import com.digika.jwt.dto.UserDataDTO;
import com.digika.jwt.model.AppUser;
import com.digika.jwt.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UserService userService;

    @Inject
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signin")
    public String login(@RequestParam String username, @RequestParam String password) {
        return userService.signin(username, password);
    }

    @PostMapping("/signup")
    public String signup(@RequestBody UserDataDTO user) {
        AppUser appUser = new AppUser();
        appUser.setUsername(user.getUsername());
        appUser.setPassword(user.getPassword());
        appUser.setEmail(user.getEmail());
        appUser.setAppUserRoles(user.getAppUserRoles());
        return userService.signup(appUser);
    }

    @GetMapping("/me")
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    public String whoami(HttpServletRequest req) {

        return userService.whoami(req).toString();
    }
}
