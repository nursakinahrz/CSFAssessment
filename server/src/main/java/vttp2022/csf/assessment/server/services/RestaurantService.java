package vttp2022.csf.assessment.server.services;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vttp2022.csf.assessment.server.models.Comment;
import vttp2022.csf.assessment.server.models.Restaurant;
import vttp2022.csf.assessment.server.repositories.MapCache;
import vttp2022.csf.assessment.server.repositories.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepository restaurantRepo;

	@Autowired
	private MapCache mapCache;

	// TODO Task 2 
	// Use the following method to get a list of cuisines 
	// You can add any parameters (if any) and the return type 
	// DO NOT CHNAGE THE METHOD'S NAME
	public List<Restaurant> getCuisines(String cuisines) {
		// Implmementation in here
		List<String> includes = new LinkedList<>();
        List<String> excludes = new LinkedList<>();

        for (String w : cuisines.split("/")) {
            System.out.println(w);
            if (w.startsWith("-")) {
                String[] exW = w.split("-");
                System.out.println("ex " + exW[1]);
                excludes.add(exW[1]);
            } else {
                System.out.println("in " + w);
                includes.add(w);
            }
        }
		
		return null;

    }



		
	// }

	// TODO Task 3 
	// Use the following method to get a list of restaurants by cuisine
	// You can add any parameters (if any) and the return type 
	// DO NOT CHNAGE THE METHOD'S NAME
	public List<Restaurant> getRestaurantsByCuisine(String cuisine) {
		return null;
		// Implmementation in here
		
	}

	// TODO Task 4
	// Use this method to find a specific restaurant
	// You can add any parameters (if any) 
	// DO NOT CHNAGE THE METHOD'S NAME OR THE RETURN TYPE
	public Optional<Restaurant> getRestaurant() {
	
		return null;
		// Implmementation in here
		
	}

	// TODO Task 5
	// Use this method to insert a comment into the restaurant database
	// DO NOT CHNAGE THE METHOD'S NAME OR THE RETURN TYPE
	public void addComment(Comment comment) {
		// Implmementation in here
		
	}
	//
	// You may add other methods to this class
}
