import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CuisineListComponent } from './cuisine-list.component';
import { RestaurantCuisineComponent } from './restaurant-cuisine.component';
import { RestaurantDetailsComponent } from './restaurant-details.component';

const routes: Routes = [
  { path: '', component: CuisineListComponent },
  { path: 'restaurants/:cuisines', component: RestaurantCuisineComponent },
  { path: 'restaurants/:restaurantID', component: RestaurantDetailsComponent },
  { path: '**', redirectTo: '', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}