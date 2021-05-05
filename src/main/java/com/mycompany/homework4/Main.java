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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     Gamer gamer= new Gamer();
     gamer.id=1;
     gamer.firstName="Beyza";
     gamer.lastName="Işık";
     gamer.nationalityId="145693";
     gamer.yearOfBirth=2002;
     
     Game game=new Game(1,"Hotline Miami","1,02,1890","",45,25,"5 gün boyunca");
     
     
     GamerManager gamerManager= new GamerManager(new GamerValidator());
     gamerManager.singUp(gamer);
     
     SaleManager saleManager= new SaleManager();
     saleManager.addToBasket(game, gamer);
     saleManager.sale(game, gamer);
     
    }
    
}
