package org.demointernetshop.entity;

import java.time.LocalDateTime;

public class User {
    private Integer id;
    private String username;
    private String password;
    private Role role;
    private LocalDateTime createData;
    private LocalDateTime lastVisitData;
}
