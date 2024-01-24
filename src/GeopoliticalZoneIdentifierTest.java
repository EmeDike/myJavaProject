import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GeopoliticalZoneIdentifierTest {

    @Test
    void testIdentifyGeopoliticalZone() {
        assertEquals(Optional.empty(), GeopoliticalZoneIdentifier.identifyGeopoliticalZone("Lagos"));
        assertEquals(Optional.of(GeopoliticalZoneIdentifier.GeopoliticalZone.NORTHWEST),
                GeopoliticalZoneIdentifier.identifyGeopoliticalZone("Kaduna"));
        assertEquals(Optional.of(GeopoliticalZoneIdentifier.GeopoliticalZone.SOUTHSOUTH),
                GeopoliticalZoneIdentifier.identifyGeopoliticalZone("Delta"));
        assertEquals(Optional.of(GeopoliticalZoneIdentifier.GeopoliticalZone.SOUTHEAST),
                GeopoliticalZoneIdentifier.identifyGeopoliticalZone("Enugu"));
        assertEquals(Optional.of(GeopoliticalZoneIdentifier.GeopoliticalZone.NORTHCENTRAL),
                GeopoliticalZoneIdentifier.identifyGeopoliticalZone("Abuja"));
        assertEquals(Optional.of(GeopoliticalZoneIdentifier.GeopoliticalZone.NORTHEAST),
                GeopoliticalZoneIdentifier.identifyGeopoliticalZone("Yobe"));
    }

    @Test
    void testIdentifyGeopoliticalZoneCaseInsensitive() {
        assertEquals(Optional.empty(), GeopoliticalZoneIdentifier.identifyGeopoliticalZone("lagos"));
        assertEquals(Optional.of(GeopoliticalZoneIdentifier.GeopoliticalZone.NORTHWEST),
                GeopoliticalZoneIdentifier.identifyGeopoliticalZone("KADUNA"));
        assertEquals(Optional.of(GeopoliticalZoneIdentifier.GeopoliticalZone.SOUTHSOUTH),
                GeopoliticalZoneIdentifier.identifyGeopoliticalZone("dELtA"));
        assertEquals(Optional.of(GeopoliticalZoneIdentifier.GeopoliticalZone.SOUTHEAST),
                GeopoliticalZoneIdentifier.identifyGeopoliticalZone("eNuGu"));
        assertEquals(Optional.of(GeopoliticalZoneIdentifier.GeopoliticalZone.NORTHCENTRAL),
                GeopoliticalZoneIdentifier.identifyGeopoliticalZone("ABUJA"));
        assertEquals(Optional.of(GeopoliticalZoneIdentifier.GeopoliticalZone.NORTHEAST),
                GeopoliticalZoneIdentifier.identifyGeopoliticalZone("YOBE"));
    }

    @Test
    void testIdentifyGeopoliticalZoneWithNullInput() {
        assertThrows(NullPointerException.class, () -> GeopoliticalZoneIdentifier.identifyGeopoliticalZone(null));
    }
}
