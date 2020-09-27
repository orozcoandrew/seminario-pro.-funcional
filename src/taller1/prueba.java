
package taller1;


import javax.swing.JOptionPane;


public class prueba {

   
    public static void main(String[] args) {
        
        alumno alumno = new alumno();
        docente docente = new docente();
        JOptionPane.showInternalMessageDialog(null, "ingresar datos del alumno");
        alumno.ingresar_datos();
        alumno.ingresarGrado();
        JOptionPane.showInternalMessageDialog(null, "ingresar datos del alumno");
        docente.ingresar_datos();
        docente.establecerMateria();
        
        if(docente.mostrarNumeroAleatorio() < alumno.mostrarNumeroAleatorio()){
            System.out.println(alumno.toString());
            
        }if(docente.mostrarNumeroAleatorio() > alumno.mostrarNumeroAleatorio()){
            System.out.println(docente.toString());
            
        }if(docente.mostrarNumeroAleatorio() ==alumno.mostrarNumeroAleatorio()) {
            System.out.println(" es un empate");
        }          
    }
}