package com.example.randy.hangman;

/**
 * Created by Randy on 9/24/2017.
 */

public class Container {
    String str = "";
    String check;
    String answer = "";
    public Container(String c){
        check = c;
        for(int i = 0; i < check.length(); i++){
            answer = answer + " _";
        }
    }

    public void setStr(String s){
        str = s;
    }

    public String getStr(){return str;}

    public String method(){
        String x = str;
        for(int  i = 0; i < check.length(); i++){
            if(check.charAt(i) == x.charAt(0)){
                return "Please";
            }

        }
        return str;
    }

    public String getAnswer(){return answer;}
}
