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
public class CricketData {
    
int runs, wickets;
  
float overs;
  
CurrentScoreDisplay currentScoreDisplay;
  
AverageScoreDisplay averageScoreDisplay;
  
 
// Constructor
public CricketData (CurrentScoreDisplay currentScoreDisplay,AverageScoreDisplay averageScoreDisplay) 
  {
    
    this.currentScoreDisplay = currentScoreDisplay;

    this.averageScoreDisplay = averageScoreDisplay;
  
  } 
 
// Get latest runs from stadium
private int getLatestRuns () 
  {
    return 90;
  }
  
 
// Get latest wickets from stadium
private int getLatestWickets () 
  {
    return 2; 
  }
  
 
// Get latest overs from stadium
private float getLatestOvers () 
  {
    return (float) 10.2;
  } 
 
// This method is used update displays when data changes
public void dataChanged () 
  {
    runs = getLatestRuns ();
    
    wickets = getLatestWickets ();

    overs = getLatestOvers ();
    
    currentScoreDisplay.update (runs, wickets, overs);

    averageScoreDisplay.update (runs, wickets, overs);

  } 

}