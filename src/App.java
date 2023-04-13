import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
        alumnos.add(new Alumno("Juan", 18));
        alumnos.add(new Alumno("Pepe", 33));
        alumnos.add(new Alumno("Maria", 25));
        alumnos.add(new Alumno("Juan", 21));
        alumnos.add(new Alumno("Juan", 21));
        alumnos.add(new Alumno("Carmen", 44));
        alumnos.add(new Alumno("Luis", 20));
        alumnos.add(new Alumno("Rafael", 34));
        alumnos.add(new Alumno("Laura", 28));
        alumnos.add(new Alumno("Francisco", 50));

        

/*         for (Alumno alumno : alumnos) {
            if (alumno.getNombre()=="Juan" && alumno.getEdad()<20) {
                alumnos.remove(alumno);
        }
*/
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre()=="Juan" && alumnos.get(i).getEdad()>20) {
                alumnos.remove(alumnos.get(i));
                i--;
            }
        }

/*         Iterator<Alumno> iter = alumnos.iterator();
        while (iter.hasNext()) {
            Alumno alum=iter.next();
            if (alum.getNombre()=="Juan" && alum.getEdad()>20) {
                iter.remove();
        }
        }
 */

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }



        Alumno a1=new Alumno("Juan",25);
        Alumno a2=new Alumno("Juan",25);

        System.out.println(a1==a2);
    }
}
