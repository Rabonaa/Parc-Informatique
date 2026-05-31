package test;

import equipements.base.Ordinateur;
import equipements.base.Serveur;

import java.util.Scanner;

public class TestEquipements {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ordinateur[] ordinateurs = {
                new Ordinateur("Dell", "XPS 15", "SN12345", 1500, 2022, "Intel i7", 16, 512, "Windows 11"),
                new Ordinateur("Apple", "MacBook Pro", "SN67890", 2500, 2021, "M1 Pro", 32, 1024, "macOS Ventura")
        };
        System.out.println(ordinateurs[0].calculerAge() + " ans ");
        Ordinateur[] list_ordi = new Ordinateur[ordinateurs.length] ;
        int minStock; int minRam;

        /*for (int i = 0; i < 2; i++){
            list_ordi[i] = ordinateurs[i];
            System.out.println("Saisir RAM et Stockage :");
            minRam = sc.nextInt(); sc.nextLine();
            minStock = sc.nextInt();sc.nextLine();
            System.out.println(list_ordi[i].verifierConfigMinimale(minRam, minStock));
            System.out.println(list_ordi[i].toString());
        }*/
        Serveur s1 = new Serveur(
                "Dell",          // marque
                "PowerEdge R750", // modèle
                "SN123456789",   // numéro de série
                8500.0,          // prix d'achat
                2024,            // année d'achat
                32,              // nombre de cœurs CPU
                128,             // RAM en Go
                4000,            // capacité de stockage en Go
                true,            // système RAID activé
                true             // en production
        );
        Serveur s2 = new Serveur(
                "HP",
                "ProLiant DL380",
                "HP987654321",
                4500.0,
                2022,
                16,
                64,
                2000,
                true,
                false
        );


        s1.demarrer();
        s1.afficherEtat();
        s1.arreter();
        s1.afficherEtat();
        String code = s1.genererCodeInventaire();
        System.out.println(code);


        sc.close();
    }
}
