//package Stack;
//public class StackUsingArray {
//    private int [] stack;
//    private int top;
//    private int capacity;
//
//    public StackUsingArray(int size){
//        stack = new int[size];
//        capacity = size;
//        top = -1;
//    }
//
//    public void push(int data){
//        if(top == capacity -1){
//            System.out.println("Stack full, cannot push"+data);
//            return;
//        }
//        stack[++top]=data;
//        //System.out.println("Pushed to stack: "+data);
//    }
//
//    public int pop(){
//        if(isEmpty()){
//            System.out.println("Stack underflow! Nothing to pop");
//            return -1;
//        }
//        return stack[--top];
//    }
//
//    public int peek(){
//        if(isEmpty()){
//            System.out.println("Stack is empty!");
//            return -1;
//        }
//        return stack[top];
//    }
//
//    public boolean isEmpty(){
//        return top == -1;
//    }
//
//    public void Display(){
//        if(isEmpty()){
//            System.out.println("Stack is empty!");
//            return;
//        }
//        System.out.println("Stack elements are: ");
//        for(int i=0;i<=top;i++){
//            System.out.print(stack[i]+" ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[]args){
//        int size = 4;
//        StackUsingArray stack =new  StackUsingArray(size);
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.Display();
//        System.out.println("TOP ELEMENT IS: "+stack.peek());
//        stack.pop();
//        System.out.println("After pop");
//        stack.Display();
//    }
//}