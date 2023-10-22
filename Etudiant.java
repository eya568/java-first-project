/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.etudiant;

/**
 *
 * @author eyaso
 */
public class Etudiant {
    private final String nom;
    //const
    public Etudiant(String nom){
        this.nom = nom;
    }
    void travailler(){
        System.out.println("toto se met au travail!");
    }
    void seReposer(){
        System.out.println("toto se repose");
    }
    //meth 1
    public boolean compare1(Etudiant E1,Etudiant E2){
        return E1.equals(E2);
    }
    boolean compare2(Etudiant E1){
        return this.nom.equalsIgnoreCase(E1.nom);
    }}
  
   


        