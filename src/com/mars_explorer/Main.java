package com.mars_explorer;

public class Main {

  public static void main(String[] args) {

    // Simulate an api call 
    Location location = new Location(0, 0, "E");
    location.Move("R");
    location.Move("M");
    location.Move("M");
    location.Move("M");

    System.out.println(location.toString());
  }

}
