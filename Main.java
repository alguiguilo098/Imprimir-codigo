import java.util.Scanner;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner intput=new Scanner(System.in);
        try {
            System.out.println("digite um int");
            int num=intput.nextInt();
            ImprimirCodigoFonteTeste<Integer> imprimir=new ImprimirCodigoFonteTeste<>(num);
            imprimir.getstackcalltesteprint(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            intput.close();
        }
    }

}