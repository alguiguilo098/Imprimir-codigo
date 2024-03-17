import java.util.Stack;

public class Teste<T> {
    private int count;
    public Teste(int count){
        this.count=count;
    }
    public StackTraceElement[] testeprint(int num){
        if (num<count) {
            System.out.println("chamada "+num);
            num++;
            testeprint(num);
        }
        return Thread.currentThread().getStackTrace();
    } 
}