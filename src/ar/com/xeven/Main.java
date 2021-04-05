package ar.com.xeven;

import java.util.HashMap;
import java.util.Map;

/*
Crear un mapa que permita la rapida busqueda de empleados en una empresa por numero de empleado.
De cada empleado se sabe el nombre, nro de empleado, dni,edad, direccion y puesto.
Cargar 10 empleados (en cualquier orden).
Mostar la LISTA de empleados de forma ordenada

 */
public class Main {

    public static void main(String[] args) {

        HashMap<Integer, Empleado> empleados = new HashMap<>();

        Empleado a = new Empleado("pablo",123,123456, 30,"av siempre viva 123","gte");
        Empleado b = new Empleado("john",456,678996,50,"otra direccion","otro puesto");
        Empleado c = new Empleado("john",147,678996,40,"otra dir","otro puesto");

        empleados.put(a.getNroDeEmpleado(),a);
        empleados.put(b.getNroDeEmpleado(),b);
        empleados.put(c.getNroDeEmpleado(),c);

        //muestro la lista de empleados de forma ordenada
        empleados.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()) //ordena comparando por clave () (nro empleado)
                .forEach(System.out::println);
    }

    //terminarlo
}
