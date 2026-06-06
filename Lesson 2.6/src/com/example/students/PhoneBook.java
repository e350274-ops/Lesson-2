package com.example.students;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneMap = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        phoneMap.putIfAbsent(lastName, new ArrayList<>());
        phoneMap.get(lastName).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return phoneMap.getOrDefault(lastName, new ArrayList<>());
    }
}