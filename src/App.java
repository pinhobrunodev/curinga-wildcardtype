import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {



        // Sabemos que o tipo int,double,stiring,byte,integer sao subtipos de Object
        Object x;
        Integer y = 4;
        x = y;
        System.out.println(x);

// ================================================================================================================

        //LISTAS  do tipo Byte,String,double,integer, etc.. NAO SAO SUBTIPOS de LISTAS do tipo OBJECT

        List<Byte>byteList = new ArrayList<>();
        List<String>stringList = Arrays.asList("Bob","Alex");
        List<Double>doubleList = new ArrayList<>();
        List<Integer>integerList = Arrays.asList(10,20);
        List<Object>objList = new ArrayList<>();
        
        /*objList = integerList;
        objList = byteList;
        objList = stringList;
        objList = doubleList;
        */

     // TIPO CURINGA -> SUPERTIPO DE QUALQUER TIPO DE LISTA. List<?>

    
    List<?> supertipoList = new ArrayList<>();


    /*
        FOI POSSIVEL RELACIONAR,POIS
        O TIPO CURINGA É UM SUPERTIPO
        DE TODAS AS LISTAS

    */
    supertipoList = integerList;
    supertipoList = byteList;
    supertipoList = doubleList;
    supertipoList =stringList;


// ================================================================================================================



   /*
    IMPRIMINDO UMA LISTA DO TIPO STRING E UMA LISTA DO TIPO INTEGER 
    A PARTIR DE UM METODO CURINGA <?>(RECEBENDO QUALQUER TIPO GENERICO) 
   */
   
    imprimirLista(stringList);
    imprimirLista(integerList);
    



    }

 // ================================================================================================================ 

   //   TIPO CURINGA -> METODOS PARAMETRIZAM UM GENERICO DE QUALQUER TIPO
   public static  void imprimirLista(List<?> list) {

    for (Object object : list) {
        System.out.println(object);
    }

   }
// ================================================================================================================

   /*
   NAO FOI POSSIVEL ADICIONAR DADOS A UMA
   LISTA DO TIPO CORINGA ! POIS O COMPILADOR 
   NAO SABE QUAL E O TIPO ESPECIFICO  DA LISTA 
   QUE FOI INSTANCIADA

   EX: 
   List<String>nomes = Arrays.asList("Bruno","Jose");

   add(nomes);

   Nao faz sentido,pois o metodo
   'add' esta adicionando o numero 3 na lista
   porem a lista 'nomes' corresponde a String...

   
  
   public static void add(List<?>list,T t){

       list.add(3);

   }
*/


}
