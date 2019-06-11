package com.trimind.training.day04;

public class Runner
{
    public static void main(String[] args)
    {
        Manager manager =new Manager("aru",0,0,0,0);
        manager.setName("somename");
        manager.setBonus(8000);
        manager.setSalary(10000);
        System.out.println(manager.getSalary());
        manager.setAge(20);
        System.out.println(manager.getAge());




    }
}
