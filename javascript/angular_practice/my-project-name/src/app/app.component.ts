import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = "First Angular Project";
  name: string = "Desirée"; 
  itemList: string[] = ["Denim", "feathers", "leather", "chiffon"];
  rectangle = {
    length: 5, 
    width: 6, 
    area: function () {
      return this.length * this.width;
    }
  }
}
