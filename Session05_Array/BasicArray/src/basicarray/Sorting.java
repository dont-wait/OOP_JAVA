package basicarray;

/**
 *
 * @author Admin
 */
public class Sorting {

    //Thêm 1 main() ngoài main() ban đầu, main() phải mở lên Shift-F6
    //F6 đứng ở class nào cx đc, ưu tiên/default chạy main() đaià tiên tạo ra
    //có thể đổi main() default đc nếu mún
    //phải chuột Properties/Run/...
    public static void main(String[] args) {
        //System.out.println("AHIHI");
        //sortPrimitiveArray();
        sortStudentList(); //OBJECT-ARRAY
    }

    public static void sortStudentList() {
        Student arr[] = new Student[]{new Student("SE9", "CHÍN", 9, 19),
                                      new Student("SE5", "NĂM", 5, 15),
                                      new Student("SE7", "BẢY", 7, 17),
                                      new Student("SE9", "BA", 3, 13),
                                      new Student("SE8", "Tám", 8, 18)
        };
        System.out.println("The student list before sorting");
        for (Student x : arr) {
            x.showProfile();
        }
        for (int i = 0; i < arr.length - 1; i++) 
            for (int j = i + 1; j < arr.length; j++) 
                if (arr[i].getGpa() > arr[j].getGpa()) {
                        Student t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;
                    }
            
        System.out.println("The student list after sorting ascending by GPA");
        for (Student x : arr) {
            x.showProfile();
        }

        
    }

    public static void sortPrimitiveArray() {
        //int[] arr = new int[10];

        int[] arr = new int[]{1000, -1000, 5, 10, -15, -20};
        System.out.println("Before sorting ascending");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        //SELECTION SORT - NƯỚC LÊN THUYỀN LÊN by giáo.làng
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //if thằng đầu lớn hơn thằng sau, đổi ngay và luôn
                if (arr[i] > arr[j]) {  //[i] trước [j]
                    int t = arr[i];     //mày trước tao, mà lại lớn hơn tao
                    arr[i] = arr[j];    //đổi
                    arr[j] = t;
                }   // > TĂNG DẦN, < GIẢM DẦN
            }
        }

        System.out.println("");
        System.out.println("After sorting ascending");
//        for (int x : arr) {
//            System.out.print(x + " ");
//        }   
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
