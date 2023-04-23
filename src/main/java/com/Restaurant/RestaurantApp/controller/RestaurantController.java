package com.Restaurant.RestaurantApp.controller;

import com.Restaurant.RestaurantApp.model.Restaurant;
import com.Restaurant.RestaurantApp.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/Restaurant-app")
public class RestaurantController {

//-get Restaurant by id using GetMapping.
//-get all Reataurant using  GetMapping
//-Add some Restaurant to Restaurant lists using PostMapping
//-update Restaurant information like Specialty.
//-delete Restaurant from the list.

    @Autowired
    private  RestaurantService restaurantService;

    @GetMapping(value = "/get-by-id")
    public Restaurant getRestaurantById(@RequestParam int id){
        return restaurantService.getRestaurantById(id);
    }

    @GetMapping("/find-all")
    public List<Restaurant> findAll(){
        return restaurantService.findall();
    }
    @PostMapping("/add")
    public void addRestaurant(@RequestBody Restaurant restaurant){
        restaurantService.addRestaurant(restaurant);
    }

    @PutMapping("/update-info")
    public String updateRestaurantInfo(@RequestParam int id,@RequestBody Restaurant restaurant){
        return restaurantService.updateInfo(id,restaurant);
    }

    @DeleteMapping(value = "/delete")
    public String deleteRestaurant(@RequestParam int id){
        return restaurantService.deleteRestaurant(id);
    }
}
