/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rouguelike;

//import java.util.Dictionary;
import static java.lang.Boolean.TRUE;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class Quest {
    String name;
    Character character;
    Map<String, QuestScene> transitions = new HashMap<>();
    ArrayList<QuestScene> scenes = new ArrayList<>();
    //ArrayList<Integer> nextScenes = new ArrayList<>();
    
    Scanner reader = new Scanner(System.in);
    Condition condition = new Condition();
    
    void AddScene(QuestScene ... list){
        for (QuestScene scene : list){
            scenes.add(scene);
        }
    }
    
    public Quest (Character character){
        this.character = character;
    }
    
    /*void FillTransitions(){
        for (int i = 0; i<scenes.size(); i++){
            for (int j = 0; j<scenes.get(i).options.size(); j++){
                transitions.put(key, value)
            }
        }
    }*/
    
    ArrayList<Integer> ScenesIndex(ArrayList<String> list){
        ArrayList<Integer> nextScenes = new ArrayList<>();
        for (int i = 0; i<list.size(); i++){
            nextScenes.add(scenes.indexOf(list.get(i)));
        }
        return nextScenes;
    }
    
    public void FillScene(QuestScene scene, Option ... options){
        for (Option option : options) {
            scene.AddOption(option);
        }
    }
    
    protected void QuestStart(){
        System.out.println(scenes.get(0).Description());
        //System.out.println(character.characterClass);
        scenes.get(0).ShowOptions(character);
        int last_n = 0;
        while (TRUE){
            if (scenes.get(last_n).options.isEmpty()){
                break;
            }
            int n = reader.nextInt()-1;
            ArrayList<QuestScene> nextScenes = scenes.get(last_n).OptionNextScenes(scenes.get(last_n).options.get(n));
            for (int j = 0; j<nextScenes.size(); j++){
                transitions.put((j+1)+"", nextScenes.get(j));
            }
            if (condition.Check(scenes.get(last_n).options.get(n).condition1, scenes.get(last_n).options.get(n).condition2, character)){               
                if (scenes.get(last_n).options.get(n).reward != null){
                    System.out.println("Вы получили " + scenes.get(last_n).options.get(n).reward.Name() + "!");
                    character.Change(scenes.get(last_n).options.get(n).reward);
                }
                if (scenes.get(last_n).options.get(n).hp != 0){
                    System.out.println("Вы вылечили/потратили " + scenes.get(last_n).options.get(n).hp + " здоровья!");
                    character.ChangeHP(scenes.get(last_n).options.get(n).hp);
                    System.out.println("Теперь у вас " + character.health + " здоровья");
                }
                if (scenes.get(last_n).options.get(n).money != 0){
                    System.out.println("Вы обогатились/обеднели на " + scenes.get(last_n).options.get(n).money + " монет!");
                    character.ChangeMoney(scenes.get(last_n).options.get(n).money);
                    System.out.println("Теперь у вас " + character.money + " монет.");
                }
                System.out.println(transitions.get((n+1)+"").Description());
                transitions.get((n+1)+"").ShowOptions(character);
                last_n = scenes.indexOf(transitions.get((n+1)+""));
            }
            else{
                System.out.println("Выберите доступный вариант!");
            }
        }
    }
}
