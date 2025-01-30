package com.doublelinkedlist.library_management_system;



public class LibraryManagementSystem {
    public static void main(String [] args){
        LibraryManagement lm = new LibraryManagement();
        System.out.println("Inserting at beginning: ");
        lm.insertAtBegin("Good Habits","Richard","Motivational","R2345","YES");//2
        lm.insertAtBegin("100 rules","Stephen","Motivational","S5678","NO");//1
        lm.displayForward();

        System.out.println("Inserting at end");
        lm.insertAtEnd("Three Mistake of My Life","Chetan Bhagat","Fiction","CB5678","YES");//3
        lm.insertAtEnd("Power of Subconscious Mind","Stephen","Science","PS5678","NO");//4
        lm.displayForward();

        System.out.println("Inserting at position");
        lm.insertAtPosition("How to talk to stranger","Lewis","Informative","L5678","YES",3);
        lm.displayForward();

        lm.remove("S5678");
        lm.search("Power of Subconscious Mind","PS5678");
        lm.updateAvailability("How to talk to stranger","NO");

        lm.displayForward();
        lm.displayReverse();
        lm.totalBooks();

    }
}

