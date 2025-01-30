package com.singlelinkedlist.student_record_management;

 class Student {
     String name;
     int rollNumber;
     int age;
     char grade;
     Student next;


     Student(String name, int rollNumber, int age, char grade) {
         this.name = name;
         this.rollNumber = rollNumber;
         this.age = age;
         this.grade = grade;
         this.next = null;
     }

 }
