package com.example.backend_sol_y_luna.repositories;

import com.example.backend_sol_y_luna.domain.entities.Event;
import com.example.backend_sol_y_luna.domain.repositories.EventRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventRepositoryImpl implements EventRepository {

    private final EventJpaRepository db;

    public EventRepositoryImpl(EventJpaRepository db) {
        this.db = db;
    }

    @Override
    public Event createEvent(Event event) {
        return db.save(event);
    }

    @Override
    public Event updateEvent(Event event) {
        return db.save(event);
    }

    @Override
    public void deleteEvent(Integer id) {
        db.deleteById(id);
    }

    @Override
    public List<Event> listEvents() {
        List<Event> listEventsAll = db.findAll();
        return listEventsAll;
    }

}
