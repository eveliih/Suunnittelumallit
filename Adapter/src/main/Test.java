package main;

public class Test {

	public static void main(String[] args) {
		Calendar calendar = new FinnishCalendar();
		CalendarAdapter adapter = new InternationalCalendarAdapter(calendar);
		
		System.out.println(calendar.getDate());
		System.out.println(adapter.getDate());

	}

}
