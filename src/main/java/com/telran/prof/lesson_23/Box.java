package com.telran.prof.lesson_23;

import java.util.ArrayList;
import java.util.List;

public class Box {

    private List<String> stringList;

    public Box() {
        stringList = new ArrayList<>();
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void addStingToLIst(String str) {
        stringList.add(str);
    }
}
