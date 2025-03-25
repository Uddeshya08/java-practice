package Interview;

import java.awt.*;
import java.util.*;
import java.util.List;

class intrv {


    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int minPrice = Integer.MAX_VALUE;
        int minDay = -1;
        int maxProfit = 0;
        int sellDay = -1;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                minDay = i + 1;
            }

            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
                sellDay = i + 1;
            }
        }

        if (maxProfit > 0) {
            System.out.println("Buy on day " + minDay + " at price " + minPrice);
            System.out.println("Sell on day " + sellDay + " for max profit of " + maxProfit);
        } else {
            System.out.println("No profitable transaction possible.");
        }

    }
    }
