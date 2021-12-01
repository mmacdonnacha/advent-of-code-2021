package com.github.mmacdonnacha.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Day01 {

    public static void main(String[] args) {
        Day01 day = new Day01();
        String fileName = "day01.txt";

        int part1 = day.solvePart1(fileName);
        System.out.println("Part 1: " + part1);

        int part2 = day.solvePart2(fileName);
        System.out.println("Part 2: " + part2);
    }


    public int solvePart1(String fileName){
        InputStream in = getFileAsIOStream(fileName);
        BufferedReader r = new BufferedReader(new InputStreamReader(in));

        List<Integer> depths = getInputAsList(r);

        int count = getDepthCount(depths);
        
        return count;
    }

    public int solvePart2(String fileName){
        InputStream in = getFileAsIOStream(fileName);
        BufferedReader r = new BufferedReader(new InputStreamReader(in));

        List<Integer> depths = getInputAsList(r);

        int count = getDepthCountPart2(depths);
        
        return count;
    }


    public int getDepthCount(List<Integer> depths){
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

    public int getDepthCountPart2(List<Integer> depths){
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


    private InputStream getFileAsIOStream(final String fileName) 
    {
        InputStream ioStream = this.getClass()
            .getClassLoader()
            .getResourceAsStream(fileName);
    
        if (ioStream == null) {
            throw new IllegalArgumentException(fileName + " is not found");
        }
        return ioStream;
    }


    private List<Integer> getInputAsList(BufferedReader r){
        List<Integer> lines = new ArrayList<>();

        try {
            String line;
            while ((line=r.readLine()) != null) {
                lines.add(Integer.parseInt(line));
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        return lines;
    }
}
