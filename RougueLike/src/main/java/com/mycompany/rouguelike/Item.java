/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rouguelike;

import static java.lang.Boolean.TRUE;

/**
 *
 * @author User
 */
public class Item {
    String name;
    int cost;
    float damage;
    float health;
    boolean usable;
    
    public Item(String name, boolean usable){
        this.name = name;
        this.usable = usable;
    }
    
    public Item(String name, boolean usable, float daamage, float health){
        this.name = name;
        this.usable = usable;
        this.damage = daamage;
        this.health = health;
    }
    
    /*void NameSet(String name){
        this.name = name;
    }*/
    
    void CostSet(int cost){
        this.cost = cost;
    }
    
    void DamageSet(float damage){
        this.damage = damage;
    }
    
    void HealthSet(float health){
        this.health = health;
    }
    
    String Name(){
        return name;
    }
    
    void Use(Character character){
        if (damage!=0){
            character.damage+=damage;
        }
        if (health!=0){
            character.ChangeHP(health);
        }
    }
}
