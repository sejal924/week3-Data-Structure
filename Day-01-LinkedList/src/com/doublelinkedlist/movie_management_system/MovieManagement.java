package com.doublelinkedlist.movie_management_system;


class MovieManagement {
     Movie head;
     public void insertAtBegin(String title,String director,int yearOfRelease, double rating){
      Movie newNode = new Movie(title,director, yearOfRelease, rating);

      if(head== null){
        head = newNode;
        return;
      }
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
     }
     public void insertAtEnd(String title,String director,int yearOfRelease, double rating){
      Movie newNode = new Movie(title,director, yearOfRelease, rating);
      if (head == null) {
             head = newNode;
             return;
         }
      Movie temp = head;
      while(temp.next!=null){
         temp = temp.next;
      }
      temp.next = newNode;
      newNode.prev = temp;
     }
     public void insertAtPosition(String title,String director,int yearOfRelease, double rating,int position){
      Movie newNode = new Movie(title,director, yearOfRelease, rating);
         int k = 1;
         Movie currNode = head;
         Movie prevNode = null;
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
     public void remove(String title){
         if (head == null) {
             System.out.println("List is empty!");
             return;
         }
      Movie temp = head;
      Movie prevNode = null;

      while(temp!=null){
       if(temp.title == title){
           System.out.println("Deleted the record");
           prevNode.next = temp.next;
           temp.next.prev= temp.prev;
           return;
       }
       prevNode = temp;
       temp = temp.next;
      }
     }
     public void search(String director, double rating){
         Movie temp = head;
         while(temp!=null){
             if(temp.director == director || temp.rating == rating){
                   System.out.println("----movie record by search----: ");
                   System.out.println("Title: " + temp.title);
                   System.out.println("Director: " + temp.director);
                   System.out.println("Year of release: " + temp.yearOfRelease);
                   System.out.println("Rating: " + temp.rating);
                   System.out.println("----------------------------------");
                    return;
             }
             temp = temp.next;
         }
     }
     public void displayForward(){
         if (head == null) {
             System.out.println("No movies to display!");
             return;
         }
          Movie temp = head;
         System.out.println("----movie record in forward order----: ");
          while(temp!=null){
              System.out.println("Title: " + temp.title);
              System.out.println("Director: " + temp.director);
              System.out.println("Year of release: " + temp.yearOfRelease);
              System.out.println("Rating: " + temp.rating);
              System.out.println("----------------------------------");
              temp = temp.next;
          }
     }
     public void displayReverse(){
         if (head == null) {
             System.out.println("No movies to display!");
             return;
         }
         Movie temp = head;
         while(temp.next!=null) {
             temp = temp.next;
         }
         System.out.println("----movie record in reverse order----: ");
         while(temp!=null){
            System.out.println("Title: " + temp.title);
            System.out.println("Director: " + temp.director);
            System.out.println("Year of release: " + temp.yearOfRelease);
            System.out.println("Rating: " + temp.rating);
            System.out.println("----------------------------------");
            temp = temp.prev;
         }

     }
     public void updateRating(String title,double rating){
         Movie temp = head;
         while(temp!=null){
             if(temp.title == title){
                 temp.rating = rating;
                 return;
             }
              temp = temp.next;
         }
     }
}
