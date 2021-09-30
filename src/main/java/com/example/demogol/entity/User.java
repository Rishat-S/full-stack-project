package com.example.demogol.entity;

import com.example.demogol.entity.enums.Role;

import javax.persistence.PrePersist;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    private Long id;
    private String name;
    private String username;
    private String lastname;
    private String email;
    private String bio;
    private String password;

    private Set<Role> role = new HashSet<>();
    private List<File> files = new ArrayList<>();
    private LocalDateTime createDate;

    @PrePersist
    protected void onCreate() {
        this.createDate = LocalDateTime.now();
    }
}
