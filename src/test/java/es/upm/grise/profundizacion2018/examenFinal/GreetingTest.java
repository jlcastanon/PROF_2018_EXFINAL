package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class GreetingTest {

	MyCalendar cal = new MyCalendar();


	@Test
	public void smokeTest1() {

		int hour = 8;
		this.cal = mock(MyCalendar.class);
		when(this.cal.getHour()).thenReturn(hour);
		when(this.cal.getMomentOfTheDay(hour)).thenReturn(TimeOfTheDay.MORNING);
		Greeting greeting = new Greeting(this.cal);
		//System.out.println(this.cal.getHour());
		assertEquals("Good morning", greeting.getGreeting(null));
	}
	
	@Test
	public void smokeTest2() {
		int hour = 8;
		this.cal = mock(MyCalendar.class);
		when(this.cal.getHour()).thenReturn(hour);
		when(this.cal.getMomentOfTheDay(hour)).thenReturn(TimeOfTheDay.MORNING);
		Greeting greeting = new Greeting(this.cal);

		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH));
	}
	
	@Test
	public void smokeTest3() {
		int hour = 8;
		this.cal = mock(MyCalendar.class);
		when(this.cal.getHour()).thenReturn(hour);
		when(this.cal.getMomentOfTheDay(hour)).thenReturn(TimeOfTheDay.MORNING);
		Greeting greeting = new Greeting(this.cal);
		assertEquals("Buenos días", greeting.getGreeting(Language.SPANISH));
	}

}
