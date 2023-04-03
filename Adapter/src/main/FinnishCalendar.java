package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FinnishCalendar implements Calendar {
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	@Override
	public String getDate() {

		return LocalDate.now().format(dateTimeFormatter);
	}

}
