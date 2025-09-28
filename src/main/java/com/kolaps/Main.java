package com.kolaps;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("Max", 25);
        map.put("Ellison", 31);
        map.put("Matt", 19);

        System.out.println("Size: " + map.size());
        System.out.println(map.get("Max"));

        map.remove("Matt");
    }
}