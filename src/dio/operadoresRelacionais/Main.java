package dio.operadoresRelacionais;

public class Main {
    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        // comparação de interiros com inteiros

        System.out.println("i1 == i2 " + (i1 == i2)); // 10 é igual 20?
        System.out.println("i1 != i2 " + (i1 != i2)); // 10 é difente de  20?
        System.out.println("i1 > i2 " + (i1 > i2)); // 10 é maior que 20
        System.out.println("i1 <= i2 " + (i1 <= i2)); // 10 é menor ou igual a 20?

        // comparação de interiros com floats

        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 >= f2 " + (f1 > f2));
        System.out.println("f1 < f2 " + (f1 <= f2));

        // comparações de Chars

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 >= c2 " + (c1 > c2));
        System.out.println("c1 < c2 " + (c1 <= c2));

        //comparação de strings

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s1 != s2 " + (s1 != s2));
        //nem todos operadores podem ser usados com derterminados tipos
        //System.out.println(s1 >= s2); erro não podemos comparar ordens de grandeza com strings
        //System.out.println(s1 < s2); erro não podemos comparar ordens de grandeza com strings


        //comparações entre booleans

        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));
        //nem todos operadores podem ser usados com derterminados tipos
        //System.out.println("b1 > b2 " + (b1 > b2));
        //System.out.println("b1 <= b2 " + (b1 <= b2));

        // comparação de tipos de dados diferentes

        System.out.println("12 > f1 " + (i2 > f1));
        System.out.println("d1 == h1 " + (d1 == h1));
        //tipos de dddos muitos diferentes
        //System.out.println((s2 != c1)); Erro string não compara com char
        //System.out.println((s3 != i1)); Erro String não compara com int

        // tipos de dados diferentes, porém tem a posibilidade de comparação
        System.out.println("l1 == i2 " + (l1 == i2));
        System.out.println("l2 >= i1 " + (l2 >= i1));
        System.out.println("y1 !- h1 " + (y1 != h1));


    }
}
