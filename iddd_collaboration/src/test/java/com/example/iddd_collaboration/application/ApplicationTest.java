package com.example.iddd_collaboration.application;

import com.example.iddd_collaboration.adapter.persistence.repository.EventStoreCalendarRepository;
import com.example.iddd_collaboration.application.calendar.CalendarApplicationService;
import com.example.iddd_collaboration.domain.model.calendar.Calendar;
import com.example.iddd_collaboration.domain.model.calendar.CalendarRepository;

public abstract class ApplicationTest {
    protected CalendarApplicationService calendarApplicationService;
    protected CalendarRepository calendarRepository = new EventStoreCalendarRepository();

    protected Calendar calendarAggregate() {
        var calendar = new Calendar();
        return calendar;
    }
}
