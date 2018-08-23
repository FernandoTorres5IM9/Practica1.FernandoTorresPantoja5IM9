package práctica1.fernandotorrespantoja;




/**
 *
 * @author Alumno
 */
abstract class CustomerAbstract {
    String Nombre = "Sin nombre";
    int Edad = 0;
    String Equipo = "Sin equipo";
    String Nacionalidad = "Sin Nacionalidad";
    int Peso = 0;
    
    abstract void Nombre();
    abstract void Edad();
    abstract void Equipo();
    abstract void Nacionalidad();
    abstract void Peso();
    abstract void Naciomiento();
}
