package com.example.tmf666.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Data
public class BillingAccountStateChangeEvent {

    private String href;
    private String eventId;
    private LocalDateTime eventTime;
    private String eventType;
    private String correlationId;
    private String domain;
    private String title;
    private String description;
    private String priority;
    private LocalDateTime timeOccurred;
    private BillingAccount billingAccount;
}
