package test;

import equipements.base.Ordinateur;

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

        for (int i = 0; i < 2; i++){
            list_ordi[i] = ordinateurs[i];
            minRam = sc.nextInt(); sc.nextLine();
            minStock = sc.nextInt();sc.nextLine();
            System.out.println(list_ordi[i].verifierConfigMinimale(minRam, minStock));
            System.out.println(list_ordi[i].toString());
        }
        sc.close();
    }
}
