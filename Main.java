public class Main {
    public static void main(String[] args) {
        Teste<Integer> teste=new Teste<>();
        StackTraceElement[] stack=teste.testeprint();
        for (int i = 0; i < stack.length; i++) {
            System.out.println(stack[i].getMethodName());
        }        
    }
}
