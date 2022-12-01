package com.cust.software;

public class Main {
    public static void main(String[] args) {
        Animals cat=new Cat();
        Animals dog=new Dog();
        Animals tiger=new Tiger();
        Admin admin=new Admin();
        admin.Job(cat);
        admin.Job(dog);
        admin.Job(tiger);

    }
}
