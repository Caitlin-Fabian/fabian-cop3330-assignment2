package ex39;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caitlin Fabian
 */

import java.lang.reflect.Array;
import java.util.*;
import java.util.Map;
//i made a list for each employee (namaes adn data given) then made a map with the employees last name as the key and thier list as the object
public class App {

    static void creatingPeople(){
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        List<String> person1 = new ArrayList<String>();
        person1.add("John");
        person1.add("Manager");
        person1.add("2016-12-31");

        List<String> person2 = new ArrayList<String>();
        person2.add("Tou");
        person2.add("Software Engineer");
        person2.add("2016-10-05");

        List<String> person3 = new ArrayList<String>();
        person3.add("Michaela");
        person3.add("District Manager");
        person3.add("2015-12-19");

        List<String> person4 = new ArrayList<String>();
        person4.add("Jake");
        person4.add("Programmer");

        List<String> person5 = new ArrayList<String>();
        person5.add("Jacquelyn");
        person5.add("DBA");

        List<String> person6 = new ArrayList<String>();
        person6.add("Sally");
        person6.add("Web Developer");
        person6.add("2015-12-18");

        map.put("Johnson", person1);
        map.put("Xiong", person2);
        map.put("Michaelson", person3);
        map.put("Jacobson", person4);
        map.put("Jackson", person5);
        map.put("Webber", person6);

        TreeMap<String, List<String>> sorted = new TreeMap<>();

        sorted.putAll(map);

        printTable(sorted, person1, person2, person3, person4, person5, person6);

    }
    static void printTable(TreeMap sorted, List person1, List person2, List person3, List person4, List person5, List person6){

        sorted.forEach((key, value) -> System.out.println( key + ", Value = " + value));

    }

    public static void main(String[] args) {


        creatingPeople();


    }


}
