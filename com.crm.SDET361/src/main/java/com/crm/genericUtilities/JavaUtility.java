package com.crm.genericUtilities;

import java.util.Date;
import java.util.Random;

/**
 * It contains java specific libraries like getRandomdata and getsystemDate etc
 * @author Darshan
 *
 */
public class JavaUtility {
	/**
	 * its is used to generate a random number within the range 1000
	 * @return
	 */
	public int getRandomNumber() {
		Random random = new Random();
		int randNum = random.nextInt(1000);
		return randNum;
	}
	/**
	 * it is used to get current System Date based on YYYY-MM-DD format
	 * @return
	 */
	public String getSystemDateAndTimeInISTFormat() {
		Date date = new Date();
		return date.toString();
	}
	/**
	 * it is used to get Current System Date based on YYYY-MM-DD format
	 * @return
	 */
	public String getSystemDateAndTimeInFormat() {
		Date date = new Date();
		String dateAndTime = date.toString();
		String YYYY = dateAndTime.split(" ")[5];
		String DD = dateAndTime.split(" ")[2];
		int MM = date.getMonth()+ 1;
		
		String finalFormat = YYYY+" "+MM+" "+DD;
		return finalFormat;
	}
}
