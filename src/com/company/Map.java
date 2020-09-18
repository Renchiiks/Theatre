package com.company;

import java.util.HashMap;
import java.util.Map;

class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the Map");
        } else {
            languages.put("Java", " After IF statement compile high level, object-oriented, platform independent language");
            System.out.println("Java added to to the Map");
        }
        languages.put("Java", "a compile high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, a compile high level programing language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners all purposes symbolic instruction code"));
        languages.put("Lisp", "There in lies madness");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "This course is about Java in for loop");
        }

        System.out.println(languages.get("Java"));
        languages.put("Java", "this course is about Java");
        System.out.println(languages.get("Java"));
        System.out.println(languages.put("BASIC", "Second time: Beginners all purposes symbolic instruction code"));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        //languages.remove("Lisp");//returns true or false
        if (languages.remove("Algol", "a family of algorithmic languages")) {
            System.out.println("Algol removed");
            System.out.println(languages.remove("Algol"));
        } else {
            System.out.println("Algol not removed, key/value not found");
        }

        if (languages.remove("Algol", "an algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(languages.replace("Lisp", "a functional programming language with imperative features"));

        if (languages.replace("Lisp", "This will not work", "a functional programming language with imperative features")) {
            System.out.println("Lisp was replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

        if (languages.replace("Lisp", "a functional programming language with imperative features", "There in lies madness")) {
            System.out.println("Lisp was replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(languages.replace("Scala", "this will not be replaced"));

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
