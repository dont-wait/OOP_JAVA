/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dontwait.node.cabinet;

import com.dontwait.node.core.core.Node;
import java.util.Scanner;

/**
 *
 * @author Sang
 */
public class Cabinet {
//    public static Node findX(Node head, int x) {
//        if(isEmpty(head))
//            return null;
//        else
//            while(head != null) {
//                head = head.next;
//                if(head.value == x)
//                    return head;
//                
//            }
//        return null;
//    }
    public static Node removeTail(Node headNode) {
        if(headNode == null)
            return null;
        else {
            //b1: xác định node trước node cuối cùng; bởi vì nếu chỉ tìm đến nốt cuối cùng mà return
            //danh sách lúc này trống rỗng return cái dề
            //LOGIC: GHI TA MÚN XÓA XỔ AI ĐÓ, TA LUN NHỚ VỀ NGƯỜI THÂN GẦN ANH TA(NODE) ĐÓ ĐỂ MÀ KHOK THƯN
            Node lastNode = headNode;
            Node prevNode = null;
            
            //b2: Nối sợi dây vào lời ước cuối cùng
            while(lastNode.next != null) {
                prevNode = lastNode;            //2 chàng trỏ 1 nàng, 2 chàng cùng theo đủi
                lastNode = lastNode.next;       //thế nhưng mối tình này ngừi tội là ngừi iu thầm không dám thổ lộ
                                                //chỉ dám núp sau bóng lưng nàng, âm thầm THEO DỎI CHA ĐÓ CÓ TỐT VỚI EM HÔNG :<
           }
               if(prevNode == null) 
                    return null;
               else 
                   prevNode.next = lastNode.next;
        }
        return headNode;
    }
    public static Node removeHead(Node headNode) {
        if(headNode == null)
            return headNode;
        return headNode.next;
    }
    public static Node addToIndex(Node headNode, int value, int index) {
        Node newNode = new Node(value);
        
        if(headNode == null)
            return addToHead(headNode, value);
        else {
            //b1: cần tìm vị trí cần thêm
            //vị trí cần thêm phải có cùng phần tử
            Node currNode = headNode;
            int count = 0;
            while(currNode.next != null) {
                count++;    
                //b2: add khi bước đếm == index tìm kiếm
                if(count == index) {
                    newNode.next = currNode.next;
                    currNode.next = newNode;
                    break;
                }
                
                currNode = currNode.next;    
            }
        }
        
        return headNode;
    }
    public static Node addToTail(Node headNode, int value) {
        Node newNode = new Node(value);
        if(headNode == null)
            return headNode;
        else {
            Node lastNode = headNode;
            
            //b1: tìm phần tử cuối danh sách
            while(lastNode.next != null) {
                lastNode = lastNode.next;
            }
            //b2 tìm đc gòi thì nối sợi dây vào thằng mới thêm zô
            lastNode.next = newNode;
        }
            
        
        return headNode;
    }
    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);
        
        if(headNode != null)
            newNode.next = headNode;
        
        return newNode;   
    }
    public static Node getLinkedList() {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input value n%d: ", count);
        int value = sc.nextInt();
        Node newNode = new Node(value);
    
        return newNode;
    }
    public static boolean isEmpty(Node head) {
        return head == null;
    }
    public static int getSumNodeListV2(Node head) {
        int sum = 0;
        if (head == null) {
            return 0;
        } else {
            while (head != null) {
                if(head.value % 2 == 0)
                    sum += head.value;
                head = head.next;
            }
        }
        return sum;
    }

    public static int getSumNodeList(Node head) {
        int sum = 0;
        if (head == null) {
            return 0;
        } else {
            while (head != null) {
                sum += head.value;
                head = head.next;
            }
        }

        return sum;
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (head != null) {   //chừng nào thằng đứng đầu nốt bằng null thì in tiếp đê

                System.out.print(head.value);
                head = head.next;

                if (head != null) {
                    System.out.print("->");
                } else {
                    System.out.println("");
                }
            }

        }
    }
}
