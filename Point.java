/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.point;

/**
 *
 * @author eyaso
 */
public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //meth affiche
    void affiche(){
        System.out.println("x= "+this.x+"y= "+this.y);
    }
    void translate(double dx,double dy){
        this.x += dx ;
        this.y += dy;
    }
   
    public static void main(String[] args) {
        Point p = new Point(2.6,8.0);
        p.affiche();
        p.translate(1,3);
        p.affiche();
  
    }

   
}

