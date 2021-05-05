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
public class Game extends Campaign{
    
    int id;
    String tags;
    double price;
    String gameName;
    String gameReleaseDate;

    public Game(int id,String gameName, String gameReleaseDate,String tags,double price,double campaignAmount,String campaignDuration){
      this.id=id;
      this.price=price;
      this.tags=tags;
      this.gameName=gameName;
      this.gameReleaseDate=gameReleaseDate;
      this.getCampaignAmonut();
      this.getCampaignDuration();
      this.getCampaignName();
   
    }
    
}
