import java.util.Arrays;
public class BubleSort {
    /**
    Esta clase nos servira para ordenar los numeros de un arreglo siguiendo el metodo de la burbuja.
    @autor Youssef Rahou
    @version 1.0
     */

    public static int[] ordenarNumeros(int[] numeros){
        int aux;
        for (int i = 0; i < numeros.length; i++){
            for (int k = 0; k < numeros.length-1; k++){
                if (numeros[k+1]<numeros[k]){   //aqui cambiamos de posicion los diferentes numeros
                    aux=numeros[k+1];   //creamos una variable temporal donde guardaremos el numero siguiente
                    numeros[k+1]=numeros[k];
                    numeros[k]=aux;
                }
            }
        }
        return numeros;

        /**
        @return nos devolvera un array con los numeros anteriores, pero ordenados de menos a mayor
        */

    }

    public static void main(String[] args) {
        int[] numeros={9,2,4,3,5,9,1,8};
        System.out.println(Arrays.toString(ordenarNumeros(numeros)));
    }
}
