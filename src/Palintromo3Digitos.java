import java.util.ArrayList;

public class Palintromo3Digitos {
/*A palindromic number reads the same both ways. The largest palindrome made from the product
of two 2-digit numbers is 9009 = 91 × 99. Find the largest palindrome made from the product of
two 3-digit numbers.
 */

public static void calcularPalindromos(){

    int numero;
    ArrayList<Integer> palindromos = new ArrayList<Integer>();

    for (int i = 100; i < 1000; i++){
        for (int j = 100; j < 1000; j++){

            numero=i*j;

            if(numero==invertirNumero(numero)){
                palindromos.add(numero);
            }

        }
    }
}


public static int invertirNumero(int numero) {
    int numeroInvertido = 0;
    String num = "";
    String numInv= "";

    char[] array = new char[Integer.toString(numero).length()];

    for (int i = 0; i < array.length; i++) {
        array[i] = Integer.toString(numero).charAt(i);
    }
    for (int i = 0; i < array.length; i++) {
        num += array[i];
    }

    char[] cadena = new char[num.length()];

    for (int k = 0; k < num.length(); k++){
        cadena[k] = num.charAt(k);
    }

    for (int j = cadena.length -1; j >= 0; j--){
        numInv += cadena[j];
    }

    numeroInvertido = Integer.parseInt(numInv);;

    return numeroInvertido;
}

    public static void main(String[] args) {

        calcularPalindromos();
    }
}
