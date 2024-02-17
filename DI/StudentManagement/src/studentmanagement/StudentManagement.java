/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import com.fu.di.dao.FilterBySE;
import com.fu.di.dao.StudentManager;
import com.fu.di.dto.Student;
import con.fu.di.util.Filter;
import java.util.*;

/**
 *
 * @author Sang
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //saveAStudent();
        //testStudentManager();
        //testStudentManagerUsingSimpleFilter();
        //testGetStudentBySE();
        //testGetStudentsBySEGp5UsingAnonymous();
        testGetStudentsBySELt5UsingAnonymous();
    }
    public static void testGetStudentsBySELt5UsingAnonymous() {
        StudentManager sm = new StudentManager();
        //Lamda xuất hiện, rút gọn tên hàm, tên class
        //                      anonymous method name
        //                      hàm vô danh của class vô danh thuộc về interface
        //Filter<Student> se =  new...  //có code cho hàm check()
//        Filter<Student> se = x -> {if (x.getMajor().equalsIgnoreCase("SE") 
//                                            && x.getGpa() <=5)
//                                return true;
//                            return false;};
//        Filter<Student> se = x -> {return x.getMajor().equalsIgnoreCase("SE") 
//                                            && x.getGpa() <=5; };
//        Filter<Student> se = x ->  x.getMajor().equalsIgnoreCase("SE") 
//                                            && x.getGpa() <=5;
        List<Student> list = sm.getStudents(x ->  x.getMajor().equalsIgnoreCase("SE") 
                                            && x.getGpa() < 5); //bộ lọc chỉ có 1 câu lệnh thì chi phải viết vất vả, t gọi lun cho tiện
                                                                //lambda expression
        for (Student x : list) {
            x.showProfile();
            //Collections.s
        }               
    }
    //cách tạo class FilterSE rời rạc, làm riêng, đủ hay, nhưng hơi tốn kém
    //tạo class dùng ko nhiều lần, vậy lược bớt thao tác tạo class
    //mục đích cuối cùng: cần code if của hàm check()
    //vì chỉ cần object.check() là đủ
    //2 giải pháp: Anonymous class, class ngầm hiểu, ko cần tên gì cả
    //             mượn gió bẻ măng, mượn Interface new luôn
    //                            bung rộng gõ code @Override
    
    //FUNCTIONAL PROGRAMMING - HÀM LÀ THAM SỐ
    //             lược bỏ luôn tên class, tên hàm, chỉ cần focus vào
    //code trong hàm là đủ, câu if là đủ
    //hàm getStudent(chỉ cần đưa vào hàm là đủ)
    //                  Filter<Student> cond)
    //                                  ko cần tạo object, có tạo xog
    //                                  tao chỉ .check
    //                                              tao cần cái if
    //                      rút gọn tối đa phần dư, focus hàm xử lí
    //                      giống biểu thức, công thức, Lambda Expression
    //Collections.sort(list, việc so sánh 2 object)
    //                          DI, hàm compare(o1, o2) hoy
    //                              Comparator Functional Interface
  
    public static void testGetStudentsBySEGp5UsingAnonymous() {
       StudentManager sm = new StudentManager();   
       Filter<Student> SEfilter = new Filter<Student>() {
            @Override
            public boolean check(Student x) {
                if (x.getGpa()>= 5 && x.getMajor().equalsIgnoreCase("SE"))
                        return true;
                return false;
            }
        };
       //   |
       //   v
        System.out.println("The list of SE student(s) with GPA >= 5");
        List<Student> list = sm.getStudents(SEfilter);
        for (Student x : list) {
            x.showProfile();
        }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
    }
    
    
    public static void testGetStudentBySE() {
        StudentManager sm = new StudentManager();
        FilterBySE seFilter = new FilterBySE(); //new bộ Lọc SE
        //seFilter.check(x);  //có code rồi đó
        //chích phụ thuộc vào nè
        System.out.println("The list of SE student");
        List<Student> list = sm.getStudents(seFilter);
        for (Student x : list) {
            x.showProfile();
        }
        
    }
    
    public static void testStudentManagerUsingSimpleFilter() {
        StudentManager sm = new StudentManager();
        
        System.out.println("The list of avaiable students");
        for (Student x : sm.getStudents(1))
            x.showProfile();
        
        System.out.println("The list of avaiable students (3)");
        for (Student x : sm.getStudents(2))
            x.showProfile();
        
        System.out.println("The list of avaiable students (2)");
        for (Student x : sm.getStudents(3))
            x.showProfile();
        
    }
    //có thể xài JUnit/Unit Testing vào
    public static void testStudentManager() {
        StudentManager sm = new StudentManager();
        System.out.println("The list of avaiable students");
        for (Student x : sm.getAll()) {
            x.showProfile();
        }
        System.out.println("The list of SE students (3)");
        for (Student x : sm.getSESTUDENTS()) {
            x.showProfile(); 
        }
        System.out.println("The list of SE students >= 5 (2)");
        for (Student x : sm.getSESTUDENTSGt5()) {
            x.showProfile(); 
        }
        
    }
    public static void saveAStudent() {
        Student x = new Student("SE686868", "LỘC PHÁT", 2001, 6.8, "SE");
        x.showProfile();
    }
}
