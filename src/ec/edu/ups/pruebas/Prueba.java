/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.pruebas;
import ec.edu.ups.clases.Empleado;
import ec.edu.ups.clases.Menu;
import ec.edu.ups.clases.Reservacion;
import ec.edu.ups.clases.Sucursal;
import ec.edu.ups.clases.Utensilio;
import java.util.Scanner;

/**
 * Prueba
 *
 * Clase que principal que nos muestra todos los daos ingresados
 * @version 2.0
 * @since 2019
 * @author Jose Tapia
 */
public class Prueba 
{
    public static void main(String []args)
    {
        Menu Lista=new Menu();
        Empleado Nombre=new Empleado();
        Sucursal Local=new Sucursal();
        Utensilio Objeto=new Utensilio();
        Reservacion Reserva=new Reservacion();
        Scanner x=new Scanner(System.in);
        int opc;
        do
        {
            System.out.println("Menu");
            System.out.println("1. Ingrese datos del menu de la comida.");
            System.out.println("2. Ingrese datos de los empleados.");
            System.out.println("3. Ingrese datos del local.");
            System.out.println("4. Ingrese datos de los utensilios.");
            System.out.println("5. Ingrese datos de la reservacion.");
            System.out.println("6. Mostrar todos los datos ingresados.");
            do
            {
                System.out.print("Ingrese su opcion: ");
                opc=x.nextInt();
            }while(opc<0 && opc>6);
            switch(opc)
            {
                case 1:
                    String nombSec, nombCo;
                    double cCom;
                    System.out.print("Ingrese el nombre de la seccion de comida: ");
                    nombSec=x.next();
                    System.out.print("Ingrese el nombre de la comida: ");
                    nombCo=x.next();
                    System.out.print("Ingrese el costo de "+nombCo+": ");
                    cCom=x.nextDouble();
                    Lista.setnombreSeccion(nombSec);
                    Lista.setnombreComida(nombCo);
                    Lista.setcostoComida(cCom);
                    break;
                case 2:
                    String nombEm;
                    double entrada, sueldo;
                    System.out.print("Ingrese el nombre del empledo: ");
                    nombEm=x.next();
                    System.out.print("Ingrese la hora de entrada: ");
                    entrada=x.nextDouble();
                    System.out.print("Ingrese el sueldo: ");
                    sueldo=x.nextDouble();
                    Nombre.setnombreEmpleado(nombEm);
                    Nombre.setentradaEmpelado(entrada);
                    Nombre.setsueldoEmpleado(sueldo);
                    break;
                case 3:
                    int numL;
                    String nombL, direc;
                    System.out.print("Ingrese el nùmero del local: ");
                    numL=x.nextInt();
                    System.out.print("Ingrese el nombre del local: ");
                    nombL=x.next();
                    System.out.print("Ingrese la direccion del local: ");
                    direc=x.next();
                    Local.setnumeroLocal(numL);
                    Local.setnombreRes(nombL);
                    Local.setdireccionRes(direc);
                    break;
                case 4:
                    int pla, mes, cuc;
                    System.out.print("Ingrese el numero de platos: ");
                    pla=x.nextInt();
                    System.out.print("Ingrese el numero de mesas: ");
                    mes=x.nextInt();
                    System.out.print("Ingrese el numero de cucharas: ");
                    cuc=x.nextInt();
                    Objeto.setnumeroPlato(pla);
                    Objeto.setnumeroMesa(mes);
                    Objeto.setnumeroCuchara(cuc);
                    break;
                case 5:
                    int mesR, codR;
                    double horR;            
                    System.out.print("Ingrese la mesa de la reservacion: ");
                    mesR=x.nextInt();
                    System.out.print("Ingrese el codigo de la reservacion: ");
                    codR=x.nextInt();
                    System.out.print("Ingrese la hora de la reservacion: ");
                    horR=x.nextDouble();
                    Reserva.setnumeroMesaReservacion(mesR);
                    Reserva.setcodigoReservacion(codR);
                    Reserva.sethorarioReservacion(horR);
                case 6:
                    System.out.println(Lista);
                    System.out.println(Nombre);
                    System.out.println(Local);
                    System.out.println(Objeto);
                    System.out.println(Reserva);
                    break;
            }
        }while(opc>0 && opc<7);
    }
}
