package terning;

//Niklas Thielemann var her d. 30. September kl. 12.35
////Ann-Sofie Buchwald var her d. 30. september kl. 12.36

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiceTest {
	Dice terning = new Dice();
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After	
	public void tearDown() throws Exception {
		terning = null;
		
	}

	@Test
	public void testRoll() {
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		
		for (int i = 0; i < 60000; i++)
		{
			int roll = terning.roll();
			
			
			if(roll == 1) {
				count1++;
			}
			else if(roll == 2)
				count2++;
			else if(roll == 3)
				count3++;
			else if(roll == 4)
				count4++;
			else if(roll == 5)
				count5++;
			else if(roll == 6)
				count6++;
			else
				fail("Slog under 1 eller over 6");
			
			
		}
		assertEquals(10000, count1, 400);
		assertEquals(10000, count2, 400);
		assertEquals(10000, count3, 400);
		assertEquals(10000, count4, 400);
		assertEquals(10000, count5, 400);
		assertEquals(10000, count6, 400);
		

	}

	@Test
	public void testRollMultiple() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}

}
