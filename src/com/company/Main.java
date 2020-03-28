package com.company;

public class Main {

    public static void main(String[] args) {
        Milk milk = new Milk();
        Oranges oranges = new Oranges();

        Box boxOfMilk = new Box();
        Box boxOfOranges = new Box();

        boxOfMilk.add(milk);
        boxOfOranges.add(oranges);

        // boxOfMilk.remove().drin??  //how can you call to drink first and then call remove?

        //the answer is you need to typecast
        ((Milk)boxOfMilk.remove()).drink(); //typcast the milk then wrap around to remove.. otherwise you can't call drink()
        ((Oranges)boxOfOranges.remove()).juggle();



    }
}
