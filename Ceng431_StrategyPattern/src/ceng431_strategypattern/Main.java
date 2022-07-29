/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng431_strategypattern;

/**
 *
 * @author flashomer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        System.out.println(" -----------GOOGLE API -----------");
        connectionAPI(1);
        
        System.out.println("\n\n -----------YANDEX API -----------");
        connectionAPI(2);
    }
    
    public static void connectionAPI(int apiNum){
        
        API api = null;
        
        if(apiNum == 1) {
          api = new GoogleAPI();  
        } else if(apiNum == 2){
          api = new YandexAPI();
        } else {
            System.out.println("API number is not defined!");
        }
        
        api.getRequest();
        api.postRequest();
        api.mapInfo();
        api.searchInfo();
        
    }

    
}
