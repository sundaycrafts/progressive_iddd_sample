package com.example.iddd_collaboration.domain.model.calendar;

import com.example.iddd_collaboration.domain.model.tenant.Tenant;

import java.util.Optional;

public interface CalendarRepository {
    void save(Calendar calendar);

    Optional<Calendar> calendarOfId(Tenant tenant, CalendarId calendarId);
}
