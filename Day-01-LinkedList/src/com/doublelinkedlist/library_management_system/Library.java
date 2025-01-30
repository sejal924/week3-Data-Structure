package com.doublelinkedlist.library_management_system;

class Library {
    String title;
    String author;
    String genre ;
    String bookId;
    String availabilityStatus;
    Library next;
    Library prev;

    Library(String title,String author,String genre,String bookId,String availabilityStatus){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.availabilityStatus=availabilityStatus;
    }
}

