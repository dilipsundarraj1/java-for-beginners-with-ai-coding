package app.util;

/** Utility for determining age category, kept in domain to avoid domain->service dependency. */
public final class AgeCategoryUtil {
    private AgeCategoryUtil() {}

    public static String getAgeCategoryName(int age) {
        return age < 3 ? "Toddler" :
               age < 12 ? "Child" :
               age < 60 ? "Adult" :
               "Senior";
    }
}

