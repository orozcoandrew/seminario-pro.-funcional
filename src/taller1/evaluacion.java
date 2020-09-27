
package taller1;


import javax.swing.JOptionPane;


public class evaluacion {

   
    public static void main(String[] args) {
        
        estudiante estudiante = new estudiante();
        docente docente = new docente();
        JOptionPane.showInternalMessageDialog(null, "ingresar datos del estudiante");
        estudiante.ingresar_datos();
        estudiante.ingresarGrado();
        JOptionPane.showInternalMessageDialog(null, "ingresar datos del estudiante");
        docente.ingresar_datos();
        docente.establecerMateria();
        
        if(docente.mostrarNumeroAleatorio() < estudiante.mostrarNumeroAleatorio()){
            System.out.println(estudiante.toString());
            
        }if(docente.mostrarNumeroAleatorio() > estudiante.mostrarNumeroAleatorio()){
            System.out.println(docente.toString());
            
        }if(docente.mostrarNumeroAleatorio() == estudiante.mostrarNumeroAleatorio()) {
            System.out.println(" es un empate");
        }          
    }
}

