package ar.com.xeven;

public class Empleado {
    //atributos
    private String nombre;
    private Integer nroDeEmpleado;
    private Integer dni;
    private Integer edad;
    private String direccion;
    private String puesto;

    public Empleado(String nombre, Integer nroDeEmpleado, Integer dni, Integer edad, String direccion, String puesto) {
        this.nombre = nombre;
        this.nroDeEmpleado = nroDeEmpleado;
        this.dni = dni;
        this.edad = edad;
        this.direccion = direccion;
        this.puesto = puesto;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNroDeEmpleado() {
        return nroDeEmpleado;
    }

    public void setNroDeEmpleado(Integer nroDeEmpleado) {
        this.nroDeEmpleado = nroDeEmpleado;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", nroDeEmpleado=" + nroDeEmpleado +
                ", dni=" + dni +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", puesto='" + puesto + '\'' +
                '}';
    }
}
