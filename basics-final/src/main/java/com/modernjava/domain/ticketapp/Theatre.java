package com.modernjava.domain.ticketapp;

import java.util.List;

public record Theatre(
    String name,
    String address,
    List<Screen> screens
) {}