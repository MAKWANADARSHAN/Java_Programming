package Array;

import java.time.LocalDate;
import java.time.Period;

public class FindAges {
	public static void main(String[] args) {
		LocalDate birthDate = LocalDate.of(2003, 11, 01);
		LocalDate currentDate = LocalDate.now();

		Period total = Period.between(birthDate, currentDate);

		int year = total.getYears();
		int month = total.getMonths();
		int day = total.getDays();

		System.out.println(year + " " + month + " " + day);
	}
}
