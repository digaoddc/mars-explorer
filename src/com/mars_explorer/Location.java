package com.mars_explorer;

public class Location {
  private int x, y;
  private String direction;
  //  private Direction direction;

  public Location(int x, int y, String direction){
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public void Move(String order){
	  if(order == "M"){
		  this.MovePosition();
	  }else{
	    // TODO
	  }
  }

  @Override public String toString() {
	String formattedOutput = ( this.x + " " + this.y + " " + this.direction);
	return formattedOutput;
  }

  private void MovePosition(){
	  switch (this.direction) {
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
