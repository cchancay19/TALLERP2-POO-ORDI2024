public class Alumno extends Usuario{

    //Atributos de la clase hija ALUMNO
    private String correoInstitucional ;


    //Método constructor
    public Alumno (String correoInstitucionalC,String nombreC, String cursoC){
        super(nombreC,cursoC);
        this.correoInstitucional = correoInstitucionalC;


    }

    //Métodos propios de la Clase
    public void statusDeAprobacion(double promedioAlumno){
        if(promedioAlumno >= 7){

            System.out.println("FELICITACIONES!, el estudiante "+super.getNombre()+
                    " obtuvo un promedio de "+promedioAlumno+" por lo tanto ha APROBADO la materia ^_^");

        }else {
            System.out.println("El estudiante "+super.getNombre()+
                    " obtuvo un promedio de "+promedioAlumno+ " por lo tanto ha REPROBADO la materia x_x");

        }
        System.out.println("*----------------------------------------------*");
    }

    //Métodos GETTER & SETTER
    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }


}
