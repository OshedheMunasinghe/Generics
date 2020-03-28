package com.company;

public class Main {

    public static void main(String[] args) {
        Milk milk = new Milk();
        Oranges oranges = new Oranges();

        Box<Milk> boxOfMilk = new Box<>();
        Box<Oranges> boxOfOranges = new Box<>();

        boxOfMilk.add(milk);
        boxOfOranges.add(oranges);

        // boxOfMilk.remove().drin??  //how can you call to drink first and then call remove?

        //the answer is you need to typecast
        boxOfMilk.remove().drink(); //typcast the milk then wrap around to remove.. otherwise you can't call drink()
        boxOfOranges.remove().juggle();

        //What happens if we switch add in orange to milk the answer is we get exception thrown
        //to solve out we need to fix so called Generics


    }
}
