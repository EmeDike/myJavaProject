package chapterTwoExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircumferenceAndDiameterTest {

    @Test
    public void calculateDiameter(){
        double radius = 5.2;
        double diameter = 10.4;
        assertEquals(10.4, CircumferenceAndDiameter.calDiameter(radius));
    }

    @Test
    public void calculateCircumference(){
        double radius = 5.2;
        double pi = 3.142;
        double circumference = 32.6768;
        assertEquals(32.6768, CircumferenceAndDiameter.calCir(pi, radius));

    }
}