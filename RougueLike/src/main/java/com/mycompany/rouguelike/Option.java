/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rouguelike;

/**
 *
 * @author User
 */
public class Option {
    //String name;
    QuestScene nextScene;
    String description;
    String condition1 = "";
    String condition2;
    //int path;
    Item reward;
    float hp;
    int money;
    
    public Option(String description, String condition1, String condition2, QuestScene nextScene){
        this.description = description;
        this.condition1 = condition1;
        this.condition2 = condition2;
        this.nextScene = nextScene;
    }
    
    public Option(String description, String condition1, String condition2, QuestScene nextScene, Item reward){
        this.description = description;
        this.condition1 = condition1;
        this.condition2 = condition2;
        this.nextScene = nextScene;
        this.reward = reward;
    }
    
    public Option(String description, String condition1, String condition2, QuestScene nextScene, float hp){
        this.description = description;
        this.condition1 = condition1;
        this.condition2 = condition2;
        this.nextScene = nextScene;
        this.hp = hp;
    }
    
    public Option(String description, String condition1, String condition2, QuestScene nextScene, int money){
        this.description = description;
        this.condition1 = condition1;
        this.condition2 = condition2;
        this.nextScene = nextScene;
        this.money = money;
    }
    
    public String Description(){
        return description;
    }
    
    public String ConditionClass(){
        return condition1;
    }
    
    public String ConditionItems(){
        return condition2;
    }
    
    
}
