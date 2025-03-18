package com.example.demo.controller;

import com.example.demo.entity.Staff;
import com.example.demo.repository.StaffRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffController {
    private final StaffRepository staffRepository;

    public StaffController(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    // Get all staff members
    @GetMapping
    public List<Staff> getAllStaff() {
        return staffRepository.findAll();
    }

    // Add a new staff member
    @PostMapping
    public Staff addStaff(@RequestBody Staff staff) {
        return staffRepository.save(staff);
    }
}
