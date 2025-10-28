/*

Q1. Simple Constructor Initialization

Question:
Create a class Student with the following attributes: name (String) and age (int).

Write a constructor to initialize these attributes.

Create an object and print the student details.


*/




class Student
{

  String name;
  int age;

  Student(String name, int age) 
   { 
     this.name = name;
     this.age = age;
   }


   void displaydata()
    { 
      System.out.println("Name = "  + name);
      System.out.println("Age = "  + age);
    }

}



public class StudentDataStore
{
 public static void main(String ss[])
  {

   Student obj = new Student("shantanu" , 21);

   obj.displaydata();
  }
}