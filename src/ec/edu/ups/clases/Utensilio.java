/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Utensilio
 *
 * Clase que permite ingresar los utensilios del restaurante
 * @version 2.0
 * @since 2019
 * @author Jose Tapia
 */
public class Utensilio 
{

    @Override
    public String toString() 
    {
        return "Utensilios:" + "\n Numero de Mesas=" + numeroMesa + "\n Numero de Platos=" + numeroPlato + "\n Numero de Cucharas=" + numeroCuchara + '.';
    }
    private int numeroMesa;
    private int numeroPlato;
    private int numeroCuchara;
    
    
    public void setnumeroMesa(int numeroMesa)
    {
        this.numeroMesa=numeroMesa; 
    }
    
    public void setnumeroPlato(int numeroPlato)
    {
        this.numeroPlato=numeroPlato; 
    }
    
    public void setnumeroCuchara(int numeroCuchara)
    {
        this.numeroCuchara=numeroCuchara;
    }
    public int getnumeroMesa()
    {
        return this.numeroMesa; 
    }
    public int getnumeroPlato()
    {
        return this.numeroPlato; 
    }
    public int getnumeroCuchara()
    {
        return this.numeroCuchara; 
    }
}
