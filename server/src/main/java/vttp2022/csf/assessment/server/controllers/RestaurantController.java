package vttp2022.csf.assessment.server.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vttp2022.csf.assessment.server.models.Restaurant;
import vttp2022.csf.assessment.server.services.RestaurantService;


@RestController
@RequestMapping(path="/api/cuisines", produces = MediaType.APPLICATION_JSON_VALUE)
public class RestaurantController {

    @Autowired
private RestaurantService restaurantSvc;

    @GetMapping(path="/api/{cuisine}/restaurants")
    public ResponseEntity<String> getRestaurantsByCuisine(@PathVariable String cuisine) {

        List<Restaurant> restaurants = restaurantSvc.getRestaurantsByCuisine(cuisine);

        return null;

    }

    
    
}
