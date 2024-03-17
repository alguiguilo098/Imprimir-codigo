public class ImprimirCodigoFonte<T> {
    void getstackcalltesteprint(Teste<T> teste){
        teste.testeprint();
        Thread.dumpStack();
    }
}
