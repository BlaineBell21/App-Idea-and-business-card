package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {




    public static void main(String[] args) {

        String name;

        {
           name = "Blaine Anthony Bell";
        }
        String github = "https://github.com/BlaineBell21";
        String linkedin = "www.linkedin.com/in/blaine-bell21";
        String motto = "Code hard, learn Harder!";
        int age = 27;
        char initial = 'B';
        double gpa = 3.0;
        float hourlyRate = 30.50f;
        long phoneNumber = 6509217092L;
        boolean availableForWork = true;

        String appIdea = "An app that detects if I've taken my medications";
        String problem = "It solves the problem of me occasionally forgetting to take my medications even with reminders";



        System.out.println("App: " + appIdea);
        System.out.println("Problem: " + problem);
        System.out.println("================================================");
        System.out.println("                MY BUSINESS CARD                ");
        System.out.println("================================================");
        System.out.println("Initial  : " + initial);
        System.out.println("Name     : " + name);
        System.out.println("GitHub   : " + github);
        System.out.println("LinkedIn : " + linkedin);
        System.out.println("Age      : " + age);
        System.out.println("GPA      : " + gpa);
        System.out.println("Rate     : €" + hourlyRate + " per hour");
        System.out.println("Phone    : " + phoneNumber);
        System.out.println("Available: " + availableForWork);
        System.out.println("Motto    : " + motto);
        System.out.println("================================================");

        }

    }