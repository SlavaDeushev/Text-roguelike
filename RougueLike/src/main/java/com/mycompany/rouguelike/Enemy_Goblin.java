/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rouguelike;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Enemy_Goblin extends Enemy{
    
    //Map<Integer, Attack> attackList = new HashMap<>();
    Attack[] attackList = new Attack[5];
    public Enemy_Goblin(String name, int health) {
        super(name, health);
        attackList = FillAttacks(attack1, attack2, attack3, attack4, attack5);
    }
    
    Attack attack1 = new Attack("Гоблин бросается на вас с мечом", 10);
    Attack attack2 = new Attack("Гоблин бросается на вас с ножом", 8);
    Attack attack3 = new Attack("Гоблин бросается на вас с кулаками", 5);
    Attack attack4 = new Attack("Гоблин бросается на вас с луком", 12);
    Attack attack5 = new Attack("Гоблин бросается на вас со щитом", 9);
    
    
    
    //attackList = FillAttacks(attack1, attack2, attack3, attack4, attack5);
    //Attack attack = new Attack("Гоблин бросается на вас с мечом", 10);
    //ArrayList<Attack> attackList = new ArrayList<>();
    //Attack[] attackList = new Attack[5];
    //attackList[0] = new Attack();
    //attackList.add(attack);
    
   



}
