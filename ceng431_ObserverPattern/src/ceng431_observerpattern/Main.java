/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng431_observerpattern;

/**
 *
 * @author flashomer
 */
public class Main {
  
public static void main (String args[]) 
  {
    
    AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay ();
   
    CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay ();
    
    CricketData cricketData = new CricketData (currentScoreDisplay,averageScoreDisplay);

    cricketData.dataChanged ();

  }  

}
