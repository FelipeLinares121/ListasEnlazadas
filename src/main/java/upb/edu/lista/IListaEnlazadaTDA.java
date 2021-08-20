/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upb.edu.lista;

/**
 *
 * @author edwar
 */
public interface IListaEnlazadaTDA {
        public void agregar(Nodo nuevo);
        public Nodo buscarPorIndice(int indice);
        public void eliminarPorIndice(int indice);
        public Nodo obtenerPrimero();
        public Nodo obtenerUltimo();
        public void eliminarPrimero();
        public void eliminarUltimo();
        public void vaciar();
        
}
