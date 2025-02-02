/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rouguelike;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Fight {
    Enemy enemy;
    Character character;
    float chHealth;
    float enHealth;
    
    Scanner reader = new Scanner(System.in);
    Condition condition = new Condition();
    //ArrayList<String> items;
    
    public Fight(Enemy enemy, Character character){
        this.enemy = enemy;
        this.character = character;
        this.chHealth = character.Health();
        this.enHealth = enemy.Health();
    }   
    
    public void Round(){
        while (chHealth > 0 && enHealth > 0){
            int n = enemy.RandomAttack();
            Attack attack = enemy.ShowAttacks()[n];
            Repost repost1 = enemy.ShowReposts()[n*3];
            Repost repost2 = enemy.ShowReposts()[n*3+1];
            Repost repost3 = enemy.ShowReposts()[n*3+2];
            
            System.out.println(attack.attack_desription());
            System.out.println("");
            System.out.println("1. " + repost1.Description());

            if (condition.Check(repost2.ConditionClass(), repost2.ConditionItems(), character)){
                System.out.println("2. " + repost2.Description());
                }
            if (condition.Check(repost3.ConditionClass(), repost3.ConditionItems(), character)){
                System.out.println("3. " + repost3.Description());
                }                
            if (!character.UsableItems().isEmpty()){
                System.out.println("0. Посмотреть расходуемые предметы");
            }
            
            for (int i = 0; i<1;){    
                int step = reader.nextInt();
                switch (step) {
                    case 1:
                        chHealth = chHealth - repost1.ChDamageRatio()*enemy.Damage();
                        enHealth = enHealth - repost1.EnDamageRatio()*character.Damage();
                        System.out.println("Получено " + repost1.ChDamageRatio()*enemy.Damage() + " урона. " + character.name + " теперь имеет " + chHealth + " здоровья!");
                        System.out.println("Нанесено " + repost1.EnDamageRatio()*character.Damage() + " урона. " + enemy.name + " теперь имеет " + enHealth + " здоровья!");
                        i = i + 1;
                        break;
                    case 2:
                        if (condition.Check(repost2.ConditionClass(), repost2.ConditionItems(), character)){
                            chHealth = chHealth - repost2.ChDamageRatio()*enemy.Damage();
                            enHealth = enHealth - repost2.EnDamageRatio()*character.Damage();
                            System.out.println("Получено " + repost2.ChDamageRatio()*enemy.Damage() + " урона. " + character.name + " теперь имеет " + chHealth + " здоровья!");
                            System.out.println("Нанесено " + repost2.EnDamageRatio()*character.Damage() + " урона. " + enemy.name + " теперь имеет " + enHealth + " здоровья!");
                            i = i + 1;
                            break;
                        }
                        else{
                            System.out.println("Вам недоуступен этот вариант!");
                            break;
                        }
                    case 3:
                        if (condition.Check(repost3.ConditionClass(), repost3.ConditionItems(), character)){
                            chHealth = chHealth - repost3.ChDamageRatio()*enemy.Damage();
                            enHealth = enHealth - repost3.EnDamageRatio()*character.Damage();
                            System.out.println("Получено " + repost3.ChDamageRatio()*enemy.Damage() + " урона. " + character.name + " теперь имеет " + chHealth + " здоровья!");
                            System.out.println("Нанесено " + repost3.EnDamageRatio()*character.Damage() + " урона. " + enemy.name + " теперь имеет " + enHealth + " здоровья!");
                            i = i + 1;
                            break;
                        }
                        else{
                            System.out.println("Вам недоуступен этот вариант!");
                            break;
                        }
                    
                    case 0:
                        if (!character.UsableItems().isEmpty()){
                            for (int j = 0; j<character.UsableItems().size(); j++){
                                System.out.println((j+1) + ". " + character.UsableItems().get(j).name);
                            }
                            System.out.println("0. Выйти из инвентаря");
                            
                            for (int j=0; j<1; j++){
                                System.out.println("Какой предмет вы хотите использовать?");
                                int choice = reader.nextInt();
                                if (choice>0 && choice<=character.UsableItems().size()){
                                    character.UsableItems().get(choice-1).Use(character);
                                    System.out.println("Предмет использован, продолжайте бой");
                                    character.UsableItems().remove(choice-1);
                                    j++;
                                }
                                else if(choice==0){
                                    System.out.println("Выход из ивентаря...");
                                    j++;
                                }
                                else{
                                    System.out.println("Вам недоступен этот вариант!");
                                }
                            }
                            break;
                        }
                        
                        else{
                            System.out.println("У вас нет расходуемых предметов!");
                            break;
                        }
                        
                    default:
                        System.out.println("Выберите один из доступных вариантов, пожалуйста");
                        break;
                }
            }
        if (enHealth<=0 && chHealth>0){
            System.out.println("Вы победили!");
        }
        else if (chHealth<=0){
            System.out.println("Вы пали в бою как настоящий воин");
        }
    }
    }
}
