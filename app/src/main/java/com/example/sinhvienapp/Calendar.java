package com.example.sinhvienapp;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Calendar extends AppCompatActivity {
    CompactCalendarView compactCalendar;
    private SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MMMM- yyyy", Locale.getDefault());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        compactCalendar = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        compactCalendar.setUseThreeLetterAbbreviation(true);
        compactCalendar.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
            }
            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {
            }

        });
    }
}
