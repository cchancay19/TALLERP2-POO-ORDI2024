public class Profesor extends Usuario{

    //Atributos de la clase hija PROFESOR
   // private String materiaDada;
    private int faltasProf;
    private int horasClase;
    private char horario;

    //Método constructor
    public Profesor (int faltasProfC,int horasClaseC,char horarioC, String nombreC, String cursoC){
        super(nombreC,cursoC);

        this.faltasProf = faltasProfC;
        this.horasClase = horasClaseC;
        this.horario = horarioC;
    }

    //Métodos propios de la Clase
    public void faltasDelProfesor(){
        if(getFaltasProf() >= 3){

            System.out.println("Faltas hasta el momento: "+getFaltasProf());
            System.out.println("ATENCIÓN!!!"+'\n'+"Estimado docente "+super.getNombre()+", usted tiene 3 o más faltas," +
                    " debe de enviar un correo para justificar el motivo");

        }else {
            System.out.println("Faltas hasta el momento: "+getFaltasProf());
            System.out.println("Registro de asistencia exitoso!");

        }

        System.out.println("*----------------------------------------------*");

    }

    //Método adicional en la Clase Profesor
        /*
        ***CANTIDAS DE HORAS LABORADAS A LA SEMANA***
            nombre del método 'cantHorasTrabajadas'
            Si el docente imparte su materia(asignatura) más de 8 horas a la semana,
            significa que trabaja en la Institución en Horarios: matutino y nocturno.
            Por el contrario si solo imparte su materia(asignatura) 8 horas o menos a la semana,
            significa que solo labora en 1 horario
            y de ser ese el caso debe especificar si labora en el horario matutino = 'M' o nocturno = 'N'
        */
    public void cantHorasTrabajadas(){

            System.out.println("*** Bienvenido docente "+super.getNombre()+" ***"+'\n'+
                    "*----------------------------------------------*"+'\n'+
                    "Indique la cantidad de horas laboradas a la semana: "+getHorasClase());

            if(getHorasClase() > 8){

                System.out.println("El docente "+super.getNombre()+" imparte clases a tiempo completo."+'\n'+
                                    "Horarios: MATUTINO Y NOCTURNO");

            }else {

                System.out.println("El docente "+super.getNombre()+" imparte clases en una sola jornada."
                                    +'\n'+"Por favor indique su horario: Matutino= M o Nocturno= N");
                System.out.println("Horario: "+getHorario());
               if (getHorario()=='M'){
                   System.out.println("El docente "+super.getNombre()+" imparte clases en la mañana 'M'");
               }else {
                   System.out.println("El docente "+super.getNombre()+" imparte clases en la noche 'N'");
               }

            }

    }

    //Métodos GETTER & SETTER
    public int getFaltasProf() {
        return faltasProf;
    }

    public void setFaltasProf(int faltasProf) {
        this.faltasProf = faltasProf;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    public char getHorario() {
        return horario;
    }

    public void setHorario(char horario) {
        this.horario = horario;
    }
}
