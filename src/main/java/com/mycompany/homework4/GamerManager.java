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
public class GamerManager{
    GamerValidator _gamerValidator;
  
    public GamerManager(GamerValidator gamerValidator){
        _gamerValidator = gamerValidator;
     }
   
    public void singUp(Gamer gamer){
        if (_gamerValidator.isValid(gamer)) {
             System.out.println(gamer.firstName + " signed up.");
        }
         else
            System.out.println("Not a valid person");
    }
    
     public void updateAccount(Gamer gamer){
         System.out.println("Your account has been updated");
    }
    
     public void deleteAccount(Gamer gamer){
         System.out.println("your account has been deleted");
    } 
}
