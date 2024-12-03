package org.ies.building.componentes;

import org.ies.building.model.Propietario;

import java.util.Scanner;

public class PropietarioReader {
    private final Scanner scanner;

    public PropietarioReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Propietario read() {
        System.out.println("Informasion del propietario");
        System.out.println("introduce el  NIF del propietario");
        String nif=scanner.nextLine();
        System.out.println("introduce el  nombre del propietario");
        String name =scanner.nextLine();
        System.out.println("introduce el  apellido del propietario");
        String lastname =scanner.nextLine();
        return new Propietario(
                nif,
                name,
                lastname
        );
    }
}
