package com.github.mmacdonnacha.day02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class Day02Test {

    private Day02 day02;

    @BeforeEach
    public void setup(){
        day02 = new Day02();
    }


    @Test
    public void emptyInputPart1(){
        List<String> data = new ArrayList<>();

        int expected = 0;
        int actual = day02.solvePart1(data);

        assertEquals(expected, actual);
    }


    @Test
    public void exampleInputPart1(){
        List<String> data = new ArrayList<>();
        data.add("forward 5");
        data.add("down 5");
        data.add("forward 8");
        data.add("up 3");
        data.add("down 8");
        data.add("forward 2");

        int expected = 150;
        int actual = day02.solvePart1(data);

        assertEquals(expected, actual);
    }


    /// Part 2
    
    @Test
    public void emptyInputPart2(){
        List<String> data = new ArrayList<>();

        int expected = 0;
        int actual = day02.solvePart2(data);

        assertEquals(expected, actual);
    }


    @Test
    public void exampleInputPart2(){
        List<String> data = new ArrayList<>();
        data.add("forward 5");
        data.add("down 5");
        data.add("forward 8");
        data.add("up 3");
        data.add("down 8");
        data.add("forward 2");

        int expected = 900;
        int actual = day02.solvePart2(data);

        assertEquals(expected, actual);
    }


}
