public class Main {

    public static void main(String[] args) {

        MyArrayStack myStack = new MyArrayStack(3);

        System.out.println(myStack.push(1));
        System.out.println(myStack.push(2));
        System.out.println(myStack.push(5));
        System.out.println(myStack.push(4));
        myStack.show();

        myStack.pop();
        myStack.show();
        myStack.pop();
        myStack.show();
        myStack.pop();
        myStack.show();



    }
}