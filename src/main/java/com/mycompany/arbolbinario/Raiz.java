/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolbinario;

/**
 *
 * @author Ignacio Gaynor
 */
public class Raiz {
    public Nodo raiz;
    
    public Raiz(){
        raiz = null;
    }
    
    
    public Raiz(Nodo Raiz) {
        this.raiz = Raiz;
    }
    
    boolean esVacio(){
        return raiz == null;
    }
    
    public static Nodo NuevoArbol(Nodo ramaIzquierda, Object dato , Nodo ramaDerecha){
        return new Nodo(ramaIzquierda, dato , ramaDerecha);
    }
    
    //MOSTRAMOS LA LISTA EN PREORDEN

    public void PreOrder(Nodo Arbol) {
        System.out.println("SE MOSTRARA EL ARBOL CON LA REGLA DEL PREORDER");
        System.out.println(Arbol.Dato.toString());
        if (Arbol.subArbolIzq() != null) {
            PreOrder(Arbol.subArbolIzq());
        }
        if (Arbol.subArbolDcho() != null) {
            PreOrder(Arbol.subArbolDcho());
        }
    }

    //MOSTRAMOS LA LISTA EN INORDEN
    public void InOrder(Nodo Arbol) {

        if (Arbol.subArbolIzq() != null) {
            InOrder(Arbol.subArbolIzq());
        }
        System.out.println("SE MOSTRARA EL ARBOL CON LA REGLA DEL InORDER");
        System.out.println(Arbol.Dato.toString());
        if (Arbol.subArbolDcho() != null) {
            InOrder(Arbol.subArbolDcho());
        }
    }
    //MOSTRAMOS EL ARBOL EN POSTORDEN

    public void PostOrder(Nodo Arbol) {

        if (Arbol.subArbolIzq() != null) {
            PostOrder(Arbol.subArbolIzq());
        }

        if (Arbol.subArbolDcho() != null) {
            PostOrder(Arbol.subArbolDcho());
        }
        System.out.println("SE MOSTRARA EL ARBOL CON LA REGLA DEL PostORDER");
        System.out.println(Arbol.Dato.toString());
    }
}
