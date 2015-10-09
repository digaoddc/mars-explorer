package com.mars_explorer;

public class Main {

  public static void main(String[] args) {

    // Simulate an api call
    Location location = new Location(1, 2, "N");
    String[] movements = (new String[]{"L", "M","L", "M","L", "M","L", "M","M" });
    location.Move(movements);

    System.out.println(location.toString());
  }

}
