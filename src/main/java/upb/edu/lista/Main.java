

package upb.edu.lista;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        int Edad=0;
        String Nombre="";
        Nodo primero=new Nodo(0,"");
        listaSimple std = new listaSimple(primero);
        std.vaciar();
        
        boolean ejecucion = true;
        while(ejecucion){
            int A = Integer.parseInt(JOptionPane.showInputDialog("""
                Acciones realizables sobre la lista de alumnos
                1. Agregar 
                2. borrar el primero
                3. borrar por indice
                4. borrar el ultimo
                5. Vaciar
                6. Buscar por indice
                7. mostrar el primero
                8. mostrar el ultimo
                9.mostrar al alumno mayor
                10.mostrar el alumno menor
                11.mostrar promedio de edades
                12.imprimir lista
                13. salir"""));
                
            
            switch(A){
                case 1:  
                    try{ 
                        Edad =Integer.parseInt( JOptionPane.showInputDialog("edad del alumno"));
                        Nombre = JOptionPane.showInputDialog("nombre del alumno"); 
                        Nodo nodo = new Nodo(Edad, Nombre);
                        std.agregar(nodo);
                        
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "introduzca un valor numerico");
                    }
                    break;
                case 2: 
                    try{
                        std.eliminarPrimero();
                    }catch(NullPointerException ez){
                        JOptionPane.showMessageDialog(null, "indice fuera de rango");
                    } 
                    break;
                case 3:  
                    try{    
                        Edad =Integer.parseInt( JOptionPane.showInputDialog("indice"));
                        std.eliminarPorIndice(Edad);    
                    }catch(NumberFormatException letras){
                        JOptionPane.showMessageDialog(null, "intoduzca un valor numerico");
                    }catch(NullPointerException ez){
                        JOptionPane.showMessageDialog(null, "indice fuera de rango");
                    }
                    break;
                case 4: 
                    try{
                        std.eliminarUltimo();
                    }catch(NullPointerException ez){
                        JOptionPane.showMessageDialog(null, "agregue un nuevo elemento");
                    } 
                    break;
                case 5: 
                    std.vaciar();
                    break;
                case 6: 
                    try{
                        Edad =Integer.parseInt( JOptionPane.showInputDialog("indice"));
                        System.out.println("edad: " + std.buscarPorIndice(Edad).getValor().getNombre()); 
                        System.out.println("nombre: " + std.buscarPorIndice(Edad).getValor().getEdad());
                        break;
                    }catch(NullPointerException fuera){
                        JOptionPane.showMessageDialog(null, "el indice esta fuera de rango, vuelve a intentarlo");
                    }catch(NumberFormatException letras){
                        JOptionPane.showMessageDialog(null, "has introducido una letra en lugar de un numero, vuelve a intentarlo");
                    }
                    
                    break;
                case 7: 
                    try{
                        System.out.println("Nombre: "+std.obtenerPrimero().getValor().getNombre()+"\nEdad:"+std.obtenerPrimero().getValor().getEdad());
                    }catch(NullPointerException ez){
                        JOptionPane.showMessageDialog(null, "agregue un nuevo elemento");
                    } 
                    break;
                case 8: 
                    try{
                        System.out.println("Nombre: "+std.obtenerUltimo().getValor().getNombre()+"\nEdad:"+std.obtenerUltimo().getValor().getEdad());
                    }catch(NullPointerException ez){
                        JOptionPane.showMessageDialog(null, "agregue un nuevo elemento");
                    }
                    break;
                case 9: 
                    std.calcularEdadMayor();
                    break;
                case 10: 
                    std.calcularEdadMenor();
                    break;
                case 11: 
                    try{
                        std.calcularPromedioEdad();
                    }catch(ArithmeticException ez){
                        JOptionPane.showMessageDialog(null, "agregue un nuevo elemento");
                    } 
                    break;
                case 12: 
                    std.imprimir();
                    break;
                case 13: 
                    ejecucion=false; 
                    break;
                
            } 
        }
        
        
        
        
       
        
    }
}
