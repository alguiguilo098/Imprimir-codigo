import java.util.Stack;

public class Teste<T> {
    StackTraceElement[] testeprint(){
        System.out.println("chamada 1");
        System.out.println("chamada 2");
        System.out.println("chamada 3");
        System.out.println("chamada 4");
        System.out.println("chamada 5");
        return Thread.currentThread().getStackTrace();
    }
    void testeStack(T[] array,int num){
        Stack<T> stack=new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.add(array[i]);
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
            Thread.dumpStack();
            return;
        }
    }   
}