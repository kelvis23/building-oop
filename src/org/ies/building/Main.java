package org.ies.building;

import org.ies.building.componentes.ApartamentoReader;
import org.ies.building.componentes.BuildingApp;
import org.ies.building.componentes.EdificioReader;
import org.ies.building.componentes.PropietarioReader;
import org.ies.building.model.Apartamento;
import org.ies.building.model.Edificio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        PropietarioReader propietarioReader = new PropietarioReader(scanner);
        ApartamentoReader apartamentoReader =new ApartamentoReader(scanner,propietarioReader);
        EdificioReader edificioReader =new EdificioReader(scanner,apartamentoReader);
        BuildingApp buildingApp = new BuildingApp(scanner,propietarioReader,apartamentoReader,edificioReader);
        Edificio edificio =edificioReader.read();
        buildingApp.menu(edificio);
    }
}