package com.singlelinkedlist.inventory_management_system;

class Item {
     String itemName;
     int itemId;
     int quantity;
     double price;
     Item next;

     Item(String itemName,int itemId,int quantity, double price){
         this.itemName = itemName;
         this.itemId = itemId;
         this.quantity = quantity;
         this.price = price;
     }
}
