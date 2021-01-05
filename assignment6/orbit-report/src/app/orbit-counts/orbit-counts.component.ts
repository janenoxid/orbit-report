import { Component, OnInit, Input } from '@angular/core';
import { Satellite } from '../satellite';

@Component({
  selector: 'app-orbit-counts',
  templateUrl: './orbit-counts.component.html',
  styleUrls: ['./orbit-counts.component.css']
})
export class OrbitCountsComponent implements OnInit {

  @Input() satellites: Satellite[];
  constructor() { }

  ngOnInit() {
  }

  // How do I do the total count vs. the per-item count?
  // Maybe I borrow some ideas from the search function in order to make sure the type is the same.

  
  countType(type: string): number {
    let count: number = 0;
    for(let i = 0; i < this.satellites.length; i++){
      let objectType = this.satellites[i].type.toLowerCase()
      if (objectType === type.toLowerCase()){
        count ++; 
      }
    }
    return count;

    

/* Here's an example from the internet:

function CountRows() {
        var totalRowCount = 0;
        var rowCount = 0;
        var table = document.getElementById("tblCustomers");
        var rows = table.getElementsByTagName("tr")
        for (var i = 0; i < rows.length; i++) {
            totalRowCount++;
            if (rows[i].getElementsByTagName("td").length > 0) {
                rowCount++;
            }
        }
        var message = "Total Row Count: " + totalRowCount;
        message += "\nRow Count: " + rowCount;
        alert(message);
*/
 }



}
