package com.github.xioc;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author hyldev
 * @date 2020/9/24 21:55
 */
public class Main {
    public static void main(String[] args) {
        File in = new File("/Users/huyanglin/java_project/java-leetcode/note/Template.md");
        for (int i = 1; i < 70; i++) {
            File out = new File("/Users/huyanglin/java_project/java-leetcode/note/jz"+i+".md");
            try {
                FileUtils.copyFile(in,out);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
