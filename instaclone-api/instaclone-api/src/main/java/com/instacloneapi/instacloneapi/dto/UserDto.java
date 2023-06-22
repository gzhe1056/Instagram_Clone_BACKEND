package com.instacloneapi.instacloneapi.dto;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class UserDto {
    private Integer id;
    private String username;
    private String email;
    private String name;
    private String userImage;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return Objects.equals(id, userDto.id) && Objects.equals(username, userDto.username) && Objects.equals(email, userDto.email) && Objects.equals(name, userDto.name) && Objects.equals(userImage, userDto.userImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email, name, userImage);
    }
}