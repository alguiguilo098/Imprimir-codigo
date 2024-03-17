import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner intput=new Scanner(System.in);
        try {
            System.out.println("digite um int");
            int num=intput.nextInt();
            Teste<Integer> teste=new Teste<>(6);
            StackTraceElement[] stack=teste.testeprint(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            intput.close();
        }
    }
}
