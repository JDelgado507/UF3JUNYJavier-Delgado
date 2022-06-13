public class Profesor extends Persona {

    private String departamento;

    private String cargo;

    public Profesor(String departamento, String cargo, String nombre, String apellido, String email) {
        super(nombre, apellido, email);
        this.departamento = departamento;
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return
     */
    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Profesor{" + "departamento=" + departamento + ", cargo=" + cargo + ", nombre:"+ nombre+",apellido:"+ apellido +", email:" +email+'}';
    }


    
}
