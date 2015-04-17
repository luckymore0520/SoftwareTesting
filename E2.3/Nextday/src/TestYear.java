import org.junit.Before;
import org.junit.Test;


public class TestYear {
	Year year;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIncrement() {
		year = new Year(2000);
		year.increment();
		year.setCurrentPos(-1);
		year.increment();
	}

	@Test
	public void testIsValid() {
	}

	@Test
	public void testYear() {
		year = new Year(2000);
		year = new Year(0);
	}

	@Test
	public void testSetYear() {
		year = new Year(2000);
		year.setYear(0);
		year.setYear(2001);
	}

	@Test
	public void testGetYear() {
		year = new Year(2000);
		year.getYear();
	}
	@Test
	public void testIsLeap() {
		year = new Year(2000);
		year.isLeap();
		year = new Year(1999);
		year.isLeap();
		year = new Year(2100);
		year.isLeap();
		year = new Year(2004);
		year.isLeap();
		
		year = new Year(-2000);
		year.isLeap();
		year = new Year(-1999);
		year.isLeap();
		year = new Year(-2100);
		year.isLeap();
		year = new Year(-2004);
		year.isLeap();
	}

	@Test
	public void testEqualsObject() {
		year = new Year(2000);
		year.equals("year");
		year.equals(new Year(2000));
		year.equals(new Year(2011));
	}

}
