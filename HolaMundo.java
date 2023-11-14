/*
 * Muestra por pantalla la frase "¡Hola mundo!"
*/
public class HolaMundo {
    public static void main (String[] args) {
        String rojo = "\033[32m";
        String azul = "\033[34m";
        System.out.println(rojo +"¡Hola mundo!");
        System.out.println(azul +"Aquí estamos haciendo pruebas en Git");
    }
}

// git tag -a VERSION -m "DESCRIPCIÓN"
// Etiqueta el cambio realizado como una nueva versión del proyecto

// git tag -n
// Muestra todas las versiones

// git branch "nombre_rama"
// Crea una nueva rama (con -v vemos las ramas actuales)

// git checkout "nombre_rama"
// Cambia a la rama indicada (con -b la crea y se mueve a ella)

// git push --set-upstream origin "nombre_rama"
// Necesario para subir cosas a github cuando cambiamos de rama

// git javac nombre_fichero.java
// esto compila el archivo .java

// git java nombre_archivo.java
// esto ejecuta el archivo .java compilado