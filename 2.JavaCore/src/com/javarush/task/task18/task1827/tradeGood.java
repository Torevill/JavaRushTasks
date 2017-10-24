package com.javarush.task.task18.task1827;

public class tradeGood {


    public static String returnID(int id){
        String temp = Integer.toString(id);
        if(temp.length() < 8){
            for (int i = temp.length(); i < 8; i++) {
                temp = temp.concat(" ");
            }
        }
        return temp;
    }
    public static String returnProdName(String productName){
        if(productName.length() < 30){
            for (int i = productName.length(); i < 30; i++) {
                productName = productName.concat(" ");
            }
        }
        else if(productName.length()>30){
            productName = productName.substring(0,30);
        }
        return productName;
    }
    public static String returnPrice(String price){

        if(price.length() < 8){
            for (int i = price.length(); i < 8; i++) {
                price = price.concat(" ");
            }
        }
        else if (price.length() > 8){
            price = price.substring(0,8);
        }
        return price;
    }
    public static String returnQuant(String quantity){

        if(quantity.length() < 4){
            for (int i = quantity.length(); i < 8; i++) {
                quantity = quantity.concat(" ");
            }
        }
        else if(quantity.length()>4){
            quantity = quantity.substring(0,4);
        }
        return quantity;
    }

}
