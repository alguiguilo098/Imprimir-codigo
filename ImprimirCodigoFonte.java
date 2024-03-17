
public class ImprimirCodigoFonte<T> {
    public void getstackcalltesteprint(Teste<T> teste, int num){
        StackTraceElement[]stack=teste.testeprint(num);
        for (int i=stack.length;i>0;i--) {
            stack[i].getMethodName();
        }
    }
}
