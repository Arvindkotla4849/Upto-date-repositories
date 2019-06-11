package com.trimind.training.day05;

public class StudentRunner
{
    public static void main(String[] args)
    {
        //Student[] student = new Student[5];
        Student student1 = new Student("std1", 1);
        Student student2 = new Student("std2", 2);
        Student student3 = new Student("std3", 3);
        Student student4 = new Student("std4", 4);
        //Student student5 = new Student("std5", 5);

        Student[] student = {student1, student2, student3, student4};
        Student s = new Student("aru", 1);
        System.out.println(studentExists(student, s));
    }

        public static boolean studentExists(Student[] p, Student q)
        {
            for (Student student:p)
            {
                if (student.equals(q))
                {
                    return true;
                }

            }
            return false;
        }

    }

