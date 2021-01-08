package com.serverless;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResponderModel {
    private final String teamName = "teamdevco";

    public String answer(String question) {
        if ("".equals(question)){
            return teamName;
        }

        Matcher sumMatcher = Pattern.compile(".*what is (\\d+) plus (\\d+)").matcher(question);
        if (sumMatcher.matches()) {
            return String.valueOf(Integer.parseInt(sumMatcher.group(1)) + Integer.parseInt(sumMatcher.group(2)));
        }
        
        Matcher sumMatcher = Pattern.compile(".*which of the following numbers is the largest: (\\d+), (\\d+)").matcher(question);
        if (sumMatcher.matches()) {
            Integer firstNum = Integer.parseInt(sumMatcher.group(1));
            Integer secondNum = Integer.parseInt(sumMatcher.group(2);
            if( firstNum > secondNum) return firstNum;
            else return secondNum
        }
        
        return teamName;
    }

}