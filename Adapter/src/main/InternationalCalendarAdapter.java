package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InternationalCalendarAdapter implements CalendarAdapter {
	private Calendar calendar;

	public InternationalCalendarAdapter(Calendar calendar) {
		this.calendar = calendar;
	}

	@Override
	public String getDate() {

		return convertToInternationalFormat(calendar.getDate());
	}

	private String convertToInternationalFormat(String date) {

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

		LocalDate date1 = LocalDate.parse(date, dateTimeFormatter);
		return date1.format(dateFormatter);

	}
}