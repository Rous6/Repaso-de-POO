package Modelo;
public class Persona {
    private  Long Id;
    private String nombre;
    private String Apellidos;
    private int  Edad;
    private String Direccion;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, int edad, String direccion) {
        this.nombre = nombre;
        Apellidos = apellidos;
        Edad = edad;
        Direccion = direccion;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String Caminar(){
        return "Camina";
    }
    public int Edad(int edad){
        return edad;
    }

}
