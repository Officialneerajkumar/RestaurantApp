package com.Restaurant.RestaurantApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Restaurant{
    private int restaurantId;
    private String name;
    private String address;
    private int number;
    private String speciality;
    private int totalStaff;
}
