package br.com.explorer;

import java.util.Iterator;

public class Location {
  private int x, y;
  private Direction direction;

  public Location(int x, int y, String direction){
    this.x = x;
    this.y = y;
    Direction d = new Direction(direction);
    this.direction = d;
  }

  public void Move(String[] orders){
    for (String order : orders) {
      if(order.equals("M")){
        this.MovePosition();
      }else{
    	  moveTo(order);
      }
    }
  }

  @Override public String toString() {
    String formattedOutput = ( this.x + " " + this.y + " " + this.direction.getDirection());
    return formattedOutput;
  }

  private void moveTo(String dir){
   if(dir.equals("R")){
      this.direction.turnRight();
    }else{
      this.direction.TurnLeft();
    }
  }

  private void MovePosition(){
    switch (this.direction.getDirection()) {
      case "N":
        this.y++;
        break;
      case "S":
        this.y--;
        break;
      case "E":
        this.x++;
        break;
      case "W":
        this.x--;
        break;
    }
  }

}
