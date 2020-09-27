
package taller1;


import javax.swing.JOptionPane;


public class estudiante extends participante {

    private int grado =12;
    private String modulo = "Z";
    private String curso;
    
 public void ingresarGrado(){
     boolean error = false;
       do{
           try{
               while(grado>11 || grado<1){
           grado = Integer.parseInt(JOptionPane.showInputDialog("Escoja el curso cursado entre 1-11"));
           
       }
           error=true;
           }catch(NumberFormatException e){
               System.out.println(e);
           }
           
       }while(!error);
       
       //no nesecito manejar exception
       while(! modulo.equalsIgnoreCase("A") && !modulo.equalsIgnoreCase("B") && !modulo.equalsIgnoreCase("C")&& !modulo.equalsIgnoreCase("D")){
           modulo= JOptionPane.showInputDialog("Escoja el grado de la letra A la D");
       }
       
  curso = grado+"°"+modulo;

 }
 

    @Override
    public String toString() {
        return "estudiante{"+ super.mostrar_datos() + "curso =" + curso + "numero = "+""+ super.mostrarNumeroAleatorio()+ '}';
    }
}
 
