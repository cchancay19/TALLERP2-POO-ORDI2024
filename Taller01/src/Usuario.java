public class Usuario {

    //Atributos de la clase Padre USUARIO
    private String nombre;
    private String curso;

    //Método constructor
    public Usuario (String nombreC, String cursoC){
        this.nombre = nombreC;
        this.curso = cursoC;

    }

    //Métodos propios de la Clase
    public void mostrarInformacion(String datos){
        System.out.println(datos+'\n'+
                            " Nombre: "+ this.nombre + '\n'+
                            " Curso: "+ this.curso);
    }

    //Métodos GETTER and SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
