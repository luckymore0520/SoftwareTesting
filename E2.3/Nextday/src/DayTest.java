import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DayTest {
	Day day;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIncrement() {
		day = new Day(30,new Month(1,new Year(2001)));
		day.increment();
		day = new Day(31,new Month(1,new Year(2001)));
		day.increment();
	}

	@Test
	public void testIsValid() {
		fail("Not yet implemented");
	}

	@Test
	public void testDay() {
		day = new Day(1,new Month(1,new Year(0)));
		
		day = new Day(-1,new Month(1,new Year(2001)));
		
		day = new Day(33,new Month(1,new Year(2001)));
		
	}

	@Test
	public void testSetDay() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDay() {
		day = new Day(1,new Month(1,new Year(2000)));
		day.getDay();
	}

	@Test
	public void testEqualsObject() {
		day = new Day(1,new Month(1,new Year(2000)));
		day.equals("");
		day.equals(new Day(1,new Month(1,new Year(2000))));
		day.equals(new Day(2,new Month(1,new Year(2000))));
		day.getCurrentPos();
	}

}
