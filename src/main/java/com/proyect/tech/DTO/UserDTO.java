// UserDTO.java  — lo que devuelves, nunca la entidad directa
package com.proyect.tech.DTO;

import com.proyect.tech.Model.User;
import com.proyect.tech.Model.Role;

public class UserDTO {
    private Long id;
    private Long clientId;
    private String name;
    private String email;
    private String address;
    private String phone;
    private Role role;

    public UserDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.role = user.getRole();
        this.address = user.getAddress();
        this.phone = user.getPhone();
        if (user.getClient() != null) {
            this.clientId = user.getClient().getId();
        }
    }

    public Long getId() {
        return id;
    }

    public Long getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public Role getRole() {
        return role;
    }
}