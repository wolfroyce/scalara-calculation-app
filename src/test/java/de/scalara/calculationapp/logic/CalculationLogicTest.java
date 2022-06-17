package de.scalara.calculationapp.logic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class CalculationLogicTest {

    @InjectMocks
    CalculationLogic calculationLogic;

    @Test
    void testCalculateHypotenuse() {
        //given
        final String id = "1";
        final double adjacent = 2.5;
        final double opposite = 3.5;

        //when
        double result = calculationLogic.executeCalculation(id, adjacent, opposite);

        //then
        assertThat(result).isEqualTo(Math.sqrt(Math.pow(adjacent, 2) + Math.pow(opposite, 2)));
    }

    @Test
    void testCalculateModulo() {
        //given
        final String id = "2";
        final int number = 10;
        final int divisor = 2;

        //when
        double result = calculationLogic.executeCalculation(id, number, divisor);

        //then
        assertThat(result).isEqualTo(number % divisor);
    }

    @Test
    void testCalculatePeripheryOfACircle() {
        //given
        final String id = "3";
        final double diameter = 2.64;

        //when
        double result = calculationLogic.executeCalculation(id, diameter);

        //then
        assertThat(result).isEqualTo(diameter * 3.1415);
    }

    @Test
    void testCalculateCylindricalVolume() {
        //given
        final String id = "4";
        final double radius = 3.15;

        //when
        double result = calculationLogic.executeCalculation(id, radius);

        //then
        assertThat(result).isEqualTo(Math.PI * Math.pow(radius, 2));
    }
}