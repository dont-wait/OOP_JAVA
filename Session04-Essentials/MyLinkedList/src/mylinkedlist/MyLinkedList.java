/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mylinkedlist;

/**
 *
 * @author Sang
 */
public class MyLinkedList {
    
    public static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    public static Node addToTail(Node headNode, int value) {
        Node newNode = new Node(value);
        if(headNode == null)
            return newNode;
        else {
            //B1: Xác định Last Node (LastNode.next == null)
            Node lastNode = headNode;
            while(lastNode.next != null) {
                lastNode = lastNode.next;
            }
            //B2: Gán next cho LastNode = newNode
            lastNode.next = newNode;
        }
        return headNode;
    }
    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value); // NEW N1 = 0
                                        // N1.NEXT = N2 = 2
        if(headNode != null) 
            newNode.next = headNode;    // thằng đứng trc sẽ thành thằng đứng sau
                                        // head đang là n1
                                        // tao trỏ tới n1, và mày sẽ là node.next của tao
                                        // tao chiếm lun vị trí của m.
    
        return newNode;
    }
    
    public static void printLinkedList(Node head) {
        if(head == null)
            System.out.println("List is empty");
        else {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if(temp != null) {
                    System.out.print("->");
                }else
                    System.out.println();
            }
        }
            
    }
    
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        
        n1.next = n2;
        n2.next = n3;
        
        //printLinkedList(n1);
//        n1 = addToHead(n2, 10);
//        printLinkedList(n2);    //tại vị trí 2 đã có 10 chèn vào
//                                    //10 lúc này sẽ đứng thứ 1 n1          10->2->3
//                                    //cho nên khi in từ n2 tức là 2->3

//        n1 = addToHead(n1, 0);
//        printLinkedList(n1);
//        printLinkedList(n2);
//        printLinkedList(n3);
////        n1 = addToHead(n2, 0);
////        printLinkedList(n2);
////        
////        n2 = addToHead(n2, 0);
////        printLinkedList(n1);
//        
//        n1 = addToHead(n2, 0);  //n1 mới hoàn toàn, ếu chứa value là 1 nx mà là 0
//        printLinkedList(n1);    //TAO CÓ GIA ĐÌNH RIÊNG
        
        //1 node là 1 danh sách liên kết
        //1 danh sách liên kết là gồm nhiều node
        //khi ta dùng hàm add thêm 1 node vào 1 dslk đã có sẵn
        //nó sẽ ăn theo cái node đã thay đổi
        
        //ví dụ: node n1 là 1 head của 1 dslk gồm các node n2 n3
        //khi ta dùng hàm add thêm node n0 vào n1, lập tức, n1 lúc này là 1 node mới 
        //n1 lúc này chứa cả n0         n0(head) n1 n2 n3
        
        //Ta dùng trick lỏ: thêm vào n1, nhưng lại mún in từ n2
        //n2 lúc này là 1 node 1 dslk riêng biệt, khác với dslk ở trên
        //thêm vào n1 mà in từ n2: BỐ KHỈ, TAO LÀ 1 DSLK MỚI, TAO KHÁC VỚI M
        //CHÚNG SINH BÌNH ĐẲNG, AI CX CÓ GIA ĐÌNH RIÊNG
        
        //HIỂU CỤ THỂ HƠN, KHI THÊM 1 NODE VÀO LL THÌ CÁC NODE KIA CHỈ DI CHUYỂN GIÃN RA, CHỨ KHÔNG HỀ
        //BỊ THAY ĐỔI VỊ TRÍ, NHƯ TRONG MẢNG 1 CHIỀU, ARRAYLIST
        
        //KHÔNG NÊN CHƠI TẮT, NẾU BẠN KHÔNG CHẮC CÓ THỂ QUẢN LÍ HẾT ĐỐNG CON CỦA BẠN :)
        //CHƠI KHÔNG CHẮC CÓ THỂ DẪN TỚI LOOSE DATA
        
        //VALUE MỚI SẼ LÀ CỦA THẰNG HEAD.NEXT
        //Node newNode = addToHead(n1, 0);
        Node newNode = addToTail(n1, 0);

        printLinkedList(newNode);
        
    }
    
}
