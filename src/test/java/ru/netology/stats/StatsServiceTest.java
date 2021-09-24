package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int [] allSum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(allSum);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageSum() {
        StatsService service = new StatsService();
        int [] allSum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSum(allSum);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxMonth() {
        StatsService service = new StatsService();
        int [] allSum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxMonth(allSum);

        assertEquals(expected, actual);
    }
    @Test
    void shouldMinMonth() {
        StatsService service = new StatsService();
        int [] allSum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minMonth(allSum);

        assertEquals(expected, actual);
    }

    @Test
    void shouldBelowAverageSum() {
        StatsService service = new StatsService();
        int [] allSum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowAverageSum(allSum);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAboveAverageSum() {
        StatsService service = new StatsService();
        int [] allSum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveAverageSum(allSum);

        assertEquals(expected, actual);
    }

}