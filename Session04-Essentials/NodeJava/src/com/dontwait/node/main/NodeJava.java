/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.dontwait.node.main;

import com.dontwait.node.cabinet.Cabinet;
import com.dontwait.node.core.core.Node;


/**
 *
 * @author Sang
 */
public class NodeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        
        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
//        n5.next = Cabinet.getLinkedList();
//        Cabinet.printLinkedList(n0);
//        System.out.println("The sum of Node list is: " + Cabinet.getSumNodeList(n0));
//        System.out.println("The sum of even value of Linked List is: " + Cabinet.getSumNodeListV2(n0));
        
        
        Cabinet.printLinkedList(n0);
        
//        n0 = Cabinet.addToHead(n0, 10);
//        Cabinet.printLinkedList(n0);
        
        n0 = Cabinet.addToTail(n0, 6);
        Cabinet.printLinkedList(n0);
        
//        n0 = Cabinet.addToIndex(n0, 15, 5);
//        Cabinet.printLinkedList(n0);
        
        //n0 = Cabinet.removeHead(n0);
        //Cabinet.printLinkedList(n0);
        n0 = Cabinet.removeTail(n0);
        Cabinet.printLinkedList(n0);
    }
    
}
