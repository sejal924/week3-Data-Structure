package com.singlelinkedlist.inventory_management_system;

public class InventoryManagementSystem {
    public static void main(String [] args){
        InventoryManagement list = new InventoryManagement();
        System.out.println("Inserting at begin: ");
        list.insertAtBegin("Sugar",234,4,250);//3
        list.insertAtBegin("Grains",238,5,150);//2
        list.insertAtBegin("Cereals",240,6,200);//1

        System.out.println("Inserting at end: ");
        list.insertAtEnd("Maggie",302,2,50);
        list.insertAtEnd("Biscuits",322,10,80);

        System.out.println("Inserting at position");
        list.insertAtPosition("Pulses",404,6,300,4);

        list.displayAll();

        list.remove(238);
        list.updateQuantity(322,5);
        list.search("Flour",302);
        list.totalInventory();
        System.out.println("\nSorting inventory by Name:");
        list.sort("name");
        list.displayAll();

        System.out.println("\nSorting inventory by price:");
        list.sort("price");
        list.displayAll();
    }
}
