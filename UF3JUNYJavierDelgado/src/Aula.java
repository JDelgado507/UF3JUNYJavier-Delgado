
import java.util.ArrayList;

public class Aula {

    private String nom;

    private int numOrdenadores;

    private int maximoAlumnos;

    private ArrayList alumnes;

    private Object Profesor;

    public Aula() {
    }

    public void ordenadoresMaximos() {
    }
    public void AñadirAlumno(Alumno alumnes){
    
    }
    
    public void removerAlumno(Alumno alumnes){
    
    }
    public String getNom() {
        return nom;
    }

    public int getNumOrdenadores() {
        return numOrdenadores;
    }

    public int getMaximoAlumnos() {
        return maximoAlumnos;
    }

    public ArrayList getAlumnes() {
        return alumnes;
    }

    public Object getProfesor() {
        return Profesor;
    }

    public Aula(String nom, int numOrdenadores, int maximoAlumnos, ArrayList alumnes, Object Profesor) {
        this.nom = nom;
        this.numOrdenadores = numOrdenadores;
        this.maximoAlumnos = maximoAlumnos;
        this.alumnes = alumnes;
        this.Profesor = Profesor;
    }

    @Override
    public String toString() {
        return "Aula{" + "nom=" + nom + ", numOrdenadores=" + numOrdenadores + ", maximoAlumnos=" + maximoAlumnos + ", alumnes=" + alumnes + ", Profesor=" + Profesor + '}';
    }
    
    
}
