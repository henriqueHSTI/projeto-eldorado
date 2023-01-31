package com.eldorado.microservico.schedule.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDto {

    @NonNull
    private String userDocument;
    @NonNull
    private UUID employeeId;
    @NonNull
    private LocalDateTime appointmentDate;


}
