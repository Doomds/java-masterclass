package com.doom.section12_generics.theory.compable_comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        for (Integer integer : others) {
            int value = five.compareTo(integer);
            System.out.printf("%d %s %d: compareTo= %d%n", five,
                    (value == 0 ? "==" : (value < 0) ? "<" : ">"), integer, value);
        }

        String banana = "banana";
        String[] fruits = {"apple", "banana", "pear", "BANANA"};

        for (String fruit : fruits) {
            int val = banana.compareTo(fruit);
            System.out.printf("%s %s %s: compareTo= %d%n", banana,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">"), fruit, val);
        }

        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

        System.out.println("A:" + (int) 'A' + "|" + "a:" + (int) 'a');
        System.out.println("B:" + (int) 'B' + "|" + "b:" + (int) 'b');
        System.out.println("P:" + (int) 'P' + "|" + "p:" + (int) 'p');

        Student tim = new Student("Tim");
        Student[] students = {new Student("Zach"), new Student("Tim"), new Student("Ann")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("result :" + tim.compareTo(new Student("TIM")));

        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students, gpaSorter.reversed());
        System.out.println(Arrays.toString(students));
    }
}

class StudentGPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name);
    }
}

class Student implements Comparable<Student> {

    private static int LAST_ID = 1000;

    private static Random random = new Random();

    String name;

    private int id;

    protected double gpa;


    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0, 4.0);
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }

//    @Override
//    public int compareTo(Object o) {
//        Student other = (Student)  o;
//        return this.name.compareTo(other.name);
//    }
}