/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arbolbinario;
import java.util.logging.Level;
import java.util.logging.Logger;
import tipoPila.pilaVector;
/**
 *
 * @author Ignacio Gaynor
 */
public class ArbolBinario {
    public static void main(String[] args) {
        //VARIABLES
      Nodo A , Izquierdo , Derecho;
      Raiz arbol;
      pilaVector pila = new pilaVector();
      //IMPLEMENTACIONES
      Izquierdo = Raiz.NuevoArbol(null, "MARIA", null);
      Derecho = Raiz.NuevoArbol(null, "Rodrigo", null);
      A= Raiz.NuevoArbol(Izquierdo, "ESPERANZA", Derecho);
      
        try {
            pila.insertar(A);
        } catch (Exception ex) {
            Logger.getLogger(ArbolBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      Izquierdo = Raiz.NuevoArbol(null, "GABRIEL", null);
      Derecho = Raiz.NuevoArbol(null, "ABEL", null);
      A = Raiz.NuevoArbol(Izquierdo, "M JESUS", Derecho);
      
        try {
            pila.insertar(A);
        } catch (Exception ex) {
            Logger.getLogger(ArbolBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Derecho = (Nodo) pila.quitar();
        } catch (Exception ex) {
            Logger.getLogger(ArbolBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Izquierdo = (Nodo) pila.quitar();
        } catch (Exception ex) {
            Logger.getLogger(ArbolBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
        A = Raiz.NuevoArbol(Izquierdo, "JUAN", Derecho);
      
      arbol = new Raiz(A);
      //RECORREMOS Y MOSTRAMOS
     arbol.PreOrder(arbol.raiz);
     System.out.println("-------------------------------------------------");
     arbol.InOrder(arbol.raiz);
     System.out.println("-------------------------------------------------");
     arbol.PostOrder(arbol.raiz);
    }}

