package org.ies.building.model;

import org.ies.building.componentes.BuildingApp;

import java.util.Arrays;
import java.util.Objects;

public class Apartamento {

    private   int floor;
    private String door;
    private Propietario[] propietarios;

    public Apartamento(int floor, String door, Propietario[] propietarios) {
        this.floor = floor;
        this.door = door;
        this.propietarios = propietarios;
    }
    public void infoApartamet(){
        System.out.println("planta"+floor+"puerta"+door+"propietario");
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public Propietario[] getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(Propietario[] propietarios) {
        this.propietarios = propietarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartamento that = (Apartamento) o;
        return floor == that.floor && Objects.equals(door, that.door) && Objects.deepEquals(propietarios, that.propietarios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floor, door, Arrays.hashCode(propietarios));
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "floor=" + floor +
                ", door='" + door + '\'' +
                ", propietarios=" + Arrays.toString(propietarios) +
                '}';
    }
}
