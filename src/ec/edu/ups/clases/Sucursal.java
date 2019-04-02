/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Sucursal
 *
 * Clase que permite ingresar los datos de una sucursal del restaurante
 * @version 2.0
 * @since 2019
 * @see https://github.com/JoseTapiaV/Practica01
 * @author Jose Tapia
 */
public class Sucursal 
{

    @Override
    public String toString() 
    {
        return "Sucursal:" + "\n Numero de Local=" + numeroLocal + "\n Nombre de Restaurante=" + nombreRes + "\n Direccion de Restaurante=" + direccionRes + '.';
    }
    private int numeroLocal;
    private String nombreRes;
    private String direccionRes;
    
    
    public void setnumeroLocal(int numeroLocal)
    {
        this.numeroLocal=numeroLocal; 
    }
    
    public void setnombreRes(String nombreRes)
    {
        this.nombreRes=nombreRes; 
    }
    
    public void setdireccionRes(String direccionRes)
    {
        this.direccionRes=direccionRes;
    } 
    
    public int getnumeroLocal()
    {
        return this.numeroLocal; 
    }
    
    public String getnombreRes()
    {
        return this.nombreRes; 
    }
    
    public String getdireccionRes()
    {
        return this.direccionRes; 
    }
}
