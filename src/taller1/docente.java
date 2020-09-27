
package taller1;

import javax.swing.JOptionPane;


public class docente extends participante{

    private String materia;

    public docente() {
       materia = null;
    }
    public void establecerMateria(){
        materia = JOptionPane.showInputDialog("Digite la materia por favor");
    }
    

    @Override
    public String toString() {
        return "docente{" + super.mostrar_datos() + " materia = " + materia +" "+ super.mostrarNumeroAleatorio()+ '}';
    }

    
}
