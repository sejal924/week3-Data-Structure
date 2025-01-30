package com.doublelinkedlist.movie_management_system;

public class MovieManagementSystem {
    public static void main(String [] args){
        MovieManagement mm = new MovieManagement();
        System.out.println("Inserting at beginning:");
        mm.insertAtBegin("Toy Story","John Lassester",2021,3.5);//3
        mm.insertAtBegin("Mary Poppins","Robert Stevenson",2011,4.5);//2
        mm.insertAtBegin("Harry Potter","Mike Newell",2015,3.0);//1
        mm.displayForward();
        System.out.println("Inserting at end:");
        mm.insertAtEnd("Frozen","Jennifer Lee",2012,4.0);
        mm.insertAtEnd("Spyder","A.R. Murugadoss ",2017,3.8);
        mm.displayForward();
        System.out.println("Inserting at position:");
        mm.insertAtPosition(" Bridge of Spies ","Steven Spielberg",2015,4.8,3);

        mm.displayForward();

        mm.search("Mike Newell",4.5);
        mm.updateRating("Frozen",4.4);

        mm.displayForward();
        mm.displayReverse();
    }
}
