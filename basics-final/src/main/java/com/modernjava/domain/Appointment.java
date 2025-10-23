package com.modernjava.domain;

import java.time.LocalDateTime;

public record Appointment(String doctor, String purpose, LocalDateTime dateTime) {}
