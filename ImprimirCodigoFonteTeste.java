
public class ImprimirCodigoFonteTeste<T> {
    Teste<T> teste;

    ImprimirCodigoFonteTeste(int end){
        this.teste=new Teste<>(end);   
    }

    @SuppressWarnings("unused")
    public void getstackcalltesteprint(int begin){
        StackTraceElement[] stackprint=this.teste.testeprint(begin);
        for (int i=stackprint.length-1;i>0;i--) {
            Integer iteratior=14-(i+1); 
            if (stackprint[i].getMethodName()=="main") {
                System.out.println("public static void main(String[] args){");
           }else if(stackprint[i].getClassName()=="getstackcalltesteprint"){
            System.out.println("   "+"getstackcalltesteprint"+"("+"0"+")");
           }else{
            System.out.println("    "+stackprint[i].getMethodName()+"("+iteratior+")");
           }
        }
        System.out.println();
        System.out.println("}");
        stackprint=null;
    }
}
