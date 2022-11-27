package com.example.iddd_collaboration.domain.model.calendar;

import com.example.iddd_collaboration.common.domain.model.AbstractId;

public class CalendarId extends AbstractId {
    final private String id;

    public CalendarId() {
        id = "123456";
    }

    public String getId() {
        return id;
    }
}
