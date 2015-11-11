package com.lomo.google.guava.file;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Lomo on 15-11-9.
 * Study Guava
 */
public class FileWriteTest {
    public static void main(String[] args) {
        File file = wirteFile("abc.txt", "abccontents\rsdddd");
        System.out.println(file.getAbsolutePath());

        String filePath = "D:\\gitProject\\GitTest\\abc.txt";
        readFile(filePath);
    }

    public static File wirteFile(String filename, String contents) {
        Preconditions.checkNotNull(filename, "文件名不能为空");
        Preconditions.checkNotNull(contents, "文件内容不能为空");

        final File file = new File(filename);
        try {
            Files.write(contents.getBytes(), file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static void readFile(String filePath) {
        File file = new File(filePath);
        try {
            List<String> lineList = Files.readLines(file, Charsets.UTF_8);
            for (String line : lineList) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
