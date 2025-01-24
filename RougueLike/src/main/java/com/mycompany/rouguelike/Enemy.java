/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rouguelike;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Документы
 */
public class Enemy {
    String name;
    int health;
    Attack[] attackList = new Attack[5];
    
    public Enemy(String name, int health){
        this.health = health;
        this.name = name;
    }
    
    int EnemyHealthShow(){
        return health;
    }
    
    String EnemyNameShow(){
        return name;
    } 
    
    Attack[] FillAttacks(Attack a1, Attack a2, Attack a3, Attack a4, Attack a5){
        attackList[0] = a1;
        attackList[1] = a2;
        attackList[2] = a3;
        attackList[3] = a4;
        attackList[4] = a5;
        return attackList;
    }
    
    public Attack RandomAttack(){
        Random rand = new Random();
        int n = rand.nextInt(5);
        return attackList[n];
}
    /*String Attack(){
        //String attack_description;
        return "";
    }*/
}

