package com.singlelinkedlist.student_record_management;

public class StudentRecordManagement {
    public static void main(String [] args){
        StudentRecord  sr = new StudentRecord();
        System.out.println("Enter at the begining");
        sr.insertAtBegin("Anju",200,20,'A');
        sr.insertAtBegin("Arshi",202,21,'B');
        sr.insertAtBegin("Tiya",207,25,'D');
        sr.displayRecords();

        System.out.println("Enter at the position");
        sr.insertAtPosition("Neha",206,22,'B',2);
        sr.displayRecords();

        System.out.print("Enter at the end");
        sr.insertAtEnd("Riya",205,23,'C');
        sr.displayRecords();

        System.out.println("deleting a record!");
        sr.deleteByRollNumber(207);

        System.out.println("updated a record");
        sr.updateGrade(202,'C');
        sr.displayRecords();

        sr.searchByRollNumber(200);
        System.out.print("searched a record");

    }
}
