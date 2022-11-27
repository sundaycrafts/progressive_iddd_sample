package com.example.iddd_collaboration.adapter.persistence.repository;

import com.example.iddd_collaboration.adapter.persistence.EventStoreProvider;
import com.example.iddd_collaboration.domain.model.calendar.Calendar;
import com.example.iddd_collaboration.domain.model.calendar.CalendarId;
import com.example.iddd_collaboration.domain.model.calendar.CalendarRepository;
import com.example.iddd_collaboration.domain.model.tenant.Tenant;

import java.util.Optional;

public class EventStoreCalendarRepository extends EventStoreProvider implements CalendarRepository {

    public void save(Calendar calendar) {

    }

    public Optional<Calendar> calendarOfId(Tenant tenant, CalendarId calendarId) {
        return Optional.empty();
    }
}