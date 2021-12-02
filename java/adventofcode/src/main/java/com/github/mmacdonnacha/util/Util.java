package com.github.mmacdonnacha.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Util {

    public InputStream getFileAsIOStream(final String fileName) 
    {
        InputStream ioStream = this.getClass()
            .getClassLoader()
            .getResourceAsStream(fileName);
    
        if (ioStream == null) {
            throw new IllegalArgumentException(fileName + " is not found");
        }
        return ioStream;
    }

    public List<String> getInputAsList(String fileName){
        InputStream in = getFileAsIOStream(fileName);
        BufferedReader r = new BufferedReader(new InputStreamReader(in));

        List<String> lines = new ArrayList<>();

        try {
            String line;
            while ((line=r.readLine()) != null) {
                lines.add(line);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        return lines;
    }


    public List<Integer> convertToInt(List<String> list){
        return list.stream()
                   .map(Integer::parseInt)
                   .collect(Collectors.toList());
    }
}