/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homework4;

/**
 *
 * @author omerfaruk
 */
public class SaleManager {
    
    public void sale(Game game ,Gamer gamer){
        System.out.println(gamer.firstName + " bought : "+game.gameName);
    }
    
    public void addToBasket(Game game ,Gamer gamer){
        System.out.println(gamer.firstName+" , " + game.gameName + " added to basket");
    }
}
