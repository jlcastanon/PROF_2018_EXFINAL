package es.upm.grise.profundizacion2018.examenFinal;

import java.util.Calendar;

public class Greeting {

	/*
	public String getGreeting( Language language ) {
		// Get current hour
		Calendar calendar = Calendar.getInstance();
		int hour = calendar.get( Calendar.HOUR_OF_DAY );
		
		// Find out the greeting language
		if ( language == null )
			language = Message.getDefaultLanguage();
		
		// Get the moment of the day
		TimeOfTheDay moment;
		if( hour < 12 ) 
			moment = TimeOfTheDay.MORNING;
		else if ( hour < 18 )
			moment = TimeOfTheDay.AFTERNOON;
		else
			moment = TimeOfTheDay.EVENING;
			
		// Return the message		
		return Message.getMessage( moment, language );
	}*/

	public MyCalendar calendar;
	public Greeting(MyCalendar c){
		this.calendar = c;
	}

	public String getGreeting( Language language ) {
		// Get current hour
		//this.calendar.getHour();
		//MyCalendar calendar = new MyCalendar();
		int hour = this.calendar.getHour();

		// Find out the greeting language
		if ( language == null )
			language = Message.getDefaultLanguage();

		// Get the moment of the day
		TimeOfTheDay moment = this.calendar.getMomentOfTheDay(hour);


		// Return the message
		return Message.getMessage( moment, language );
	}

}
