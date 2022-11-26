package com.example.iddd_collaboration.collaboration.domain.model.calendar;

import com.example.iddd_collaboration.collaboration.domain.model.common.AbstractId;

public class CalendarId extends AbstractId {
    final private String id;

    public CalendarId() {
        id = "123456";
    }

    public String getId() {
        return id;
    }
}
