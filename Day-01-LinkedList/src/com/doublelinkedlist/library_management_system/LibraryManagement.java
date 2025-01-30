package com.doublelinkedlist.library_management_system;



class LibraryManagement {
    Library head;
    public void insertAtBegin(String title,String author,String genre,String bookId,String availabilityStatus){
       Library newNode = new Library(title,author,genre,bookId,availabilityStatus);

        if(head== null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void insertAtEnd(String title,String author,String genre,String bookId,String availabilityStatus){
        Library newNode = new Library(title,author,genre,bookId,availabilityStatus);
        if (head == null) {
            head = newNode;
            return;
        }
        Library temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    public void insertAtPosition(String title,String author,String genre,String bookId,String availabilityStatus,int position){
        Library newNode = new Library(title,author,genre,bookId,availabilityStatus);
        int k = 1;
        Library currNode = head;
        Library prevNode = null;
        if (position == 1) {
            newNode.next = head;
            head.prev = newNode;
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
            return;
        }
        newNode.next = currNode;
        currNode.prev = newNode;
        newNode.prev = prevNode;
        prevNode.next = newNode;
    }
    public void remove(String bookId){
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Library temp = head;
        Library prevNode = head;

        while(temp!=null){
            if(temp.bookId == bookId){
                System.out.println("Deleted the record");
                System.out.println("----------------------------------");
                prevNode.next = temp.next;
                temp.next.prev= temp.prev;
                return;
            }
            prevNode = temp;
            temp = temp.next;
        }
    }
    public void search(String title,String author){
        Library temp = head;
        while(temp!=null){
            if(temp.title == title || temp.author == author){
                System.out.println("----Book information by search----: ");
                System.out.println("Title: " + temp.title);
                System.out.println("Director: " + temp.author);
                System.out.println("Year of release: " + temp.genre);
                System.out.println("Rating: " + temp.bookId);
                System.out.println("Availability Status: " + temp.availabilityStatus);
                System.out.println("----------------------------------");
                return;
            }
            temp = temp.next;
        }
    }
    public void updateAvailability(String title,String availabilityStatus){
        Library temp = head;
        while(temp!=null){
            if(temp.title == title){
                temp.availabilityStatus = availabilityStatus;
                System.out.println("Availability Status updated");
                return;
            }
            temp = temp.next;
        }
    }
    public void displayForward(){
        if (head == null) {
            System.out.println("No book to display!");
            return;
        }
        Library temp = head;
        System.out.println("----Book information in forward order----: ");
        while(temp!=null){
            System.out.println("Title: " + temp.title);
            System.out.println("Director: " + temp.author);
            System.out.println("Year of release: " + temp.genre);
            System.out.println("Rating: " + temp.bookId);
            System.out.println("Availability Status: " + temp.availabilityStatus);
            System.out.println("----------------------------------");
            temp = temp.next;
        }
    }
    int cnt=0;
    public void displayReverse(){
        if (head == null) {
            System.out.println("No movies to display!");
            return;
        }
        Library temp = head;
        while(temp.next!=null) {
            temp = temp.next;
            cnt++;
        }
        System.out.println("----Book information in reverse order----: ");
        while(temp!=null){
            System.out.println("Title: " + temp.title);
            System.out.println("Director: " + temp.author);
            System.out.println("Year of release: " + temp.genre);
            System.out.println("Rating: " + temp.bookId);
            System.out.println("Availability Status: " + temp.availabilityStatus);
            System.out.println("----------------------------------");
            temp = temp.prev;
        }

    }
    public void totalBooks(){
        System.out.println("Total Book: " + cnt);
    }

}
