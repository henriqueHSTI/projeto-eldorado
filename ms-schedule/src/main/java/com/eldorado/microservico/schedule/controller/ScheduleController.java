package com.eldorado.microservico.schedule.controller;

import com.eldorado.microservico.schedule.dto.AppointmentDto;
import com.eldorado.microservico.schedule.dto.WorkScheduleDto;
import com.eldorado.microservico.schedule.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/schedule")
@RequiredArgsConstructor
@Slf4j
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping("/work-schedule")
    public void saveWorkSchedule(@RequestBody List<WorkScheduleDto> workScheduleDto) {
        log.info("Save work Schedule to employee");
        scheduleService.saveWorkSchedule(workScheduleDto);
    }

    @GetMapping("/work-schedule/{employeeId}")
    public void saveWorkSchedule(@PathVariable UUID employeeId) {

    }

    @PostMapping("/appointment")
    public void saveAppoitment(@RequestBody AppointmentDto appointmentDto) {

    }



}
