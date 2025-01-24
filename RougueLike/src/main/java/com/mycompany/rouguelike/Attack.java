/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rouguelike;

/**
 *
 * @author Документы
 */
public class Attack {
    String attack_description;
    int damage;
    
    public Attack(String attack_description, int damage){
        this.attack_description = attack_description;
        this.damage = damage;
        //System.out.println("абра");
    }
    
    String attack_desription(){
        return attack_description;
    }
    
    int take_damage(){
        return damage;
    }
    
}
