package Estructura;

/**
 * Clase objeto que almacena los datos extraídos de la base de datos traída por MySQL
 * @author Diego Medina
 * @author Ninoska Diaz
 * @author Manlet Sanchez
 * @author Ignacio Vallejos
 * @version 1.0
 */

public class Planta {
    private String nombre;
    private String tipo;
    private String descripcion;
    private Enfermedad enfermedad;
    private String tratamiento;

    public Planta(String nombre, String tipo, String descripcion, Enfermedad enfermedad, String tratamiento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.enfermedad = enfermedad;
        this.tratamiento = tratamiento;
    }

    public Enfermedad getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

        public String getNombre () {
            return nombre;
        }

        public void setNombre (String nombre){
            this.nombre = nombre;
        }

        public String getTipo () {
            return tipo;
        }

        public void setTipo (String tipo){
            this.tipo = tipo;
        }

        public String getDescripcion () {
            return descripcion;
        }

        public void setDescripcion (String descripcion){
            this.descripcion = descripcion;
        }

    @Override
    public String toString() {
        return "Plantas{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", enfermedad=" + enfermedad +
                ", tratamiento='" + tratamiento + '\'' +
                '}';
    }
}
