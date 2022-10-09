package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg){
            this.price=300;
        }else{
            this.price=400;
        }
        extraCheese=false;
        extraToppings=false;
        takeAway=false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese) {
            extraCheese = true;
            price += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppings) {
            extraToppings = true;
            if (isVeg) {
                price += 70;
            } else {
                price += 120;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway) {
            takeAway = true;
            price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill="";
        if(isVeg){
            this.bill+="Base Price Of The Pizza: 300\n";
        }else{
            this.bill+="Base Price Of The Pizza: 400\n";
        }
        if(extraCheese){
            this.bill+="Extra Cheese Added: 80\n";
        }
        if(extraToppings){
            if(isVeg){
                this.bill+="Extra Toppings Added: 70\n";
            }else{
                this.bill+="Extra Toppings Added: 120\n";
            }
        }
        if(takeAway){
            this.bill+="Paperbag Added: 20\n";
        }
        bill+="Total Price: "+this.price+"\n";
        return this.bill;
    }
}
