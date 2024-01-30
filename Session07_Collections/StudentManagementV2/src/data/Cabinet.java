
package data;

import java.util.*;

/**
 *
 * @author Windows
 */
public class Cabinet {
    //Tủ sẽ có nhiều ngăn chứa nhiều món đồ. Ta xài mảng, ArrayList, Collections nói chung
    //để lưu trữ nhiều đồ
    //từ từ các bạn sv đến nhập học, nộp hồ sơ, và ta cất vào tủ arr
    private List<Student> arr = new ArrayList();
    private Scanner sc = new Scanner(System.in);
    
    //làm biếng làm phễu luôn, mọi thứ sẽ là default, Túi từ từ đc add() vô
    //mình ko chơi trò mua Tủ có sẵn luôn 1 cái Túi, trong túi có 1 đóng đồ, có sẵn hồ sơ
    //nếu mún làm, thì new sẵn túi bên ngoài, có sv sẵn đưa vào tủ, okie

    //default/empty contructor. Ko làm gì cả

    public Cabinet() {
                                                                                                                                                                                               
    }
    public void deleteAStudent(int viTriMuonXoa) {
        arr.remove(viTriMuonXoa);
        
        System.out.println("The list after remoting sinh vien thu " + viTriMuonXoa);
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
    }
    public int SinhVienTrung() {
        if(arr.isEmpty())
           return -1;
        for (int i = 0; i < arr.size() - 1; i++) 
            for (int j = i + 1; j < arr.size(); j++) 
                if(arr.get(i).getName().equals(arr.get(j).getName()))
                    return j + 1;
         
        return -1;
    }
    public  Student searchAStudent(String name) {
        if(arr.isEmpty())
           return null;
        for (int i = 0; i < arr.size(); i++) 
            if(arr.get(i).getName().equalsIgnoreCase(name))
                return arr.get(i);
        return null;
        
    }
    public void sortStudentList() {
        
        for (int i = 0; i < arr.size() - 1; i++) 
            for (int j = i + 1; j < arr.size(); j++) 
                if(arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student x = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, x);
                }
            
        
    }
    //hành động của cái Tủ là: thêm hs, tìm hs, sắp xếp hs, xóa hs, update hs
    public void addAStudent() {
        
        String id, name;
        int yob;
        double gpa;
        
        System.out.println("Input student profile #" + (arr.size() + 1));
        
        System.out.print("Input id: ");
        id = sc.nextLine().trim().toUpperCase();// cắt trắng dư đổi qua Hoa
                            //String là obj, vùng new, học sau
        System.out.print("Input name: ");
        name = sc.nextLine().trim().toUpperCase();
        
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
                //MyToys
        arr.add(new Student(id, name, yob, gpa));
        System.out.println("the new student has been added successfully");
                
    }
    public void printStudentList() {
        if(arr.isEmpty()) {
            System.out.println("The student list is empty. Nothing to print");
            return;
        }
        System.out.println("There is/are " + arr.size() + " student (s)");
        for (Student x : arr) {
            x.showProfile();
        }
    }
}
