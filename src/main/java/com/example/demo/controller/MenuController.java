package com.example.demo.controller;

import com.example.demo.entity.MenuItem;
import com.example.demo.repository.MenuRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuController {
    private final MenuRepository menuRepository;

    public MenuController(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    // Get all menu items
    @GetMapping
    public List<MenuItem> getMenuItems() {
        return menuRepository.findAll();
    }

    // Add a new menu item
    @PostMapping
    public MenuItem addMenuItem(@RequestBody MenuItem menuItem) {
        return menuRepository.save(menuItem);
    }
}

