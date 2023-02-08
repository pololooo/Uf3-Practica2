/*
1. Tenim un fitxer de clients amb la següent definició:
Posició Inici Longitud Descripció

Fes un programa que permeti gestionar el fitxer de clients amb les següents
operacions:
a) Alta d’un client (registrar un client que no existia abans al fitxer)
b) Consulta d’un client per posició
c) Consulta d’un client per codi
d) Modificar un client
e) Esborrar un client
f) Llistat de tots els clients
 */
package uf3.practica2;

import java.util.*;

public class Uf3Practica2 {

    static Scanner scan = new Scanner(System.in);

    public static int menu() {
        int opc = 0;
        System.out.println("1. Alta d’un client: ");
        System.out.println("2. Consulta d’un client per posició: ");
        System.out.println("3. Consulta d’un client per codi: ");
        System.out.println("4. Modificar un client: ");
        System.out.println("5. Esborrar un client: ");
        System.out.println("6. Llistat de tots els clients: ");

        opc = scan.nextInt();

        return opc;
    }
    
    

    public static void main(String[] args) {
        
    }

}
