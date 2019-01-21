package es.upm.grise.profundizacion2018.examenFinal;

import java.util.Calendar;

public class MyCalendar {

    Calendar c;

    MyCalendar (){
        this.c = Calendar.getInstance();
    }

    public int getHour(){
        return this.c.get(Calendar.HOUR_OF_DAY);
    }

    public TimeOfTheDay getMomentOfTheDay(int h){
        TimeOfTheDay t;
        if( h < 12 )
            t = TimeOfTheDay.MORNING;
        else if ( h < 18 )
            t = TimeOfTheDay.AFTERNOON;
        else
            t = TimeOfTheDay.EVENING;
        return t;
    }
}
