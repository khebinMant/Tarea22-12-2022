package com.tarea.clase.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CrearStreams {

    public static void main(String[] args) {        
        

        // Cree un flujo que contenga los nombres "Roberto", "Cheryl","Raquel", "José" y
        // "Rita". Elimine todos los nombres que no empiecen con la letra R.
        // Ordene los elementos restantes por orden inverso, e imprima los resultados.
        List<String> names = Arrays.asList("Roberto", "Cheryl","Raquel", "José");
        String namesRInverseSorted = names.stream()
        .filter(x->x.startsWith("R"))    
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.joining(", "));

        System.out.println("Resultado: " + namesRInverseSorted);

        // Crea un flujo que contenga los números del 1 al 5. Añada 4 a cada elemento del
        // flujo. A continuación, cree una reducción que sume los elementos del flujo que
        // contengan valores impares y duplique el valor de los elementos del flujo que
        // contengan valores pares. Imprima el resultado de la reducción.
        List<Integer> numbers  = Arrays.asList(1,2,3,4,5);
        Integer numbersAdded = numbers.stream()
        .map(number->number+4)
        .reduce(0,(a,b) -> b%2==0? a+b*2: a+b); 
        System.out.println("Resultado de la operación: " + numbersAdded);      

    }
    
}
