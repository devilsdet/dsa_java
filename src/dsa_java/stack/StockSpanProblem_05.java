package dsa_java.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Stock {
    int day;
    int amount;

    public Stock(int day, int amount) {
        this.day = day;
        this.amount = amount;
    }

    public String toString() {
        return "[ day "+ day + " : amount ] ";
    }
}
public class StockSpanProblem_05 {
    public static void main(String[] args) {
        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock(0, 100));
        stockList.add(new Stock(1, 80));
        stockList.add(new Stock(2, 60));
        stockList.add(new Stock(3, 70));
        stockList.add(new Stock(4, 60));
        stockList.add(new Stock(5, 75));
        stockList.add(new Stock(6, 85));
        System.out.println(Arrays.toString(findStockSpan(stockList)));
    }

    private static int[] findStockSpan(List<Stock> stockList) {
        Stack<Stock> stack = new Stack<>();
        int[] ngr = new int[stockList.size()];
        int[] output = new int[ngr.length];

        for(int i=0; i<stockList.size(); i++) {
            if(stack.isEmpty()) {
                ngr[i] =-1;
            } else if(stack.peek().amount > stockList.get(i).amount) {
                ngr[i] = stack.peek().day;
            } else {
                while(!stack.isEmpty() && stack.peek().amount < stockList.get(i).amount) {
                    stack.pop();
                }
                if(stack.isEmpty()) {
                    ngr[i] = -1;
                } else {
                    ngr[i] = stack.peek().day;
                }
            }
            stack.add(stockList.get(i));
        }
        for(int i=0; i<ngr.length; i++) {
            output[i] = i - ngr[i];
        }
        return output;
    }
}
