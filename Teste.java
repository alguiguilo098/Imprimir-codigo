public class Teste<T> {
    private int count;
    public int get_count(){
        return count;
    }
    public Teste(int count){
        this.count=count;
    }
    public StackTraceElement[] testeprint(int num){
        if (num<count) {
            if (num==0) {
                System.out.println("============SAIDA============");
            }
            System.out.println("chamada "+num);
            num++;
            StackTraceElement[]stacktracelement=testeprint(num);
            return stacktracelement;
        }
        return Thread.currentThread().getStackTrace();
    } 
}