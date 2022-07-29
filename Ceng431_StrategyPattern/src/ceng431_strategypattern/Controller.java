package ceng431_strategypattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flashomer
 */
public class Controller {

    private APIService apiService;


    public void getRequest() {
        apiService.getRequest();
    }


    public void postRequest() {
        apiService.postRequest();
    }


    public void mapInfo() {
        apiService.mapInfo();
    }


    public void searchInfo() {
        apiService.searchInfo();
    }  
}
