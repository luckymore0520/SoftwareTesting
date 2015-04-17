import org.junit.Before;
import org.junit.Test;


public class DateTest {
	Date date;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDate() {
		date = new Date(1,1,2003);
	}

	@Test
	public void testIncrement() {
		date = new Date(1,1,2003);
		date.increment();
		
		date = new Date(31,1,2003);
		date.increment();
		
		date = new Date(31,12,2003);
		date.increment();
	}

	@Test
	public void testPrintDate() {
		date = new Date(1,1,2003);
		date.printDate();
	}

	@Test
	public void testGetDay() {
		date = new Date(1,1,2003);
		date.getDay();
	}

	@Test
	public void testGetMonth() {
		date = new Date(1,1,2003);
		date.getMonth();
	}

	@Test
	public void testGetYear() {
		date = new Date(1,1,2003);
		date.getYear();
	}

	@Test
	public void testEqualsObject() {
		date = new Date(1,1,2003);
		date.equals("..");
		date.equals(new Date(1,1,2003 ));
		date.equals(new Date(12,1,2003 ));
		date.equals(new Date(1,12,2003 ));
	}

	@Test
	public void testToString() {
		date = new Date(1,1,2003);
		date.toString();
	}

	@Test
	public void testNextDay() {
		date = new Date(1,1,2003);
		Nextday.nextDay(date);
	}
}
