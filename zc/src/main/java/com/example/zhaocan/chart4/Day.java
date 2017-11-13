package com.example.zhaocan.chart4;

/**
 * Created by zhaocan on 2017/11/3.
 */

public class Day {
    private int yue;

    private static Day day;
    public static Day getInstance() {
        if (day == null) {
            day = new Day();
        }
        return day;
    }
    public int getName() {
        return yue;
    }
    public void setName(int name) {
        this.yue = name;
    }
}
