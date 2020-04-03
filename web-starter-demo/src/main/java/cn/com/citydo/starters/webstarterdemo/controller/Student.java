package cn.com.citydo.starters.webstarterdemo.controller;

import lombok.Data;

/**
 * Created by Caorenpeng
 * 2020-04-03
 */
@Data
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
}
