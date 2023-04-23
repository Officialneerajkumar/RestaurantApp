package com.Restaurant.RestaurantApp.service;

import com.Restaurant.RestaurantApp.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {

    private static List<Restaurant> restaurants= new ArrayList<>();

    static {
        restaurants.add(new Restaurant(0,"Paradise","Orai",43586,"Jayke Ki yatra",150));
    }

    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }

    public List<Restaurant> findall(){
        return restaurants;
    }

    public Restaurant getRestaurantById(int id) {
        Restaurant restaurant = null;
        for(Restaurant res : restaurants){
            if(res.getRestaurantId()==id){
                restaurant = res;
            }
        }
        return restaurant;
    }

    public String updateInfo(int id, Restaurant newRestaurant) {
        Restaurant restaurant = null;
        for(Restaurant res : restaurants){
            if(res.getRestaurantId()==id){
                res.setRestaurantId(newRestaurant.getRestaurantId());
                res.setName(newRestaurant.getName());
                res.setNumber(newRestaurant.getNumber());
                res.setSpeciality(newRestaurant.getSpeciality());
                res.setAddress(newRestaurant.getAddress());
                res.setTotalStaff(newRestaurant.getTotalStaff());
                restaurant = res;
            }
        }
        if(restaurant!=null){
            return "Information updated successfuly !";
        }else{
            return "Invalid Restaurant Id --> "+ id;
        }
    }

    public String deleteRestaurant(int id) {
        Restaurant restaurant = null;
        for(Restaurant res : restaurants){
            if(res.getRestaurantId()==id){
                restaurant=res;
                restaurants.remove(res);
            }
        }
        if(restaurant!=null){
            return "Restaurant deleted successfuly !";
        }else{
            return "Invalid Restaurant Id --> "+ id;
        }
    }
}
