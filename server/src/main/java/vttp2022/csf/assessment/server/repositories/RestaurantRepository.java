package vttp2022.csf.assessment.server.repositories;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vttp2022.csf.assessment.server.models.Comment;
import vttp2022.csf.assessment.server.models.Restaurant;

@Repository
public class RestaurantRepository {

	// TODO Task 2
	// Use this method to retrive a list of cuisines from the restaurant collection
	// You can add any parameters (if any) and the return type 
	// DO NOT CHNAGE THE METHOD'S NAME
	// Write the Mongo native query above for this method
	
	// Mongo native query: 
	// db.restaurant.find({},{cuisine:1, _id:0});
	// [
	//   { cuisine: 'Jewish/Kosher' },
	//   { cuisine: 'Jewish/Kosher' },
	//   { cuisine: 'American ' },
	//   { cuisine: 'American ' },
	//   { cuisine: 'Ice Cream, Gelato, Yogurt, Ices' },
	//   { cuisine: 'American ' },
	//   { cuisine: 'Irish' },
	//   { cuisine: 'American ' },
	//   { cuisine: 'American ' },
	//   { cuisine: 'Chinese' },
	//   { cuisine: 'Jewish/Kosher' },
	//   { cuisine: 'Ice Cream, Gelato, Yogurt, Ices' },
	//   { cuisine: 'Ice Cream, Gelato, Yogurt, Ices' },
	//   { cuisine: 'Hamburgers' },
	//   { cuisine: 'Delicatessen' },
	//   { cuisine: 'Delicatessen' },
	//   { cuisine: 'Bakery' },
	//   { cuisine: 'American ' },
	//   { cuisine: 'American ' },
	//   { cuisine: 'Delicatessen' }
	public List<Restaurant> getCuisines() {
		return null;
		// Implmementation in here

	}
       


	

	// TODO Task 3
	// Use this method to retrive a all restaurants for a particular cuisine
	// You can add any parameters (if any) and the return type 
	// DO NOT CHNAGE THE METHOD'S NAME
	// Write the Mongo native query above for this method
	
	//  Mongo native query:
// db.restaurant.find({ cuisine: "Asian"})
// [
// 	{
// 	  _id: ObjectId("63f82090ef85c6554483dc05"),
// 	  address: {
// 		building: '51',
// 		coord: [ -73.9787406, 40.7611474 ],
// 		street: 'West 52 Street',
// 		zipcode: '10019'
// 	  },
// 	  borough: 'Manhattan',
// 	  cuisine: 'Asian',
// 	  grades: [
// 		{
// 		  date: ISODate("2014-08-12T00:00:00.000Z"),
// 		  grade: 'A',
// 		  score: 11
// 		},
// 		{
// 		  date: ISODate("2013-08-27T00:00:00.000Z"),
// 		  grade: 'A',
// 		  score: 9
// 		},
// 		{
// 		  date: ISODate("2013-04-03T00:00:00.000Z"),
// 		  grade: 'B',
// 		  score: 18
// 		},
// 		{
// 		  date: ISODate("2012-09-20T00:00:00.000Z"),
// 		  grade: 'A',
// 		  score: 12
// 		},
// 		{
// 		  date: ISODate("2011-08-17T00:00:00.000Z"),
// 		  grade: 'A',
// 		  score: 2
// 		}
// 	  ],
	public List<Restaurant> getRestaurantsByCuisine(String cuisines) {
		return null;
		// Implmementation in here

	}

	// TODO Task 4
	// Use this method to find a specific restaurant
	// You can add any parameters (if any) 
	// DO NOT CHNAGE THE METHOD'S NAME OR THE RETURN TYPE
	// Write the Mongo native query above for this method
	
	//  Mongo native query: 
	// db.restaurant.find({name: "Ajisen Ramen"})
// [
// 	{
// 	  _id: ObjectId("63f8209aef85c6554483e699"),
// 	  address: {
// 		building: '14',
// 		coord: [ -73.9985052, 40.7141563 ],
// 		street: 'Mott Street',
// 		zipcode: '10013'
// 	  },
// 	  borough: 'Manhattan',
// 	  cuisine: 'Asian',
// 	  grades: [
// 		{
// 		  date: ISODate("2014-04-08T00:00:00.000Z"),
// 		  grade: 'A',
// 		  score: 12
// 		},
// 		{
// 		  date: ISODate("2013-04-05T00:00:00.000Z"),
// 		  grade: 'A',
// 		  score: 12
// 		},
// 		{
// 		  date: ISODate("2012-02-07T00:00:00.000Z"),
// 		  grade: 'A',
// 		  score: 12
// 		},
// 		{
// 		  date: ISODate("2011-07-07T00:00:00.000Z"),
// 		  grade: 'A',
// 		  score: 9
// 		}
// 	  ],
// 	  name: 'Ajisen Ramen',
// 	  restaurant_id: '40827287'
// 	}
//   ]
  
	public Optional<Restaurant> getRestaurant() {
		return null;
		// Implmementation in here
		
	}

	// TODO Task 5
	// Use this method to insert a comment into the restaurant database
	// DO NOT CHNAGE THE METHOD'S NAME OR THE RETURN TYPE
	// Write the Mongo native query above for this method
	//  
	public void addComment(Comment comment) {
		// Implmementation in here
		
	}
	
	// You may add other methods to this class

}
