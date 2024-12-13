package org.ies.building.componentes;

import org.ies.building.model.Apartamento;
import org.ies.building.model.Propietario;

import java.util.Scanner;

public class ApartamentoReader {
    private final Scanner scanner;
    private final PropietarioReader propietarioReader;

    public ApartamentoReader(Scanner scanner, PropietarioReader propietarioReader) {
        this.scanner = scanner;
        this.propietarioReader = propietarioReader;
    }

    public Apartamento read() {
        System.out.println("informasion del apratamento");
        System.out.println("Introduce la planta del apatamento ");
        int floor = scanner.nextInt();
        scanner.nextLine();
        System.out.println("puerta del apartamento");
        String door = scanner.nextLine();
        Propietario[]propietarios = new Propietario[readNumOWerde()];
        for (int i = 0; i < propietarios.length; i++) {
            propietarios[i]=propietarioReader.read();
        }
        return new Apartamento(
                floor,
                door,
                propietarios
        );
    }
    private int readNumOWerde(){
        int size;
        do {
            System.out.println("cuantos propietarios tienene el apartamento");
            size=scanner.nextInt();
            scanner.nextLine();
        }while (size <0);
        return size;
    }
}
