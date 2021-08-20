 
package upb.edu.lista;
 
public class Nodo {
    //el nodo recibira 2 elementos, la edad y el nombre
    private alumno valor;
    private Nodo next; 

    public Nodo(int edad, String nombre){
        alumno nuevo = new alumno(edad, nombre);
        valor=nuevo;
    }

    public alumno getValor() {
        return valor;
    }
 
    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    public String mostrarInfo(){
        return "nombre:"+ valor.getNombre()+"\nedad: "+valor.getEdad();
    }
    
    
    
}
