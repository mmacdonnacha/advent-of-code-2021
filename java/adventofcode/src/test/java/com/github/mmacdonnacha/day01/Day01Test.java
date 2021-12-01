package com.github.mmacdonnacha.day01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class Day01Test {

    private Day01 day01;

    @BeforeEach
    public void setup(){
        day01 = new Day01();
    }

    @DisplayName("Test empty list has no increase")
    @Test
    public void emptyList(){
        List<Integer> depths = new ArrayList<>();

        int expected = 0;
        int actual = day01.getDepthCount(depths);

        assertEquals(expected, actual);
    }


    @Test
    public void oneIncrease(){
        List<Integer> depths = new ArrayList<>();
        depths.add(199);
        depths.add(200);

        int expected = 1;
        int actual = day01.getDepthCount(depths);

        assertEquals(expected, actual);
    }

    @DisplayName("Using example input")
    @Test
    public void example(){
        List<Integer> depths = new ArrayList<>();
        depths.add(199);
        depths.add(200);
        depths.add(208);
        depths.add(210);
        depths.add(200);
        depths.add(207);
        depths.add(240);
        depths.add(269);
        depths.add(260);
        depths.add(263);

        int expected = 7;
        int actual = day01.getDepthCount(depths);

        assertEquals(expected, actual);
    }


    /// Part 2
    
    @DisplayName("Part 2: Test empty list has no increase")
    @Test
    public void emptyListPart2(){
        List<Integer> depths = new ArrayList<>();

        int expected = 0;
        int actual = day01.getDepthCountPart2(depths);

        assertEquals(expected, actual);
    }


    @Test
    public void oneIncreasePart2(){
        List<Integer> depths = new ArrayList<>();
        depths.add(199);
        depths.add(200);
        depths.add(208);
        depths.add(210);

        int expected = 1;
        int actual = day01.getDepthCountPart2(depths);

        assertEquals(expected, actual);
    }

    @DisplayName("Part 2: Using example input")
    @Test
    public void part2Example(){
        List<Integer> depths = new ArrayList<>();
        depths.add(199);
        depths.add(200);
        depths.add(208);
        depths.add(210);
        depths.add(200);
        depths.add(207);
        depths.add(240);
        depths.add(269);
        depths.add(260);
        depths.add(263);

        int expected = 5;
        int actual = day01.getDepthCountPart2(depths);

        assertEquals(expected, actual);
    }
}
