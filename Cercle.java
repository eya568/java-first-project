/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cercle;

/**
 *
 * @author eyaso
 */
public class Cercle {
    private float rayon;
    public static final double pi = 3.14;

    private Cercle(float r) {
        this.rayon = r;
    }
    //meth surfd
    double surface(){
        return this.rayon * pi;   
    }
    //meth perimet
    double perimetre(){
        return this.rayon * 2 * pi;
    }
    //meth affiche
    void affiche(){
        System.out.println("R= "+rayon);
        System.out.println("P= "+perimetre());
        System.out.println("S= "+surface());
    }
    void modifier(float r){
        this.rayon = r;
    }
    
    
    public static void main(String[] args) {
        Cercle c = new Cercle((float) 3.8);
        c.affiche();
        c.modifier(3);
        c.affiche();
    }
}
