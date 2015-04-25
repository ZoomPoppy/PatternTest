package TemplateMeathPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by zz on 2015/4/25.
 */
public class CoffeeWithHook extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and milk");
    }
    public boolean customeWantsCondiments(){
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        else {
            return false;
        }
    }

    private String getUserInput(){
        String answer = null;

        System.out.println("would you like milk and sugar with you coffee (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine( );

        } catch (IOException e) {
            System.out.println("IO error trying to read your answer");
        }
        if (answer == null){
            return "no";
        }
        return answer;
    }

}
