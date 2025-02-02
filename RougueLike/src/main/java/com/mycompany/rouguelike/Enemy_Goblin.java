/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rouguelike;


public class Enemy_Goblin extends Enemy{
    
    //Map<Integer, Attack> attackList = new HashMap<>();
    Attack[] attackList = new Attack[5];
    Repost[] repostList = new Repost[15];
    public Enemy_Goblin(String name, int health, int damage) {
        super(name, health, damage);
        attackList = FillAttacks(attack1, attack2, attack3, attack4, attack5);
        repostList = FillReposts(repost1_1, repost1_2, repost1_3, repost2_1, repost2_2, repost2_3, repost3_1, repost3_2, repost3_3, repost4_1, repost4_2, repost4_3, repost5_1, repost5_2, repost5_3);
    }
    
    Attack attack1 = new Attack(name + " бросается на вас с мечом");
    Attack attack2 = new Attack(name + " метает в вас нож");
    Attack attack3 = new Attack(name + " бросается вам в ноги");
    Attack attack4 = new Attack(name + " пытается порезать ваши руки мечом");
    Attack attack5 = new Attack(name + " медлит");
    
    Repost repost1_1 = new Repost("Обменяться с гоблинами ударами", 1, 1, "", null);
    Repost repost1_2 = new Repost("Ударить гоблина ногой в голову (Они)", 0, 0.5f, "Они", null);
    Repost repost1_3 = new Repost("Метнуть кинжал в гоблина (Кинжалы)", 0, 1, "", "Кинжалы");
    Repost repost2_1 = new Repost("Увернуться, но получить порез", 0.5f, 0, "", null);
    Repost repost2_2 = new Repost("Увернуться и метнуть кинжал в ответ (Ниндзя + Кинжалы)", 0, 0.5f, "Ниндзя", "Кинжалы");
    Repost repost2_3 = new Repost("Закрыться палицой (Огромная палица)", 0, 0, "", "Огромная палица");
    Repost repost3_1 = new Repost("Пнуть гоблина, но получить порез", 0.5f, 0.5f, "", null);
    Repost repost3_2 = new Repost("Среагировать и отвести от себя удар (Самурай)", 0, 0, "Самурай", null);
    Repost repost3_3 = new Repost("Успеть ударить катаной (Катана)", 1, 1, "", "Катана");
    Repost repost4_1 = new Repost("Одернуть руки, но получить порез", 0.5f, 0, "", null);
    Repost repost4_2 = new Repost("Отбить удар катаной и проткнуть гоблина (Самурай + Катана)", 0, 2, "Самурай", "Катана");
    Repost repost4_3 = new Repost("Ударить гоблина в череп несмотря на порез (Они)", 1, 1.5f, "Они", null);
    Repost repost5_1 = new Repost("Накинуться на гоблина", 0, 1, "", null);
    Repost repost5_2 = new Repost("Снести гоблина своим весом (Они)", 0, 1.5f, "Они", null);
    Repost repost5_3 = new Repost("Нашпиговать гоблина кинжалами", 0, 2, "Ниндзя", "Кинжалы");
    
    //attackList = FillAttacks(attack1, attack2, attack3, attack4, attack5);
    //Attack attack = new Attack("Гоблин бросается на вас с мечом", 10);
    //ArrayList<Attack> attackList = new ArrayList<>();
    //Attack[] attackList = new Attack[5];
    //attackList[0] = new Attack();
    //attackList.add(attack);
    
   



}
