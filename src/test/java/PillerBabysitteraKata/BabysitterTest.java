/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package PillerBabysitteraKata;

import org.junit.Test;
import static org.junit.Assert.*;

public class BabysitterTest {
    
	@Test
	public void validateWithinHoursOfAvailability () {
		Babysitter A = new Babysitter();
		A.setStartTime(17);
		A.setEndTime(28);
		boolean expected = true;
		boolean actual = A.validateWithinHoursOfAvailability(17, 28);
		assertEquals(expected, actual);
	}
	
	@Test
	public void familyATotalBasedOnServiceNeeds() {
		Babysitter A = new Babysitter();
		A.setStartTime(20);
		A.setLatePayStartTime(23);
		A.setEndTime(26);
		A.setEarlyPay(15);
		A.setLatePay(20);
		int expected = 105;
		int actual = A.familyATotalBasedOnServiceNeeds();
		assertEquals(expected, actual);
	}
	
	@Test 
	public void FamilyBtotalBasedOnServiceNeeds() {
		Babysitter B = new Babysitter();
		B.setStartTime(20);
		B.setLatePayStartTime(22);
		B.setSpecialScheduleStart(22);
		B.setSpecialScheduleEnd(24);
		B.setEndTime(25);
		B.setEarlyPay(12);
		B.setSpecialPay(8);
		B.setLatePay(16);
		int expected = 56;
		int actual = B.familyBTotalBasedOnServiceNeeds();
		assertEquals(expected, actual);
		
	}
	
	@Test 
	public void familyCTotalBasedOnServiceNeeeds() {
		Babysitter C = new Babysitter();
		C.setStartTime(18);
		C.setLatePayStartTime(21);
		C.setEndTime(22);
		C.setEarlyPay(21);
		C.setLatePay(15);
		int expected = 78;
		int actual = C.familyCTotalBasedOnServiceNeeds();
		assertEquals(expected, actual);
	}
	
	
}
