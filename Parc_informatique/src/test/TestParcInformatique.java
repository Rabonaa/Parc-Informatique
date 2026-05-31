package test;
import equipements.base.Equipement;
import equipements.base.Ordinateur;
import equipements.base.Serveur;
import equipements.base.StationDeTravail;
import equipements.peripheriques.Clavier;
import equipements.peripheriques.Ecran;
import equipements.peripheriques.Souris;
import equipements.reseau.Switch;
import gestion.ParcInformatique;
public class TestParcInformatique {
    public static void main(String[] args){
        ParcInformatique parc = new ParcInformatique(20);
        Equipement ordi1 = new Ordinateur("Dell", "XPS 15", "SN12345", 1500, 2022, "Intel i7", 16, 512, "Windows 11");
        Equipement ordi2 = new Ordinateur("Apple", "MacBook Pro", "SN67890", 2500, 2021, "M1 Pro", 32, 1024, "macOS Ventura");
        Equipement ordi3 = new Ordinateur(
                "Dell",
                "XPS 15",
                "SN54321",
                1800,
                2022,
                "Intel i7-12700H",
                16,
                512,
                "Windows 11"
        );
        Equipement ordi4 = new Ordinateur(
                "HP",
                "Omen 16",
                "SN99887",
                2200,
                2023,
                "AMD Ryzen 9 7940HS",
                32,
                1024,
                "Windows 11 Pro"
        );
        Equipement srv1 = new Serveur(
                "Dell",
                "PowerEdge R750",
                "SRV-2026-001",
                5200,
                2024,
                32,
                128,
                4096,
                true,
                false
        );
        Equipement srv2 = new Serveur(
                "HP",
                "ProLiant DL380 Gen10",
                "SRV-2026-002",
                6800,
                2023,
                48,
                256,
                8192,
                true,
                true
        );
        Equipement srv3 = new Serveur(
                "Lenovo",
                "ThinkSystem SR650",
                "SRV-2026-003",
                7500,
                2025,
                64,
                256,
                8192,
                true,
                true
        );
        Equipement sw1 = new Switch(
                "Cisco",
                "Catalyst 2960",
                "SW-2026-001",
                1200,
                2023,
                24,
                1000,
                "192.168.1.10",
                true
        );
        Equipement sw2 = new Switch(
                "HP",
                "Aruba 2930F",
                "SW-2026-002",
                1800,
                2024,
                48,
                10000,
                "192.168.1.20",
                true
        );

        parc.ajouterEquipement(ordi1);
        parc.ajouterEquipement(ordi2);
        parc.ajouterEquipement(ordi3);
        parc.ajouterEquipement(srv1);
        parc.ajouterEquipement(srv2);
        parc.ajouterEquipement(sw1);
        parc.afficherInventaireComplet();
        double val = parc.calculerValeurTotaleParc();
        System.out.println(val);
        StationDeTravail sdt1 = new StationDeTravail(
                "HP",
                "ZBook Fury 16",
                "ST-2026-001",
                3200,
                2024,
                "Intel Core i9-13900HX",
                64,
                2000,
                "Windows 11 Pro",
                "NVIDIA RTX A3000",
                "CAO / DAO"
        );
        Clavier clavier1 = new Clavier(
                "mécanique",
                "AZERTY"
        );
        Ecran ecran1 = new Ecran(
                27,
                "2560x1440",
                "HDMI / DisplayPort"
        );
        Souris souris1 = new Souris(
                16000,
                true
        );
        sdt1.attacherEcran(ecran1);
        sdt1.attacherClavier(clavier1);
        sdt1.attacherSouris(souris1);
        parc.ajouterEquipement(sdt1);
        parc.afficherInventaireComplet();

    }
}
