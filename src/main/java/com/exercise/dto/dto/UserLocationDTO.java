package com.exercise.dto.dto;

import com.exercise.dto.model.User;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Getter
public class UserLocationDTO implements Serializable {
    private Long userId;
    private String email;
    private String place;
    private double longitude;
    private double latitude;
    private UserLocationDTO( User user){
        this.userId=user.getId();
        this.email=user.getEmail();
        this.place=user.getLocation().getPlace();
        this.longitude=user.getLocation().getLongitude();
        this.latitude=user.getLocation().getLatitude();
    }
    public static UserLocationDTO convertEntityToDto(User user){
        return new UserLocationDTO(user);
    }
}
