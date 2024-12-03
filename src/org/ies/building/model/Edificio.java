package org.ies.building.model;

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
