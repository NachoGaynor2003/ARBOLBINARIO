/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolbinario;

/**
 *
 * @author Ignacio Gaynor
 */
public class Nodo {

    public Object Dato;
    public Nodo Izq;
    public Nodo Dcho;

    public Nodo() {

    }

    public Nodo(Object Dato) {
        this.Dato = Dato;
        Izq = Dcho = null;
    }

    public Nodo(Nodo Izq, Object Dato, Nodo Dcho) {
        this.Dato = Dato;
        this.Izq = Izq;
        this.Dcho = Dcho;
    }

    //GETEAMOS TODOS LOS VALORES 
    public Object ValorNodo() {
        return Dato;
    }

    public Nodo subArbolIzq() {
        return Izq;
    }

    public Nodo subArbolDcho() {
        return Dcho;
    }

    //SETEAMOS TODOS LOS VALORES AL NODO EN ESPECIFICO
    public void setDato(Object Dato) {
        this.Dato = Dato;
    }

    public void setIzq(Nodo Izquierdo) {
        this.Izq = Izquierdo;
    }

    public void setDcho(Nodo Derecho) {
        this.Dcho = Derecho;
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
        System.out.println("SE MOSTRARA EL ARBOL CON LA REGLA DEL PREORDER");
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
        System.out.println("SE MOSTRARA EL ARBOL CON LA REGLA DEL PREORDER");
        System.out.println(Arbol.Dato.toString());
    }

}
