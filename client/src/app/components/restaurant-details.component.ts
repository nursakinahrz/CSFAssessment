import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { RestaurantService } from '../restaurant-service';

@Component({
  selector: 'app-restaurant-details',
  templateUrl: './restaurant-details.component.html',
  styleUrls: ['./restaurant-details.component.css']
})
export class RestaurantDetailsComponent implements OnInit {
  
  form!:FormGroup

  constructor(private fb: FormBuilder, private restaurantSvc: RestaurantService) {}
	
	// TODO Task 4 and Task 5
	// For View 3

  ngOnInit(): void {
    this.form = this.createForm();
   
  }

  createForm(): FormGroup<any> {
   return this.fb.group({
    name: this.fb.control ('', [Validators.required]),
    rating: this.fb.control('', [Validators.required]),
    comments: this.fb.control('', [Validators.required])


   })
  }





}
