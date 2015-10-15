package br.com.explorer;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class DirectionTest {

  @Test
  public void turnRightWithNorth() {
    Direction d = new Direction("N");
    d.turnRight();
    assertEquals(d.getDirection(), "E");
  }

  @Test
  public void turnRightWithSouth() {
    Direction d = new Direction("S");
    d.turnRight();
    assertEquals(d.getDirection(), "W");
  }

  @Test
  public void turnRightWithEast() {
    Direction d = new Direction("E");
    d.turnRight();
    assertEquals(d.getDirection(), "S");
  }

  @Test
  public void turnRightWithWest() {
    Direction d = new Direction("W");
    d.turnRight();
    assertEquals(d.getDirection(), "N");
  }

  @Test
  public void turnLeftWithNorth() {
    Direction d = new Direction("N");
    d.TurnLeft();
    assertEquals(d.getDirection(), "W");
  }

  @Test
  public void turnLeftWithSouth() {
    Direction d = new Direction("S");
    d.TurnLeft();
    assertEquals(d.getDirection(), "E");
  }

  @Test
  public void turnLeftWithEast() {
    Direction d = new Direction("W");
    d.TurnLeft();
    assertEquals(d.getDirection(), "S");
  }

  @Test
  public void turnLeftWithWest() {
    Direction d = new Direction("E");
    d.TurnLeft();
    assertEquals(d.getDirection(), "N");
  }

}
