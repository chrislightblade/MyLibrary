
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package util;

/**
 *
 * @author tss
 */
public class LibreriaMetodiArray {

    private LibreriaMetodiArray() {
    }        
    
    /**
     * 
     * bubble sort per oggetti persona
     * 
     * @param persone 
     */
    /*public static void ordinaLista(Persona[] persone) {

        //for(int i = 0; (i+1) < persona.length; i++){        più leggero da scrivere
        //    if(persone[i].compareTo(persone[i+1]) > 0){
        //        tmp = persone[i];
        //       persone [i] = persone[i+1];
        //        persone[i+1] = tmp;
        //       i = 0;
        //  }
        int i = 0;
        boolean control = false;
        while (control == false) {
            Persona tmp;
            if (persone[i].compareTo(persone[i + 1]) > 0) {
                tmp = persone[i];
                persone[i] = persone[i + 1];
                persone[i + 1] = tmp;
                i = 0;
            } else {
                i++;
                if ((i + 1) == persone.length) {
                    control = true;
                }
            }
        }
    }*/
    
    //affinchè stampi qualcosa, serve fare l'override della funzione toString dell'oggetto che voglio stampare
    public static void stampaArray(Object[] o) {
        //String report = "";
        System.out.println("inizio stampa");
        int i = 0;
        for (Object object : o) {
            //report += persona.toString() + "\n";  
            System.out.println(object/*o[i].toString()*/);
            i++;
        }

        System.out.println("\n");
        System.out.println("fine stampa");
    }
    
    //riordina con metodo bubble sort, usando una var TMP e il metodo compareTo che devo implementare all'oggetto
    public static void ordinaLista(Comparable[] object) {

        /*for(int i = 0; (i+1) < persona.length; i++){        più leggero da scrivere
            if(persone[i].compareTo(persone[i+1]) > 0){
                tmp = persone[i];
                persone [i] = persone[i+1];
                persone[i+1] = tmp;
                i = 0;
          }*/
        int i = 0;
        boolean control = false;
        while (control == false) {
            Comparable tmp;
            if (object[i].compareTo(object[i + 1]) > 0) {
                tmp = object[i];
                object[i] = object[i + 1];
                object[i + 1] = tmp;
                i = 0;
            } else {
                i++;
                if ((i + 1) == object.length) {//arrivato alla fine, esce. Poichè ogni volta che trova uno scambo riparte dall'iniziio
                    control = true;
                }
            }
        }
    }
    
    //effettua  una ricerca in cui ritorna l'index dell'array in cui trova l'oggetto, l'importante è fare l'override di equals dell'oggetto che cerco
    public static int cerca(Object[] objects, Object time){
        int index = -1;
        for (int i = 0; i < objects.length; i++) {
            if(objects[i].equals(time)){
                index = i;
                break;
            }
        }
        return index;
    }
    
    //uso la funzione cerca= se trova l'oggetto e ne ritorna l'index, duqnue è != da -1 e ritorna vero, altrimenti falso
    public static boolean contiene(Object[] objects, Object time){        
        return cerca(objects, time) != -1;
    }
}
