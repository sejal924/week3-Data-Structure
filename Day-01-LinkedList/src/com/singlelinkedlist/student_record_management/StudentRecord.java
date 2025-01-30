package com.singlelinkedlist.student_record_management;

class StudentRecord {
    Student head;

    public void insertAtBegin(String name, int rollNumber, int age, char grade) {
        Student newNode = new Student(name, rollNumber, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(String name, int rollNumber, int age, char grade) {
        Student newNode = new Student(name, rollNumber, age, grade);
        Student currNode = head;
        if (head == null) {
            head = newNode;
        }
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.next = null;
    }

    public void insertAtPosition(String name, int rollNumber, int age, char grade, int position) {
        Student newNode = new Student(name, rollNumber, age, grade);
        int k = 1;
        Student currNode = head;
        Student prevNode = null;
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        while (k != position) {
            k++;
            prevNode = currNode;
            currNode = currNode.next;
        }
        if (currNode == null) {
            System.out.println("Out of bound");
        }
        newNode.next = currNode;
        prevNode.next = newNode;

    }

    public void deleteByRollNumber(int id) {
           Student temp = head;
           Student currNode = head;

           while(temp.rollNumber!= id){
               currNode = temp;
               temp = temp.next;
           }
           currNode.next= temp.next;
    }
    public void searchByRollNumber(int id){

           if(head == null){
               System.out.println("List is empty");
           }
        Student temp = head;
           while(temp!=null) {
               if(temp.rollNumber == id) {
                   System.out.println("---Student Record Found ---");
                   System.out.println("Name: " + temp.name);
                   System.out.println("Roll Number: " + temp.rollNumber);
                   System.out.println("Age: " + temp.age);
                   System.out.println("Grade: " + temp.grade);
                   return;
               }
               temp = temp.next;
           }

    }
    public void displayRecords(){
        if(head == null){
            System.out.println("List is empty");
        }
        Student temp = head;
        while(temp != null){
            System.out.println("\nStudent Record");
            System.out.println("Student name is: " + temp.name);
            System.out.println("Student roll number is: " + temp.rollNumber);
            System.out.println("Student age is: "+ temp.age);
            System.out.println("Student grade is: " + temp.grade);
            System.out.println("------------------------------------------");
            temp = temp.next;
        }

    }
    public void updateGrade(int id, char newGrade){
        if(head == null){
            System.out.println("List is empty");
        }
        Student temp = head;
         while(temp!=null){
             if (temp.rollNumber == id) {
                 temp.grade = newGrade;
                 return;
             }
             temp = temp.next;
         }
    }
}
