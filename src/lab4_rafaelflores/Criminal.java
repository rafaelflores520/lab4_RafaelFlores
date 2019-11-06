/*
    Clase Criminal
 */
package lab4_rafaelflores;

import java.util.ArrayList;

public class Criminal {
    private String nombre, genero, paisResidencia, descripcionFisica;
    private int edad;
    private boolean encarcelado;
    private ArrayList<Delito> delitos = new ArrayList();

    public Criminal() {
    }

    public Criminal(String nombre, String genero, String paisResidencia, String descripcionFisica, int edad, boolean encarcelado) {
        this.nombre = nombre;
        this.genero = genero;
        this.paisResidencia = paisResidencia;
        this.descripcionFisica = descripcionFisica;
        this.edad = edad;
        this.encarcelado = encarcelado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPaisResidencia(String paisResidencia) {
        this.paisResidencia = paisResidencia;
    }

    public void setDescripcionFisica(String descripcionFisica) {
        this.descripcionFisica = descripcionFisica;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEncarcelado(boolean encarcelado) {
        this.encarcelado = encarcelado;
    }

    public void setDelitos(Delito delitos) {
        this.delitos.add(delitos);
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getPaisResidencia() {
        return paisResidencia;
    }

    public String getDescripcionFisica() {
        return descripcionFisica;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isEncarcelado() {
        return encarcelado;
    }

    public ArrayList<Delito> getDelitos() {
        return delitos;
    }
    
    @Override
    public String toString() {
        String patron = "|%20s|%20s|%20s|%20s|%20d|%20s|";
        return String.format(patron, this.getNombre(), this.getGenero(), this.getPaisResidencia(), this.getDescripcionFisica(), this.getEdad(), this.isEncarcelado());
    }
    
    
}
