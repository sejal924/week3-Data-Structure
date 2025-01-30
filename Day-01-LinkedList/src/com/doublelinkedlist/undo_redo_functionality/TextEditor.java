package com.doublelinkedlist.undo_redo_functionality;

public class TextEditor {
    TextNode head, tail, current;
    int size,maxSize;

    TextEditor(int maxSize){
        this.head=null;
        this.tail=null;
        this.current=null;
        this.size=0;
        this.maxSize=maxSize;
    }

    //1.method to add a new state to the list
    public void addState(String state){
        TextNode newNode=new TextNode(state);

        //if the current node is not latest node(at the end), delete the forward history.
        if(current!=null&& current.next!=null){
            current.next=null;
            tail=current;
        }

        //adding a new state
        if(tail==null){
            //first state
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }

        current=tail;
        size++;
    }

    //2.Undo functionalities
    public void undo(){
        if(current!=null&&current.prev!=null){
            current=current.prev;
        }else{
            System.out.println("No more undo possible.");
        }
    }

    //3.Redo functionalities
    public void redo(){
        if(current!=null&&current.next!=null){
            current=current.next;
        }else{
            System.out.println("No more redo possible.");
        }
    }

    //4.Display the current state
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.state);
        } else {
            System.out.println("No state available.");
        }
    }
}
