package com.bridgelabz.basics;

public class EliminateZero {
    public String eliminate(String string){
         String temp = " ";
        for(int i = 0; i<string.length(); i++){
            if(string.charAt(i) != '0'){
                temp = temp + string.charAt(i);
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        String string = "000br0idge00lab0z";
        EliminateZero obj = new EliminateZero();
        obj.eliminate(string);

        System.out.println(obj.eliminate(string));

    }
}
