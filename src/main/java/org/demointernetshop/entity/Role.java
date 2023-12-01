package org.demointernetshop.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;
    @OneToMany(mappedBy = "role")
    private List<User> users;
}
