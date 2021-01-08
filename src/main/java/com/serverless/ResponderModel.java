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
        
        Matcher sumMatcher1 = Pattern.compile(".*which of the following numbers is the largest: (\\d+), (\\d+)").matcher(question);
        if (sumMatcher1.matches()) {
            Integer firstNum = Integer.parseInt(sumMatcher1.group(1));
            Integer secondNum = Integer.parseInt(sumMatcher1.group(2));
            Integer largest = 0;
            if(firstNum > secondNum) largest = firstNum;
            else largest = secondNum;
            return String.valueOf(largest);
        }
        
        return teamName;
    }

}