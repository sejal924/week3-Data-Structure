package com.singlelinkedlist.inventory_management_system;

class InventoryManagement {
     Item head;
     public void insertAtBegin(String itemName,int itemId,int quantity, double price){
        Item newNode = new Item(itemName,itemId,quantity,price);
        if(head== null){
            head=newNode;
            return;
        }

        newNode.next= head;
        head = newNode;
     }
     public void insertAtEnd(String itemName,int itemId,int quantity, double price) {
         Item newNode = new Item(itemName, itemId, quantity, price);
         if(head== null){
             head=newNode;
             return;
         }
         Item temp = head;
         while(temp.next!=null){
             temp = temp.next;
         }
         temp.next = newNode;
     }
     public void insertAtPosition(String itemName,int itemId,int quantity, double price,int position) {
         Item newNode = new Item(itemName, itemId, quantity, price);
         int k =0;
         if (position < 0) {
             System.out.println("Invalid position.");
             return;
         }
         if(position==0){
             insertAtBegin(itemName,itemId,quantity,price);
             return;
         }
         Item temp = head;
         if(k!=position){
             k++;
             temp= temp.next;
         }
         if(temp==null){
             System.out.println("Position overflow.");
             return;
         }
         newNode.next = temp.next;
         temp.next = newNode;
     }
     public void remove(int itemId){
         if(head==null){
             System.out.println("List is already empty.");
             return;
         }
         if(head.itemId==itemId){
             System.out.println("Inventory item with item id " + itemId + " is deleted.");
             head=head.next;
             return;
         }
         Item temp=head;
         while(temp.next!=null){
             if(temp.next.itemId==itemId){
                 System.out.println("Inventory item with item id " + itemId + " is deleted.");
                 temp.next=temp.next.next;
                 return;
             }
             temp=temp.next;
         }
         System.out.println("Inventory item not found.");
     }
     public void search(String itemName, int itemId){
          Item temp = head;
          while(temp!=null){
              if(temp.itemName == itemName || temp.itemId== itemId){
                   System.out.println("----search by item id or idem name----");
                   System.out.println("Item name: "+ temp.itemName);
                   System.out.println("Item Id: "+ temp.itemId);
                   System.out.println("Item quantity: "+ temp.quantity);
                   System.out.println("Item price: "+ temp.price);
              }
              temp = temp.next;
          }
     }
    public void updateQuantity(int itemId, int quantity){
       Item temp=head;
        while(temp!=null){
            if(temp.itemId==itemId){
                temp.quantity=quantity;
                System.out.println("Quantity updated for item id " + itemId + ".");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Item with id " + itemId + " not found.");
    }

    public void totalInventory(){
         double total = 0;
         if(head==null){
             System.out.println("Total inventory: " + total);
             return;
         }
         Item temp = head;
         while(temp!=null){
             total = total + temp.price * temp.quantity;
             temp = temp.next;
         }
         System.out.println("Total inventory: " + total);
     }
    public void displayAll(){
        Item temp=head;
        System.out.println("-----Inventory Items-----\n");
        while(temp!=null){
            System.out.println("Item name  :" + temp.itemName);
            System.out.println("Item Id    :" + temp.itemId);
            System.out.println("Price      :$" + temp.price);
            System.out.println("Quantity   :" + temp.quantity + "\n");
            temp=temp.next;
        }
    }
    public void sort(String by) {
        head = mergeSort(head, by);
        System.out.println("Inventory sorted by " + (by.equals("name") ? "Item Name." : "Price."));
    }

    private Item mergeSort(Item head, String by) {
        if (head == null || head.next == null) {
            return head;
        }

        Item mid = getMiddle(head);
        Item nextOfMid = mid.next;
        mid.next = null;

        Item left = mergeSort(head, by);
        Item right = mergeSort(nextOfMid, by);

        return merge(left, right, by);
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Item merge(Item left, Item right, String by) {
        if (left == null) return right;
        if (right == null) return left;

        Item result;
        if (by.equals("name")) {
            if (left.itemName.compareToIgnoreCase(right.itemName) <= 0) {
                result = left;
                result.next = merge(left.next, right, by);
            } else {
                result = right;
                result.next = merge(left, right.next, by);
            }
        } else {
            if (left.price <= right.price) {
                result = left;
                result.next = merge(left.next, right, by);
            } else {
                result = right;
                result.next = merge(left, right.next, by);
            }
        }
        return result;
    }
}

