import {Component, OnInit} from '@angular/core';
import * as $ from 'jquery';

declare function initializeMainJS(): any;

@Component({
  selector: 'app-root',
 templateUrl: './app.component.html',
 styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'Mobile Shop';

  ngOnInit(): any {
    initializeMainJS();
  }
}
