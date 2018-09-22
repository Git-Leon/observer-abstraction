package com.github.git_leon;

import com.github.git_leon.class_assembly_generator.ReadMeGenerator;

/**
 * @author leon on 5/8/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        new ReadMeGenerator("com.zipcodewilmington").writeToReadMe();
    }
}
