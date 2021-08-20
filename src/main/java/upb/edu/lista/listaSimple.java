    
package upb.edu.lista; 


 //Esta TAD debera tener; metodo para agregar, eliminar, buscar, mostrar y limpiar

public class listaSimple implements IListaEnlazadaTDA {
    //El elemento por que se empezara a recorrer la lista, un elemento Nodo no inicializado.
    Nodo primero; 
    Nodo ultimo;
    int tamaño=1;
    boolean N=true;
    
    //constructor que al momento de instanciar la clase pedira el primer valor de la lista por el que se llegara a otros elementos
    public listaSimple(Nodo nuevo){
        primero=nuevo;
        ultimo=primero;
        
    }
   
    //Add, agrega los elementos de forma alfabetica
    public void agregar(Nodo nuevo){ 
        if(tamaño==0){
            primero=nuevo;
            ultimo=primero;
        }else{ 
        Nodo current = primero; 
        Nodo anterior = primero;
         
        String nuevoIngreso = String.valueOf(nuevo.getValor().getNombre().trim().toLowerCase().charAt(0));
        String elementoX = String.valueOf(current.getValor().getNombre().trim().toLowerCase().charAt(0));
         
        if(nuevoIngreso.compareTo(elementoX)<=0){ 
            nuevo.setNext(current);
            primero=nuevo;   
             
         
             
        }else if(nuevoIngreso.compareTo(String.valueOf(ultimo.getValor().getNombre().trim().toLowerCase().charAt(0)))>=0){  
            ultimo.setNext(nuevo); 
            ultimo=nuevo ;   
        }else { 
            for(int i=0 ; i<tamaño-1 ; i++){   
                current=current.getNext(); 
                if(i!=0){ 
                    anterior= anterior.getNext();
                } 
                elementoX = String.valueOf(current.getValor().getNombre().trim().toLowerCase().charAt(0)); 
                if(nuevoIngreso.compareTo(elementoX)<=0){   
                    anterior.setNext(nuevo);
                    nuevo.setNext(current);    
                    break; 
                }
                
                
                
            }
        }
        
        }
        tamaño++;
    } 
    public void imprimir(){
        if(tamaño==0){
            System.out.println("lista vacia");
        }else{ 
            Nodo current = primero;
            for(int i = 0 ; i < tamaño ; i++){
                int elem = current.getValor().getEdad();
                String elem2= current.getValor().getNombre();
                System.out.println("Edad: " + elem + "\nNombre: "+elem2+"\n"); 
                current = current.getNext(); 
            }
        }
           
    }
     
    public Nodo buscarPorIndice(int indice){
        Nodo elem = primero;
        for(int i=0 ; i<indice ; i++){
            elem = elem.getNext();
        }
        return elem;
    }
     
    public void eliminarPorIndice(int indice){
        Nodo elem = primero;
        Nodo elemAnterior = primero;
        if(indice==0){
            primero=primero.getNext(); 
        }else if(indice==tamaño-1){
            for(int i=0 ; i<tamaño-1 ; i++){
                elem=elem.getNext();
            }
            ultimo=elem; 
        }else{
            for(int i=0 ; i<indice ; i++){
                elem=elem.getNext();
                if(i!=0){
                    elemAnterior=elemAnterior.getNext();
                }
            } 
            elemAnterior.setNext(elem.getNext()); 
        }
        tamaño--;
        
    }
     
    public Nodo obtenerPrimero(){
        return primero;
    }
     
    public Nodo obtenerUltimo(){
        return ultimo;
    }
     
    public void eliminarPrimero(){
        primero=primero.getNext();
        tamaño--;
    }
     
    public void eliminarUltimo(){
        Nodo elem=primero;
        for(int i=0 ; i<tamaño-2 ; i++){
            elem=elem.getNext();
        }
        ultimo=elem;
        ultimo.setNext(null);
        tamaño--;
    }
     
    public void vaciar(){
        primero=null;
        ultimo=null;
        tamaño=0;
    }
     
    public void calcularEdadMayor(){
        if(tamaño==0){
            System.out.println("lista vacia");
        }else{
            Nodo mayor=primero;
        Nodo elem=primero;
        int index=0;
        for (int i=0 ; i<tamaño-1 ; i++){
            elem=elem.getNext();
            if(mayor.getValor().getEdad()<elem.getValor().getEdad()){
                mayor=elem; 
                index=i+1;
            }
        }
        System.out.println("indice: "+index);
        }
    }
    
    public void calcularEdadMenor(){
        if(tamaño==0){
            System.out.println("lista vacia");
        }else{
            Nodo menor=primero;
            Nodo elem=primero;
            int index=0;
            for (int i=0 ; i<tamaño-1 ; i++){
                elem=elem.getNext();
                if(menor.getValor().getEdad()>elem.getValor().getEdad()){
                    menor=elem; 
                    index=i+1;
                }
            }
            System.out.println("indice: "+index);

        }
        
    }
    
    public void calcularPromedioEdad(){
        Nodo current = primero;
        int promedio=0;
        for(int i = 0 ; i < tamaño ; i++){
            promedio += current.getValor().getEdad();  
            current = current.getNext(); 
        }
        promedio/=tamaño;
        System.out.println("Promedio: " + promedio);
    }
     
    
    
    
    
    
}
