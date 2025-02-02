/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rouguelike;

/**
 *
 * @author User
 */
public class Repost {
    String description;
    float chDamageRatio;
    float enDamageRatio;
    String condition1 = "";
    String condition2;
    
    public Repost(String description, float chDamageRatio, float enDamageRatio, String condition1, String condition2){
        this.description = description;
        this.chDamageRatio = chDamageRatio;
        this.enDamageRatio = enDamageRatio;
        this.condition1 = condition1;
        this.condition2 = condition2;
    }
    
    public String Description(){
        return description;
    }
    
    public float ChDamageRatio(){
        return chDamageRatio;
    }
    
    public float EnDamageRatio(){
        return enDamageRatio;
    }
    
    public String ConditionClass(){
        return condition1;
    }
    
    public String ConditionItems(){
        return condition2;
    }
}
