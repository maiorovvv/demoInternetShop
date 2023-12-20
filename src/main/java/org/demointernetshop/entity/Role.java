package org.demointernetshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;
import java.util.Locale;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;
    @OneToMany(mappedBy = "role")
    private List<User> users;

    @Override
    public String getAuthority() {
        return "ROLE_" + name.toUpperCase();
    }
}
