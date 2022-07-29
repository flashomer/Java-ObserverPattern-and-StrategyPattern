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
public class GoogleAPI implements API {

    @Override
    public void getRequest() {
        System.out.println("getRequest command is running on \"GoogleAPI\"");
    }

    @Override
    public void postRequest() {
        System.out.println("postRequest command is running on \"GoogleAPI\"");
    }

    @Override
    public void mapInfo() {
        System.out.println("mapInfo command is running on \"GoogleAPI\"");
    }

    @Override
    public void searchInfo() {
        System.out.println("searchInfo command is running on \"GoogleAPI\"");
    } 
    
}
