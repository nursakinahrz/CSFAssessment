import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { Restaurant } from '../models';
import { ActivatedRoute } from '@angular/router';
import { RestaurantService } from '../restaurant-service';


@Component({
  selector: 'app-cuisine-list',
  templateUrl: './cuisine-list.component.html',
  styleUrls: ['./cuisine-list.component.css']
})
export class CuisineListComponent implements OnInit {
 

	// TODO Task 2
	// For View 1

  constructor(
    private restaurantService: RestaurantService,
    private activatedRoute: ActivatedRoute
  ) {}

  cuisines!: string
  restaurants: Restaurant[]=[];
  sub$!: Subscription;

  ngOnInit(): void {

    this.sub$ = this.activatedRoute.params.subscribe((params) => {
      this.cuisines = params['cuisines'];
    });

    this.getRestaurantsByCuisine();

    
  }

  getRestaurantsByCuisine() {
    this.restaurantService
      .getRestaurantsByCuisine(this.cuisines)
      .then((resp) => {
        this.restaurants = resp;
      })
      .catch((err) => {
        console.error(err);
      });
  }





}
