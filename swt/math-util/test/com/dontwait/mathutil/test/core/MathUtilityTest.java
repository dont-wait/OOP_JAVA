/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.dontwait.mathutil.test.core;

import com.dontwait.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author Sang
 */
public class MathUtilityTest {
    //đây là class sẽ sử dụng các hàm của thư viện/framework JUnit
    //để kiểm thử/kiểm tra cdoe chính - hàm tínhGiaiThừa() bên
    //class core.MathUtil
    //viết code để test code chính bên kia!!!
    
    //có nhiều quy tắc đặt tên hàm kiểm thử
    //nhưng thường sẽ là nói lên mục đích của các casse/tình huống kiểm thử
    //tình huống xài hàm theo kiểu thành công và thất bại!!!
    
    //hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon
    //ta sẽ xài hàm kiểu well - đưa 5!, 6!, hok chơi -5!, 30!
    
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    //Có nhiều @Test với nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0;  //test thử tình huống tử tế đầu vào, mày phải chạy đúng
        long expected = 1;  //hy vọng 0! = 1
        
        //long actual = ;//gọi hàm cần test tên core/app chính/code chính
        long actual = MathUtil.getFactorial(n);
        
  
        //so sánh expected vs/ actual dùng xanh xanh đỏ đỏ, framework
        Assert.assertEquals(expected, actual);
        
        
        
        
        //gộp thêm vài case thành công/đưa đầu vào ngon!!! hàm phải tính ngon
        Assert.assertEquals(1, MathUtil.getFactorial(1));  //tui mún 1! = 1
        Assert.assertEquals(2, MathUtil.getFactorial(2));  //tui mún 2! = 2
        Assert.assertEquals(6, MathUtil.getFactorial(3));  //tui mún 3! = 6
        Assert.assertEquals(24, MathUtil.getFactorial(4));  //tui mún 4! = 24
        Assert.assertEquals(12, MathUtil.getFactorial(5));  //tui mún 5! = 120
        Assert.assertEquals(720, MathUtil.getFactorial(6));  //tui mún 6! = 720

    }   

        //hàm giúp so sánh 2 giá trị nào đó có giống nhau hay ko
        //nếu giống nhau -> thấy màu xanh đèn đường = đường thông, code ngon
        //                  ít nhất cho case đang test
        //nếu KO GIỐNG NHAU -> thẩy màu đỏ đèn đường 
        //                        hàm ý expected và actual ko giống nhau
        


}
