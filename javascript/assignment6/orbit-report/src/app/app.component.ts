import { Component } from '@angular/core';
import { Satellite } from './satellite';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'orbit-report';
  sourceList: Satellite[];
  displayList: Satellite[];
  constructor() {
    this.sourceList = [];
    this.displayList = [];
    let satellitesUrl = 'https://handlers.education.launchcode.org/static/satellites.json';
 
    window.fetch(satellitesUrl).then(function(response) {
       response.json().then(function(data) {
 
          let fetchedSatellites = data.satellites;
          // TODO: loop over satellites
          for(let i = 0; i < fetchedSatellites.length; i ++)
          {
            // TODO: create a Satellite object using new Satellite(fetchedSatellites[i].name, fetchedSatellites[i].type, fetchedSatellites[i].launchDate, fetchedSatellites[i].orbitType, fetchedSatellites[i].operational);
            let satellite = new Satellite(
              fetchedSatellites[i].name, 
              fetchedSatellites[i].type, 
              fetchedSatellites[i].launchDate, 
              fetchedSatellites[i].orbitType, 
              fetchedSatellites[i].operational)

            this.sourceList.push(satellite)
          }
          // TODO: add the new Satellite object to sourceList using: this.sourceList.push(satellite);
                // make a copy of the sourceList to be shown to the user
          this.displayList = this.sourceList.slice(0);
       }.bind(this));
    }.bind(this));

 
 };

 search(searchTerm: string): void {
  let matchingSatellites: Satellite[] = [];
  searchTerm = searchTerm.toLowerCase();
  for(let i=0; i < this.sourceList.length; i++) {
    let name = this.sourceList[i].name.toLowerCase();
    let type = this.sourceList[i].type.toLowerCase();
    if (name.indexOf(searchTerm) >= 0) {
        matchingSatellites.push(this.sourceList[i]);
    } else if (type.indexOf(searchTerm) >= 0) {
      matchingSatellites.push(this.sourceList[i]);
  }
  }
  // assign this.displayList to be the array of matching satellites
  // this will cause Angular to re-make the table, but now only containing matches
  this.displayList = matchingSatellites;
} // this doesn't seem to be working. I tried it inside the constructor, but that didn't work either.


}