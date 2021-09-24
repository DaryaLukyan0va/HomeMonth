package ru.netology.stats;

public class StatsService {

    public int calculateSum (int[] sales){
        int sum = 0;
        for (int all : sales) {
            sum += all;
        }
        return sum;
    }

    public int averageSum(int[] sales){
        return calculateSum(sales) / sales.length;
    }

    public int maxMonth (int[] sales){
        int maxMonth = 0;
        int month =0;
        for (int all : sales){
            if (all >= sales[maxMonth]){
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minMonth (int[] sales){
        int minMonth = 0;
        int month =0;
        for (int all : sales){
            if (all <= sales[minMonth]){
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageSum (int[] sales) {
        int average = averageSum(sales);
        int below = 0;
          for (int i = 0; i < sales.length; i++)
                  if (sales[i] < average){
                below++;}
            return below;
        }

    public int aboveAverageSum (int[] sales) {
        int average = averageSum(sales);
        int below = 0;
        for (int i = 0; i < sales.length; i++)
            if (sales[i] > average){
                below++;}
        return below;
    }


}
