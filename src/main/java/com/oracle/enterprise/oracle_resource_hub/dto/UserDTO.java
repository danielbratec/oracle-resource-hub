package com.oracle.enterprise.resourcehub.dto;

import com.oracle.enterprise.resourcehub.entity.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private Long id;
    private String username;
    private Role role;
}
