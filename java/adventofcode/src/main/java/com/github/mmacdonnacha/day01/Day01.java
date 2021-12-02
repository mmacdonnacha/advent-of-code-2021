package com.github.mmacdonnacha.day01;

import com.github.mmacdonnacha.util.Util;
import java.util.List;

public class Day01 {

    public static void main(String[] args) {
        Util util = new Util();
        Day01 day = new Day01();
        String fileName = "day01.txt";

        List<String> input = util.getInputAsList(fileName);
        List<Integer> data = util.convertToInt(input);


        int part1 = day.solvePart1(data);
        System.out.println("Part 1: " + part1);

        int part2 = day.solvePart2(data);
        System.out.println("Part 2: " + part2);
    }


    public int solvePart1(List<Integer> depths){
        if(depths.isEmpty() || depths.size() == 1)
            return 0;

        int count = 0;

        for(int i=0; i<depths.size()-1; i++){
            if(depths.get(i) < depths.get(i+1)){
                count++;
            }
        }

        return count;
    }

    public int solvePart2(List<Integer> depths){
        if(depths.isEmpty() || depths.size() < 4)
            return 0;

        int count = 0;

        for(int i=0; i<depths.size()-3; i++){
            int firstWindow = depths.get(i) + depths.get(i+1) + depths.get(i+2);
            int secondWindow = depths.get(i+1) + depths.get(i+2) + depths.get(i+3);
        
            if(firstWindow < secondWindow){
                count++;
            }
        }

        return count;
    }
}
