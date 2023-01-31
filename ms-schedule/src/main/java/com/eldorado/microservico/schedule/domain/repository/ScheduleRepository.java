package com.eldorado.microservico.schedule.domain.repository;

import com.eldorado.microservico.schedule.domain.model.ScheduleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ScheduleRepository extends MongoRepository<ScheduleEntity, UUID> {

}
