/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rouguelike;

import java.util.Random;

/**
 *
 * @author Документы
 */
public class Enemy {
    String name;
    float health;
    float damage;
    Attack[] attackList = new Attack[5];
    Repost[] repostList = new Repost[15];
    
    public Enemy(String name, float health, float damage){
        this.health = health;
        this.name = name;
        this.damage = damage;
    }
    
    float Health(){
        return health;
    }
    
    float Damage(){
        return damage;
    }
    
    String EnemyNameShow(){
        return name;
    }
    
    float EnemyDamage(){
        return damage;
    }
    
    Attack[] ShowAttacks(){
        return attackList;
    }
    
    Repost[] ShowReposts(){
        return repostList;
    }
    
    Attack[] FillAttacks(Attack a1, Attack a2, Attack a3, Attack a4, Attack a5){
        attackList[0] = a1;
        attackList[1] = a2;
        attackList[2] = a3;
        attackList[3] = a4;
        attackList[4] = a5;
        return attackList;
    }
    
    Repost[] FillReposts(Repost r1, Repost r2, Repost r3, Repost r4, Repost r5, Repost r6, Repost r7, Repost r8, Repost r9, Repost r10, Repost r11, Repost r12, Repost r13, Repost r14, Repost r15){
        repostList[0] = r1;
        repostList[1] = r2;
        repostList[2] = r3;
        repostList[3] = r4;
        repostList[4] = r5;
        repostList[5] = r6;
        repostList[6] = r7;
        repostList[7] = r8;
        repostList[8] = r9;
        repostList[9] = r10;
        repostList[10] = r11;
        repostList[11] = r12;
        repostList[12] = r13;
        repostList[13] = r14;
        repostList[14] = r15;
        //System.arraycopy(list, 0, reposts, 0, 15);
        return repostList;
    }
    
    public int RandomAttack(){
        Random rand = new Random();
        int n = rand.nextInt(5);
        return n;
}
    /*String Attack(){
        //String attack_description;
        return "";
    }*/
}

