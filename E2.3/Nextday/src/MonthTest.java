import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MonthTest {
	Month month;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIncrement() {
		month = new Month(1, new Year(1));
		month.increment();
		month = new Month(12, new Year(1));
		month.increment();
	}

	@Test
	public void testIsValid() {
		fail("Not yet implemented");
	}

	@Test
	public void testMonth() {
		month = new Month(1, null);
		month = new Month(1, new Year(0));
		month = new Month(1, new Year(1));
		month = new Month(0, new Year(1));	}

	@Test
	public void testSetMonth() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMonth() {
		month = new Month(1,new Year(2000));
		month.getMonth();
	}

	@Test
	public void testGetMonthSize() {
		month = new Month(1, new Year(2000));
		month.getMonthSize();
		month = new Month(2, new Year(2000));
		month.getMonthSize();
		month = new Month(2, new Year(2001));
		month.getMonthSize();
		month = new Month(2, new Year(0));
		month.getMonthSize();
		month = new Month(-1, new Year(2001));
		month.getMonthSize();
		
	}

	@Test
	public void testEqualsObject() {
		month = new Month(1, new Year(2000));
		month.equals("..");
		month.equals(new Month(1,new Year(2000)));
		month.equals(new Month(2,new Year(2000)));
	}

}
