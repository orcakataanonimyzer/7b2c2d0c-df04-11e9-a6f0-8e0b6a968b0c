/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package PillerBabysitteraKata;

public class Babysitter {
	/*
	 * This class will include the description of the Babysitter based on the
	 * requirements page
	 */

	public static final int START_TIME = 17;

	public static final int END_TIME = 28;
	private int startTime;
	private int endTime;
	// earlyPay: pay for the beginning of the night;
	private int earlyPay;
	// specialPay: pay for any specified times with different pay;
	private int specialPay;
	// latePay: pay for later portion of the night.
	private int latePay;

	public Babysitter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Babysitter(int startTime, int endTime, int earlyPay, int specialPay, int latePay) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.earlyPay = earlyPay;
		this.specialPay = specialPay;
		this.latePay = latePay;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public double getEarlyPay() {
		return earlyPay;
	}

	public void setEarlyPay(int earlyPay) {
		this.earlyPay = earlyPay;
	}

	public double getSpecialPay() {
		return specialPay;
	}

	public void setSpecialPay(int specialPay) {
		this.specialPay = specialPay;
	}

	public double getLatePay() {
		return latePay;
	}

	public void setLatePay(int latePay) {
		this.latePay = latePay;
	}

	public boolean validateWithinHoursOfAvailability(int startTime, int endTime) {
		if (startTime >= START_TIME && endTime <= END_TIME) {
			return true;
		}
		return false;
	}


	int familyTotalBasedOnServiceNeeds() {
		int earlyRate = 0;
		int lateRate = 0;
		int subTotal1 = 0;
		int subTotal2 = 0;
		if (validateWithinHoursOfAvailability(getStartTime(), getEndTime())) {
			if (getStartTime() < 23) {
				earlyRate = 23 - getStartTime();
				subTotal1 = (int) (earlyRate * getEarlyPay());
			}
			if (getEndTime() > 23) {
				lateRate = getEndTime() - 23;
				subTotal2 = (int) (lateRate * getLatePay());
			}

		}
		return subTotal1 + subTotal2;
	}

}
