/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rouguelike;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/*import com.mycompany.rouguelike.Character;
import com.mycompany.rouguelike.Character;
import com.mycompany.rouguelike.Option;
import com.mycompany.rouguelike.Option;
import com.mycompany.rouguelike.Quest;
import com.mycompany.rouguelike.Quest;
import com.mycompany.rouguelike.QuestScene;
import com.mycompany.rouguelike.QuestScene;*/

/**
 *
 * @author User
 */
public class Quest_ForestEntrance extends Quest {
    Character hero;
    
    public QuestScene scene1 = new QuestScene("Начало", "Вы стоите на входе в зловещий гоблинский лес. Вы знаете, что именно здесь находится ваша первая цель. Собрав всю свою волю в кулак, вы входите в лес и видете развилку.", hero);
    public QuestScene scene2 = new QuestScene("Поле боя", "Вы подошли к поле битвы. Здесь вы видете тела людей и гоблинов.", hero);
    public QuestScene scene3 = new QuestScene("Мертвый самурай", "Вы подошли к скелету, который опирается спиой на дерево и даже после смерти держит катану в руках.", hero);
    public QuestScene scene4 = new QuestScene("Треснувший валун", "Вы подошли к треснувшему валуну. Его явно разломил кто-то очень сильный чем-то очень крепким.", hero);
    public QuestScene sceneEnd = new QuestScene("Продолжение пути", "Исследовав вход в лес, вы продолжили свой путь.", hero);
    
    public Option option1 = new Option("Осмотреть останки на поле боя", "", null, scene2);
    public Option option2 = new Option("Осмотреть останки самурая", "", null, scene3);
    public Option option3 = new Option("Осмотреть расколотый валун", "", null, scene4);
    public Option option1_1 = new Option("Поискать оружие (Ниндзя)", "Ниндзя", null, sceneEnd, new Item("Кинжалы", FALSE));
    public Option option1_2 = new Option("Поискать деньги", "", null, sceneEnd, 50);
    public Option option1_3 = new Option("Помолиться за души умерших", "Самурай", null, sceneEnd, 5f);
    public Option option2_1 = new Option("Взять катану себе с обещанием отомстить (Самурай)", "Самурай", null, sceneEnd, new Item("Катана", FALSE));
    public Option option2_2 = new Option("Забрать наплечник", "Они", null, sceneEnd, 5f);
    public Option option2_3 = new Option("Пройти мимо", "", null, sceneEnd);
    public Option option3_1 = new Option("Приподнять камень и забрать палицу, которой, похоже, этот камень и раскололи", "Они", null, sceneEnd, new Item("Огромная палица", FALSE));
    public Option option3_2 = new Option("Набрать лечебных трав", "Ниндзя", null, sceneEnd, new Item("Леченбые ягоды", TRUE, 0, 10));
    public Option option3_3 = new Option("Пройти мимо", "", null, sceneEnd);
    
    
    //FillScene();

    public Quest_ForestEntrance(Character character) {
        super(character);
    }
    
    
}   
