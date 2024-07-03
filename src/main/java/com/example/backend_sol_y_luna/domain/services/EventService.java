package com.example.backend_sol_y_luna.domain.services;

import com.example.backend_sol_y_luna.domain.entities.Event;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EventService {
    Event createEvent(Event event);

    Event updateEvent(Event event);

    void deleteEvent(Integer id);

    List<Event> listEvents();
}
