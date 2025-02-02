/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rouguelike;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Character {
    public float health = 60;
    public int money = 0;
    public int damage = 10;
    public String characterClass;
    public String name;
    public String nickname;
    public ArrayList<Item> items = new ArrayList<>();
    
    public Character(int n, String name){
        switch (n) {
            case 1 -> {
                this.characterClass = "Ниндзя";
                damage+=5;
            }
            case 2 -> {
                this.characterClass = "Самурай";
                damage+=2;
                health+=20;
            }
            case 3 -> {
                this.characterClass = "Они";
                health+=40;
            }
            default -> {
            }
        }   
        this.name = name;
    }
    
    public float Health(){
        return health;
    }
    
    public String Class(){
        return characterClass;
    }
    
    public boolean Item(String item){
        boolean flag = FALSE;
        for (int i = 0; i<items.size(); i++){
            if (items.get(i).Name().equals(item)){
                flag = TRUE;
            }
        }
        return flag;
    }
    
    public void ShowItems(){
        System.out.println(items);
    }
    
    void AddItem(Item item){
        items.add(item);
    }
    
    String Name(String name){
        return name;
    }
    
    public void ChangeHP(float hp){
        health+=hp;
    }
    
    public void Change(Item item){
        AddItem(item);
    }
    
    public void ChangeMoney(int coins){
        money+=coins;
    }
    
    public void ChangeDamage(float damageBonus){
        damage+=damageBonus;
    }
    
    public int Damage(){
        return damage;
    }
    
    public ArrayList<Item> UsableItems(){
        ArrayList<Item> usableItems = new ArrayList<>();
        for (Item i : items){
            if (i.usable){
                usableItems.add(i);
            }
        }
        return usableItems;
    }
}
