package org.extra08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * This enum represents holidays, displayed as month + day value. This enum can
 * give nearest holiday.
 */
public enum Holiday {
	NEW_YEAR(1, 1), WOMAN_DAY(3, 8), CHUCK_NORRIS_BIRTHSDAY(3, 10), FOOLS_DAY9(
			4, 1), WORLD_END(12, 21);
	int month;
	int day;
	
	

	Holiday(int month, int day) {
		// TODO #1 implement class variables for month and day of the holiday
		this.month = month;
		this.day = day;
	}
	
	
	
	public static void main(String[] args) {
		Holiday hday = Holiday.getNearest(2, 22);
		System.out.println(hday);
//		Set<Integer> example = getDaySet();
//		for(int i : example) {
//			System.out.println(i);
//		}
		
	}

	public static Holiday getNearest(int currentMonth, int currentDay) {
		Holiday returnHoliday = Holiday.NEW_YEAR;
		// TODO #2 implement method which will return the nearest holiday.
		// HINT: note, that holidays is arranged by date ascending, so if there
		// areli
		// no more holidays this year, first holiday in the list will be the
		// next.
		int i = 0;
		for(Holiday holiday : Holiday.values()) {
			System.out.println(i);
			if(holiday.getMonth() > currentMonth) {
				System.out.println("Month is " + holiday.getMonth());
				returnHoliday = holiday;
				System.out.println(holiday);
				System.out.println(returnHoliday);
				break;
				}
			else if(holiday.getMonth() == currentMonth) {
				if(holiday.getDay() > currentDay) {
					System.out.println("Day is " + holiday.getDay());
					returnHoliday = holiday;
					break;
				}
			}
			i++;
		}
		return returnHoliday;
		//return holiday;
		//return returnHoliday;
	}


	public int getMonth() {
		return month;
	}

	public int getDay() {
		return this.day;
	}
}
