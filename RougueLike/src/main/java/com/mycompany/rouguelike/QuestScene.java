/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rouguelike;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class QuestScene {
    Condition condition = new Condition();
    
    String name;
    String description;
    public Character character;
    ArrayList<Option> options = new ArrayList<>();
    
    public QuestScene(String name, String description, Character character){
        this.name = name;
        this.description = description;
        this.character = character;
    }
    
    public void ShowOptions(Character character){
        for (int i = 0; i<options.size(); i++){            
            if (condition.Check(options.get(i).ConditionClass(), options.get(i).ConditionItems(), character)){
                System.out.println(i+1 + ". " + options.get(i).Description());
        }
    }
        
    /*void CheckOption(){
        
    }*/
        
    }
    public void AddOption(Option option){
        options.add(option);
    }
    
    String Description(){
        return description;
    }
    
    /*int OptionPath(Option option){
        return option.ShowPath();
    }*/
    
    ArrayList<QuestScene> OptionNextScenes(Option option){
        ArrayList<QuestScene> list = new ArrayList<>();
        for (int i = 0; i<options.size(); i++){
            list.add(options.get(i).nextScene);
        }
        return list;
    }
}

