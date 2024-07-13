//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Creando primer objeto y llamándolo de la clase hija Profesor
        Profesor prof = new Profesor(2,10,'N',"Pablo Gomez","Sistemas Operativos");
        //llamando a sus métodos propios y heredado
          prof.mostrarInformacion("Docente -> ");
          prof.faltasDelProfesor();
          prof.cantHorasTrabajadas();

        System.out.println("");

        //Creando segundo objeto y llamándolo de la clase hija Profesor
        Profesor prof02 = new Profesor(4,6,'M',"Julian Coronel","POO");
        //llamando a sus métodos propios y heredado
          prof02.mostrarInformacion("Docente -> ");
          prof02.faltasDelProfesor();
          prof02.cantHorasTrabajadas();

        System.out.println("");

        //Creando primer objeto y llamándolo de la clase hija Alumno
        Alumno alumn = new Alumno("cchancay.es@tecnologicoargos.edu.ec",
                                    "Christian Chancay","Período 2 -> Prog. Orientada a objetos");
        //llamando a sus método propio y heredado
        alumn.mostrarInformacion("Alumno -> ");
        System.out.println(" Correo: "+alumn.getCorreoInstitucional());
        alumn.statusDeAprobacion(9.5);

        //Creando segundo objeto y llamándolo de la clase hija Alumno
        Alumno alumn02 = new Alumno("eestrada.es@tecnologicoargos.edu.ec",
                "Emilio Estrada","Período 1 -> Fundamentos de Prog.");
        //llamando a su métodos propio y heredado
        alumn02.mostrarInformacion("Alumno -> ");
        System.out.println(" Correo: "+alumn02.getCorreoInstitucional());
        alumn02.statusDeAprobacion(6);


    }
}