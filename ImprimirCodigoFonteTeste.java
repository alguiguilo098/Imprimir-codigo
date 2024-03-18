
public class ImprimirCodigoFonteTeste<T> {
    Teste<T> teste;

    ImprimirCodigoFonteTeste(int end){
        this.teste=new Teste<>(end);   
    }
   //funçao que imprime a funçao 
    @SuppressWarnings("unused")
    public void getstackcalltesteprint(int begin){
        StackTraceElement[] stackprint=this.teste.testeprint(begin);
        System.out.println("==============================");
        System.out.println();
        System.out.println();
        for (int i=stackprint.length-1;i>0;i--) {
            if (stackprint[i].getMethodName()=="main") {
                System.out.println("public static void main(String[] args){");
            }else if(stackprint[i].getMethodName()=="getstackcalltesteprint"){
                System.out.println("     "+"getstackcalltesteprint"+"("+"0"+");");
            }else{
                Integer iteratior=stackprint.length-i-3; 
                System.out.println("     "+stackprint[i].getMethodName()+"("+iteratior+");");
           }
        }
        System.out.println();
        System.out.println("}");
        stackprint=null;
    }
}
