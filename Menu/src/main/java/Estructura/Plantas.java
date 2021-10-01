package Estructura;

public class Plantas {
    public String nombre;
    public String tipo;
    public String descripcion;
    public int codigo_id;

    public Plantas(String nombre, String tipo, String descripcion, int codigo_id) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.codigo_id = codigo_id;
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

        public int getCodigo_id () {
            return codigo_id;
        }

        public void setCodigo_id ( int codigo_id){
            this.codigo_id = codigo_id;
        }

    @Override
    public String toString() {
        return "Plantas{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", codigo_id=" + codigo_id +
                '}';
    }
}
