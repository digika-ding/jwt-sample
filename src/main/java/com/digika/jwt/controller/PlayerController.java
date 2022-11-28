package com.digika.jwt.controller;

import com.digika.jwt.dto.Player;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("players")
public class PlayerController {
    @GetMapping("list")
    public List<Player> listPlayers() {
        return List.of(new Player("0123456789", "Bob"), new Player("9876543210", "Alice"));
    }
}
