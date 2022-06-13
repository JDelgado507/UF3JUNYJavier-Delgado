public class Alumno extends Persona {

    private String fechaNacimiento;

    private String codigo;

    public Alumno(String fechaNacimiento, String codigo, String nombre, String apellido, String email) {
        super(nombre, apellido, email);
        this.fechaNacimiento = fechaNacimiento;
        this.codigo = codigo;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public String getEmail() {
        return email;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getApellido(){
        return apellido;
    }
    
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "fechaNacimiento=" + fechaNacimiento +
                ", codigo=" + this.codigo + ", nombre = "+ this.getNombre() +
                ", Apellido" + this.getApellido() +
                ", Email = " + this.getEmail() ;    
    }
    
    
}
