package com.example.mohamedg.loginactivity_mvp.model;

import java.util.ArrayList;

public class Databs {
 public   ArrayList<ICustomer> Getcustomers()
 {
     ArrayList<ICustomer> customers=new ArrayList<>();
     customers.add(new Customer("https://zeafancom.000webhostapp.com/kids_story_img/file_0.png","mohamed","age :25"));
     customers.add(new Customer("https://zeafancom.000webhostapp.com/kids_story_img/file_1.png","Ahmed","age :32"));
     customers.add(new Customer("https://zeafancom.000webhostapp.com/kids_story_img/file_2.png","Sayed","age :45"));
     customers.add(new Customer("https://zeafancom.000webhostapp.com/kids_story_img/file_3.png","nader","age :47"));
     customers.add(new Customer("https://zeafancom.000webhostapp.com/kids_story_img/file_4.png","Amir","age :16"));
     customers.add(new Customer("https://zeafancom.000webhostapp.com/kids_story_img/file_5.png","Bassem","age :12"));
     customers.add(new Customer("https://zeafancom.000webhostapp.com/kids_story_img/file_0.png","mohamed","age :25"));
     customers.add(new Customer("https://zeafancom.000webhostapp.com/kids_story_img/file_1.png","Ahmed","age :32"));
     customers.add(new Customer("https://zeafancom.000webhostapp.com/kids_story_img/file_2.png","Sayed","age :45"));
     customers.add(new Customer("https://zeafancom.000webhostapp.com/kids_story_img/file_3.png","nader","age :47"));
     customers.add(new Customer("https://zeafancom.000webhostapp.com/kids_story_img/file_4.png","Amir","age :16"));
     customers.add(new Customer("https://zeafancom.000webhostapp.com/kids_story_img/file_5.png","Bassem","age :12"));
return customers;
 }


}
