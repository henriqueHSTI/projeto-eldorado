package com.eldorado.microservico.schedule.service;

import com.eldorado.microservico.schedule.domain.model.ScheduleEntity;
import com.eldorado.microservico.schedule.domain.repository.ScheduleRepository;
import com.eldorado.microservico.schedule.dto.WorkScheduleDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    private final ModelMapper modelMapper;

    public void saveWorkSchedule(List<WorkScheduleDto> workScheduleDto) {
        List<ScheduleEntity> scheduleEntities = workScheduleDto.stream().map(work -> {
            var entity = modelMapper.map(work, ScheduleEntity.class);
            entity.setId(UUID.randomUUID());
            entity.setCreatedAt(LocalDateTime.now());
            entity.setCreatedBy("JOSE");
            return entity;
        }).toList();
        scheduleRepository.saveAll(scheduleEntities);
        log.info("Saved list of work ");
    }
}
