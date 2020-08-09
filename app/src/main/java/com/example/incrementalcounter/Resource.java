package com.example.incrementalcounter;

public class Resource {

    private String name;
    private int total;
    private double rate;

    public Resource(String name)
    {
        this.name = name;
        total = 0;
        rate = 1.0;
    }

    public String getName()
    {
        return name;
    }

    public int getTotal()
    {
        return total;
    }

    public void setRate(double addRate)
    {
        rate += addRate;
    }

    public void autoCollection()
    {
        total += rate;
    }

    public void manualCollection(int clickRate)
    {
        total += clickRate;
    }

    public void spend(int cost) throws Exception {
        if(cost > total)
        {
            throw new Exception("Insufficient resources, can not spend " + cost + " of " + total + ".");
        }
        total -= cost;
    }

    public double getRate() {
        return rate;
    }
}
