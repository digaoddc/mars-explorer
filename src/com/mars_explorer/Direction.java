package com.mars_explorer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Direction {
  Map<String,Integer> Positions = new HashMap<String, Integer>(){{
    put("N",0); put("E",90); put("S", 180);put("W", 270);}
  };

  private String direction;

  public String getDirection() {
    return direction;
  }

  public Direction(String direction){
    this.direction = direction;
  }

  public void turnRight(){
    int NewCoordinateValue = ( CurrentCoordinate() >= 270 ? 0 : CurrentCoordinate() + 90);
    String newCoordinate = PositionByValue(NewCoordinateValue);

    this.direction = newCoordinate;
  }

  public void TurnLeft(){
    int NewCoordinateValue = ( CurrentCoordinate() == 0 ? 270 : CurrentCoordinate() - 90);
    String newCoordinate = PositionByValue(NewCoordinateValue);

    this.direction = newCoordinate;
  }

  private String PositionByValue(int value){
    String Coordinate = "";
    for (Entry<String, Integer> entry : Positions.entrySet()) {
      if (entry.getValue().equals(value)) {
        Coordinate = entry.getKey();
      }
    }
    return Coordinate;
  }

  private int CurrentCoordinate(){
    return Positions.get(this.direction);
  }
}
