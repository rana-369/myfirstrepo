package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Deepak Rana";
        student.rollno = 8;
        System.out.println(student);
        student.walk();

        Student.Dog dog = new Student.Dog("Luffy", "Samoyed");


        System.out.println(dog);
        dog.bark();


                }
            }