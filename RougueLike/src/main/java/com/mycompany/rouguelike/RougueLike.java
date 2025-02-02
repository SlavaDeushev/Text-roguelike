/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rouguelike;

import java.util.Scanner;

/**
 *
 * @author Документы
 */
public class RougueLike {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in, "UTF-8");
        Enemy_Goblin goblin = new Enemy_Goblin("Гоблин воин", 30, 10);
        //System.out.println(goblin.EnemyNameShow());
        //System.out.println(goblin.Health());
        System.out.println("Как зовут вашего персонажа?");
        String name = reader.nextLine();
        System.out.println("Какого класса ваш персонаж: 1. Ниндзя. 2. Самурай. 3. Они. (Другие цифры оставят вас без класса!)");
        int step = reader.nextInt();
        Character hero = new Character(step, name);
        /*System.out.println("Какое оружие вы хотите: 1. Кинжалы. 2. Катана. 3. Огромая палица. (Другие цифры оставят вас без оружия!)");
        step = reader.nextInt();
        switch (step) {
            case 1 -> hero.AddItem("Кинжалы");
            case 2 -> hero.AddItem("Катана");
            case 3 -> hero.AddItem("Огромная палица");
            default -> {
            }
        }*/
        Quest_ForestEntrance quest = new Quest_ForestEntrance(hero);
        quest.FillScene(quest.scene1, quest.option1, quest.option2, quest.option3);
        quest.FillScene(quest.scene2, quest.option1_1, quest.option1_2, quest.option1_3);
        quest.FillScene(quest.scene3, quest.option2_1, quest.option2_2, quest.option2_3);
        quest.FillScene(quest.scene4, quest.option3_1, quest.option3_2, quest.option3_3);
        quest.AddScene(quest.scene1, quest.scene2, quest.scene3, quest.scene4, quest.sceneEnd);
        quest.QuestStart();
        
        Fight fight = new Fight(goblin, hero);
        fight.Round();
        step = reader.nextInt();
    }
}
