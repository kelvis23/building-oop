package org.ies.building.componentes;

import org.ies.building.model.Apartamento;
import org.ies.building.model.Edificio;

import java.util.Scanner;

public class EdificioReader {
    private final Scanner scanner;
    private final ApartamentoReader apartamentoReader;

    public EdificioReader(Scanner scanner, ApartamentoReader apartamentoReader) {
        this.scanner = scanner;
        this.apartamentoReader = apartamentoReader;
    }
    public Edificio read(){
        System.out.println("informasion del edificios ");
        System.out.println("introduce la diresion");
        String id = scanner.nextLine();
        System.out.println("introduce el municipio");
        String municipality = scanner.nextLine();
        Apartamento[]apartamentos =new Apartamento[readNumApartmet()];
        for (int i = 0; i < apartamentos.length; i++) {
            apartamentos[i]=apartamentoReader.read();
        }
        return new Edificio(
                id,
                municipality,
                apartamentos

        );
    }
    public int readNumApartmet(){
        int size ;
        do {
            System.out.println("cuantos  apratmentos tirene el edificio");
            size = scanner.nextInt();
            scanner.nextLine();
        }while (size<0);
        return size;
    }
}

