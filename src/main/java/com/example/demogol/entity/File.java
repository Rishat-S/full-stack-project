package com.example.demogol.entity;

import javax.persistence.PrePersist;
import java.time.LocalDateTime;

public class File {
    private Long id;
    private String name;
    private String size;

    private User user;
    private LocalDateTime createDate;

    @PrePersist
    protected void onCreate() {
        this.createDate = LocalDateTime.now();
    }

}
