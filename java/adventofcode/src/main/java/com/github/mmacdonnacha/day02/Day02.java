package com.github.mmacdonnacha.day02;

import com.github.mmacdonnacha.util.Util;
import java.util.List;

public class Day02 {

    public static void main(String[] args) {
        Util util = new Util();
        Day02 day = new Day02();
        String fileName = "day02.txt";

        List<String> data = util.getInputAsList(fileName);


        int part1 = day.solvePart1(data);
        System.out.println("Part 1: " + part1);

        // int part2 = day.solvePart2(data);
        // System.out.println("Part 2: " + part2);
    }


    public int solvePart1(List<String> data){
        int[] posAndDepth = new int[]{0, 0};
        
        for(String s : data){
            String direction = s.split(" ")[0];
            int quantity = Integer.parseInt(s.split(" ")[1]);

            switch(direction){
                case "forward":
                    posAndDepth[0] += quantity;
                    break;
                case "down":
                    posAndDepth[1] += quantity;
                    break;
                case "up":
                    posAndDepth[1] -= quantity;
                    break;
                default:
            }
        }

        return posAndDepth[0] * posAndDepth[1];
    }

    public int solvePart2(List<String> data){
        int[] posAndDepth = new int[]{0, 0};
        int aim = 0;
        
        for(String s : data){
            String direction = s.split(" ")[0];
            int qty = Integer.parseInt(s.split(" ")[1]);

            switch(direction){
                case "forward":
                    posAndDepth[0] += qty;
                    posAndDepth[1] += aim * qty;
                    break;
                case "down":
                    aim += qty;
                    break;
                case "up":
                    aim -= qty;
                    break;
                default:
            }
        }

        return posAndDepth[0] * posAndDepth[1];
    }
}
