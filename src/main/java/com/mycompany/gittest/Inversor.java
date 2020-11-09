/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gittest;

/**
 *
 * @author ALEX
 */
public class Inversor {
    
    public Inversor(){}
    
    public String inverse(String str){
        String newStr = "";
        for (int i=str.length()-1;i>=0;i--){
            newStr += str.charAt(i);
        }
        return newStr;
    }
    
    public static void main(String[] args){
        Inversor i = new Inversor();
        System.out.println(i.inverse("Alex"));
        System.out.println(i.inverse("Xela"));
        System.out.println("Potit Chat");
    }
    
}
