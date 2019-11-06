/*
    Clase Padre Delito
 */
package lab4_rafaelflores;

import java.util.Date;

public class Delito {
    private String descripcion, nombreVictima, pais, sentencia;
    private int numeroDelito;
    private boolean isCulpable;
    private Date fecha;

    public Delito() {
    }

    public Delito(String descripcion, String nombreVictima, String pais, String sentencia, int numeroDelito, boolean isCulpable, Date fecha) {
        this.descripcion = descripcion;
        this.nombreVictima = nombreVictima;
        this.pais = pais;
        
        this.sentencia = sentencia;
        this.numeroDelito = numeroDelito;
        
        this.isCulpable = isCulpable;
        this.fecha = fecha;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombreVictima(String nombreVictima) {
        this.nombreVictima = nombreVictima;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    

    public void setSentencia(String sentencia) {
        this.sentencia = sentencia;
    }

    public void setNumeroDelito(int numeroDelito) {
        this.numeroDelito = numeroDelito;
    }

    

    public void setIsCulpable(boolean isCulpable) {
        this.isCulpable = isCulpable;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombreVictima() {
        return nombreVictima;
    }

    public String getPais() {
        return pais;
    }

    

    public String getSentencia() {
        return sentencia;
    }

    public int getNumeroDelito() {
        return numeroDelito;
    }

    

    public boolean isIsCulpable() {
        return isCulpable;
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        String patron = "|%20s|%20s|%20s|%20s|%20d|%20s|%20s|";
        return String.format(patron, this.getDescripcion(), this.getNombreVictima(), this.getPais(), this.getSentencia(), this.getNumeroDelito(), this.isCulpable, this.getFecha());
    }
    
    
}
