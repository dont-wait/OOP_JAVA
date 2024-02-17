
package con.fu.di.util;

/**
 *
 * @author Sang
 * @param <T>
 */
//biến data type thành tham số, truyền tham số dưới dạng lấy data type mà truyền
//ko phải truyền value nào đó, kĩ thuật này gọi là GENERIC
//List<Student> list = new ArrayList();
//List......

@FunctionalInterface    //dính dáng đến Lambda expression 
public interface Filter<T> {
                //Generic: tổng quát data
                //data type sẽ đc đưa vào sau
    public boolean check(T x);  //2 thứ sẽ nói sau  //truyền data type như 1 tham số
                       
}
