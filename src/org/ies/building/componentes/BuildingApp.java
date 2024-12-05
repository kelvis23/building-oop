package org.ies.building.componentes;

import org.ies.building.model.Edificio;
import org.ies.building.model.Propietario;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class BuildingApp {
    private final Scanner scanner;
    private final PropietarioReader propietarioReader;
    private final ApartamentoReader apartamentoReader;
    private final EdificioReader edificioReader;

    public BuildingApp(Scanner scanner, PropietarioReader propietarioReader, ApartamentoReader apartamentoReader, EdificioReader edificioReader) {
        this.scanner = scanner;
        this.propietarioReader = propietarioReader;
        this.apartamentoReader = apartamentoReader;
        this.edificioReader = edificioReader;
    }

    public void menu(Edificio edificio) {
        int option;
        do {
            System.out.println("1.muestra la informasion del todo el edificio");
            System.out.println("2.muestra los apartamentos de la primera planta");
            System.out.println("3.Muestra los datos del apartamento situado en una puerta y una planta");
            System.out.println("4.Muestra los propietarios de un apartamento situado en una planta y puerta ");
            System.out.println("5.SALIR");
            option=scanner.nextInt();
            scanner.nextLine();
            if (option==1){
                edificio.infoBuilding();
            } else if (option==2) {
                edificio.showApartaments();
            } else if (option==3) {
                System.out.println("INTRODUCE EL NUMERO DE LA PLANTA");
                int x = scanner.nextInt();
                scanner.nextLine();
                System.out.println("introduce el numero de la puerta");
                String y =scanner.nextLine();
                edificio.showApartament(x,y);
            } else if (option==4) {

            } else if (option==5) {
                System.out.println("saliendo..");

            }else {
                System.out.println("Error");
            }

        } while (option!=5);
    }
}
