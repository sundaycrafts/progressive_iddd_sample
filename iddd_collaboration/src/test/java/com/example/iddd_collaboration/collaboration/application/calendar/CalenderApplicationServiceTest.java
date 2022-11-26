package com.example.iddd_collaboration.collaboration.application.calendar;

import com.example.iddd_collaboration.collaboration.application.ApplicationTest;
import static org.junit.jupiter.api.Assertions.*;

import com.example.iddd_collaboration.collaboration.domain.model.calendar.Calendar;
import org.junit.jupiter.api.Test;

public class CalenderApplicationServiceTest extends ApplicationTest {
    @Test
    void changeCalendarDescription() {
        // Given existing calendar
        var calendar = calendarAggregate();
        calendarRepository.save(calendar);

        // Change description
        var description = "This is changed description.";
        calendarApplicationService.changeCalendarDescription(
                calendar.tenant.getId(),
                calendar.calendarId.getId(),
                description
        );

        // Asset original and changed calendar are not equal
        var changedCalendar = calendarRepository.calendarOfId(calendar.tenant, calendar.calendarId).orElseThrow();

        assertNotEquals(changedCalendar.getDescription(), calendar.getDescription());
        assertEquals(changedCalendar.getDescription(), description);
    }

    @Test
    void createCalendar() {
    }

    @Test
    void renameCalendar() {}

    @Test
    void scheduleCalendarEntry() {}

    @Test
    void shareCalendarWith() {}

    @Test
    void unshareCalendarWith() {}
}
