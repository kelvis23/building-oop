package org.ies.building.model;

import org.ies.building.componentes.EdificioReader;

import java.util.Arrays;
import java.util.Objects;

public class Edificio {
    private String id;
    private String municipiality;
    private Apartamento[]apartamentos;

    public Edificio(String id, String municipiality, Apartamento[] apartamentos) {
        this.id = id;
        this.municipiality = municipiality;
        this.apartamentos = apartamentos;
    }

    public void infoBuilding(){
        for (var apartamet:apartamentos) {

            System.out.println("direcion: " + id + " municipio: " + municipiality +" apartamentos :"+apartamet);


        }
    }

    public void  showApartaments(int planta){

        for (var apartament:apartamentos){
            if (apartament.getFloor()==planta){
                //apaño
                System.out.println("direcion: " + id + " municipio: " + municipiality +" apartamentos :"+apartament);

            }
        }
    }
    //EROR
    public Apartamento showApartament(int planta, String puerta){
        for (var apartamento:apartamentos){
            if (apartamento.getDoor().equals(puerta) && apartamento.getFloor()==planta){
                    apartamento.infoApartamet();
                    return  apartamento;
            }
        }
        return null;
    }

    public void showOwner(int planta,String puerta){
        for (var apartmet:apartamentos){
            if (apartmet.getFloor()==planta && apartmet.getDoor().equals(puerta)){
                   for (var propietario:apartmet.getPropietarios()){
                       propietario.infoPropietario();
                   }

            }

        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMunicipiality() {
        return municipiality;
    }

    public void setMunicipiality(String municipiality) {
        this.municipiality = municipiality;
    }

    public Apartamento[] getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(Apartamento[] apartamentos) {
        this.apartamentos = apartamentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edificio edificio = (Edificio) o;
        return Objects.equals(id, edificio.id) && Objects.equals(municipiality, edificio.municipiality) && Objects.deepEquals(apartamentos, edificio.apartamentos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, municipiality, Arrays.hashCode(apartamentos));
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "id='" + id + '\'' +
                ", municipiality='" + municipiality + '\'' +
                ", apartamentos=" + Arrays.toString(apartamentos) +
                '}';
    }
}
