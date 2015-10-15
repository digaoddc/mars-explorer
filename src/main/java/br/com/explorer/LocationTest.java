package br.com.explorer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LocationTest {

//  @Before
//  public void setUp() throws Exception {
//  }

  @Test
  public void MoveStartingNorth() {
    Location location = new Location(1, 2, "N");
    String[] movements = (new String[]{"L", "M","L", "M","L", "M","L", "M","M" });
    location.Move(movements);
    assertEquals(location.toString(), "1 3 N");
  }

  @Test
  public void MoveStartingEast() {
    Location location = new Location(3, 3, "E");
    String[] movements = (new String[]{"M", "M","R","M","M", "R", "M", "R", "R", "M" });
    location.Move(movements);
    assertEquals(location.toString(), "5 1 E");
  }

}
