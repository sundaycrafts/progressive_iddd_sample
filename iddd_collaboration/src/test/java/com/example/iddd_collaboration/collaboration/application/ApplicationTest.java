package com.example.iddd_collaboration.collaboration.application;

import com.example.iddd_collaboration.application.calendar.CalendarApplicationService;
import com.example.iddd_collaboration.collaboration.domain.model.calendar.Calendar;
import com.example.iddd_collaboration.collaboration.domain.model.calendar.CalendarRepository;

public abstract class ApplicationTest {
    protected CalendarApplicationService calendarApplicationService;
    protected CalendarRepository calendarRepository;

    protected Calendar calendarAggregate() {
        var calendar = new Calendar();
        return calendar;
    }
}
