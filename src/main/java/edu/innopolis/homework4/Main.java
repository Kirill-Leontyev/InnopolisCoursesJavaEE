package edu.innopolis.homework4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String input = "aaabbcc";
        Map<Character, Integer> hashMap = new HashMap<>();
        for(char ch : input.toCharArray()) {
            hashMap.merge(ch,1, Integer::sum);
        }
        System.out.println(hashMap);
    }
}
