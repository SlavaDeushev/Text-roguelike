/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rouguelike;

/**
 *
 * @author Документы
 */
public class RougueLike {

    public static void main(String[] args) {
        Enemy_Goblin goblin = new Enemy_Goblin("Boblin", 30);
        System.out.println(goblin.EnemyNameShow());
        System.out.println(goblin.EnemyHealthShow());
        System.out.println(goblin.RandomAttack().attack_desription());
        System.out.println(goblin.RandomAttack().take_damage());
    }
}
