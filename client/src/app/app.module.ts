import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';


import { AppComponent } from './app.component';
import { CuisineListComponent } from './components/cuisine-list.component';
import { RestaurantCuisineComponent } from './components/restaurant-cuisine.component';
import { RestaurantDetailsComponent } from './components/restaurant-details.component';

@NgModule({
  declarations: [
    AppComponent,
    CuisineListComponent,
    RestaurantCuisineComponent,
    RestaurantDetailsComponent,
    
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,



  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
