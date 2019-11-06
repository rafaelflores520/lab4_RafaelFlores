/*
Clase Hija Hija Hurto
 */
package lab4_rafaelflores;

import java.util.Date;

public class Hurto extends DelitoMenor{
    private String objeto;
    private int valor;

    public Hurto() {
    }

    public Hurto(String objeto, int valor, String nombrePolicia, int idPolicia, int numeroCelda, String descripcion, String nombreVictima, String pais, String sentencia, int numeroDelito, boolean isCulpable, Date fecha) {
        super(nombrePolicia, idPolicia, numeroCelda, descripcion, nombreVictima, pais, sentencia, numeroDelito, isCulpable, fecha);
        this.objeto = objeto;
        this.valor = valor;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getObjeto() {
        return objeto;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        String patron = super.toString()+"%20s|%20d|";
        return String.format(patron, this.getObjeto(), this.getValor());
    }

    
    
    
}
