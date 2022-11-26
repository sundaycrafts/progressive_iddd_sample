package com.example.iddd_collaboration.collaboration.domain.model.calendar;

import com.example.iddd_collaboration.collaboration.domain.model.tenant.Tenant;
import jdk.jshell.Snippet;

public class Calendar {
    public final Tenant tenant;
    public final CalendarId calendarId;
    private String description;

    public Calendar() {
        tenant = new Tenant();
        calendarId = new CalendarId();
    }

    public String getDescription() {
        return description;
    }
}
