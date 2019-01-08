package com.company;

import java.io.*;
import java.util.*;

public class test {

    public static void main(String args[]) throws IOException {
        Scanner sca = new Scanner(System.in);

        String str = sca.nextLine();

        int length = str.length();

        String reverse = "";
        for (int i = 0;i<length;i++){
            reverse = str.charAt(i) + reverse;
        }

        System.out.println(reverse);
    }

    public static String getWeek(Date date) {
        String[] weeks = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week_index = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (week_index < 0) {
            week_index = 0;
        }
        return weeks[week_index];
    }
}
