import java.util.Optional;

public class GeopoliticalZoneIdentifier {

    public enum GeopoliticalZone {
        SOUTHWEST("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
        NORTHWEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
        SOUTHSOUTH("Delta", "Edo", "Akwa Ibom", "Bayelsa", "Cross River", "Rivers"),
        SOUTHEAST("Abia", "Anambra", "Enugu", "Imo", "Ebonyi"),
        NORTHCENTRAL("Benue", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau", "FCT"),
        NORTHEAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe");

        private final String[] states;

        GeopoliticalZone(String... states) {
            this.states = states;
        }

        public boolean hasState(String state) {
            for (String s : states) {
                if (s.equalsIgnoreCase(state)) {
                    return true;
                }
            }
            return false;
        }

        public String getZoneName() {
            return name();
        }
    }

    public static Optional<GeopoliticalZone> identifyGeopoliticalZone(String state) {
        for (GeopoliticalZone zone : GeopoliticalZone.values()) {
            if (zone.hasState(state)) {
                return Optional.of(zone);
            }
        }
        return Optional.empty();
    }
}