package edu.innopolis.homework4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next(); //aaabbcc
        Map<Character, Integer> hashMap = new HashMap<>();
        for(char ch : input.toCharArray()) {
            hashMap.merge(ch,1, Integer::sum);
        }
        System.out.println(hashMap);
    }
}
