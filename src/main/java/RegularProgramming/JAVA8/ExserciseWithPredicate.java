/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.JAVA8;

import java.util.function.Predicate;

public class ExserciseWithPredicate {
    private static Stock Stock;

    public static void main(String[] args) {
        Stock[] input ={new Stock(12),
                new Stock(10),
                new Stock(9)};

        perform(input, x->x.getStock());
        perform(input,RegularProgramming.JAVA8.Stock::getStock);
    }

    static void perform(Stock[] input,Predicate<Stock> stock){

        for (Stock i:input) {
            //System.out.println(i.getStock());
            System.out.println(stock.test(i));
        }
    }
}
class Stock{
    int predict;
    public boolean getStock() {
        return predict > 10;
    }

    public Stock(int in) {
        this.predict=in;
    }
}
