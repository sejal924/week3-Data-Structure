package com.singlelinkedlist.social_media_friend_connections;

public class SocialMediaManager {
    public static void main(String[] args) {
        SocialMediaLinkedList list = new SocialMediaLinkedList();
        list.addUser(1,"Anju Verma",21);
        list.addUser(2,"Riya Yadav",21);
        list.addUser(3,"Omi Taneja",21);
        list.addUser(4,"Neha Rai",21);

        list.addFriendConnections(1,2);
        list.addFriendConnections(1,3);
        list.addFriendConnections(2,3);
        list.addFriendConnections(3,4);

        list.displayFriends(1);

        list.countFriends();

        System.out.println("Mutual friends between Anju and Omi: " + list.findMutualFriends(1,3));

        list.removeFriendConnection(1,3);

        list.searchUserById(1);
        list.searchUserByName("Riya Yadav");
        list.displayFriends(1);
    }
}
