package com.company;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

class FreshJuice {
    public static void main(String[] args) {
        try {
            File file = new File("res/test.txt");
            String content = FileUtils.readFileToString(file, "UTF-8");
            System.out.println("Contents of file: "+content);
        } catch(IOException e) {
            System.out.println("错误");
        }
    }


}
