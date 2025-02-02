/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rouguelike;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 *
 * @author User
 */
public class Condition {
    public boolean Check(String con1, String con2, Character character){
        if ((con1.equals(character.Class()) || con1.equals("")) && (character.Item(con2) || con2==null)){
            return TRUE;
        }
        else{
            return FALSE;
        }
    }
}
