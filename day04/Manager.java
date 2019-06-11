package com.trimind.training.day04;

public class Manager extends Employee
{
   public Manager(String name, int age, int experience, double salary, double bonus)
   {
      super(name, age, experience, salary);
      this.bonus = bonus;
   }

   private double bonus;
   public void getMyAge() {

   }

   public double getSalary()
   {
     return super.getSalary() + bonus;

   }

   public double getBonus() {
      return bonus;
   }

   public void setBonus(double bonus) {
      this.bonus = bonus;
   }
   public  int getAge()
   {
      return  super.getAge();
   }
}
