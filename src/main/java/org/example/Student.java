package org.example;

public class Student{String name;
    int rollno;
    Student(){}
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public void walk(){
        System.out.println(" I am walking");
    }
    class Dog { String name;
        String breed;
        public Dog(String name ,String breed){
            this.name=name;
            this.breed= breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    public void bark(){
        System.out.println(" Dog is barking");
    }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';


    }
}
