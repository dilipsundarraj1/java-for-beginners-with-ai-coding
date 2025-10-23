package app.domain;

public enum SeatType {
    REGULAR,
    PREMIUM,
    RECLINER;

    public static SeatType fromString(String raw) {
        if (raw == null) return null;
        try { return SeatType.valueOf(raw.trim().toUpperCase()); } catch (IllegalArgumentException e) { return null; }
    }
}

