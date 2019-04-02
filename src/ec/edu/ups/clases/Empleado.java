/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *Empleado
 *
 * Clase que permite ingresar los datos del empleado
 * @version 2.0
 * @since 2019
 * @author Jose Tapia
 */
public class Empleado 
{

    @Override
    public String toString() 
    {
        return "Empleado:" + "\n Nombre de Empleado=" + nombreEmpleado + "\n Sueldo de Empleado=" + sueldoEmpleado + "\n Horario de Entrada de Empleado=" + entradaEmpleado + '.';
    }
    private String nombreEmpleado;
    private double sueldoEmpleado;
    private double entradaEmpleado;
    
    
    public void setnombreEmpleado(String nombreEmpleado)
    {
        this.nombreEmpleado=nombreEmpleado; 
    }
       
    public void setsueldoEmpleado(double sueldoEmpleado)
    {
        this.sueldoEmpleado=sueldoEmpleado; 
    }
    
    public void setentradaEmpelado(double entradaEmpleado)
    {
        this.entradaEmpleado=entradaEmpleado;
    } 
    
    public String getnombreEmpleado()
    {
        return this.nombreEmpleado; 
    }
    
    public double getsueldoEmpleado()
    {
        return this.sueldoEmpleado; 
    }
    
    public double getentradaEmpleado()
    {
        return this.entradaEmpleado; 
    }
}
