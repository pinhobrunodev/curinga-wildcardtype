## Utilização do tipo Curinga (Wildcard type)  <?>



📌 1-Sabemos que o tipo int,integer,double,float,string,byte... etc,
são subtipos de Object.

Ex:
        Object x;
        Integer y = 4;
        x = y;


📌 2-Entretanto, uma LIST do tipo int,integer,double,float,string,byte... etc,
nao sao subtipos de uma LIST do tipo OBJECT.

Ex:

        List<Byte>byteList = new ArrayList<>();
        List<String>stringList = Arrays.asList("Bob","Alex");
        List<Double>doubleList = new ArrayList<>();
        List<Integer>integerList = Arrays.asList(10,20);
        List<Object>objList = new ArrayList<>();

       🚫 As expressões abaixo apresentam o seguinte erro ...


       ⚠️ Type mismatch: cannot convert from List<Integer> to List<Object>Java(16777233)

        objList = integerList;
        objList = byteList;
        objList = stringList;
        objList = doubleList;


📌 3-Com a utilização do tipo CURINGA <?>...

📌 3.1-Temos um supertipo de qualquer tipo de lista. ✅

📌 3.2-Com tipos curinga, podemos fazer métodos que recebem
uma lista do tipo genérico de qualquer tipo. ✅

Ex: 

    public static print(List <?> list){
    for(Object obj : list){
        System.out.println(obj);
    }
    }


📌 3.4-Como é feito agora a relação do item 2...

Ex:

    List<?> supertipoList = new ArrayList<>();

    supertipoList = integerList;
    supertipoList = byteList;
    supertipoList = doubleList;
    supertipoList =stringList;

    ⚠️ Só  foi possivel fazer essa relação,pois o tipo
    curinga <?> é um supertipo de todas as listas



📌 4-Imprindo uma lista qualquer usando o tipo Curinga <?>.

Ex:
     
   public static  void imprimirLista(List<?> list) {
    for (Object object : list) {
        System.out.println(object);
    }

   } 

📌 4.1-Imprindo uma lista do tipo String..

Ex:

   List<String> nomes = Arrays.asList("Bruno","Mauricio");

    imprimirLista(nomes);

    
📌 4.2-Imprindo uma lista do tipo Int..

Ex:

   List<int> idades = Arrays.asList(20,22);

    imprimirLista(idades);



📌 5 - Não é possivel adiconar dados a uma coleção do tipo Curinga...


Ex:

    public static void add(List<?>list){
       list.add(3);
    }

    List<String>nomes = Arrays.asList("Bruno","Jose");

   add(nomes);


    ⚠️ Não foi possivel adicionar,pois
    o compilador não sabe qual é o tipo
    específico da lista que foi instanciada

    ⚠️ No exemplo demonstrado no item 5,eu possuo uma lista
    de String e estou utilizando um metodo que adiciona o valor
    numérico 3(Int) em uma lista.. Isso gera conflito entre os
    tipos String e int... não sendo compatíveis...


  


