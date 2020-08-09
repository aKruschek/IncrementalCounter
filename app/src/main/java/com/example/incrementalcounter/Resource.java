package com.example.incrementalcounter;

public class Resource {

    private String name;
    private int total;
    private int rate;

    public Resource(String name)
    {
        this.name = name;
        total = 0;
        rate = 1;
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
        rate = (int)Math.ceil(rate * addRate);
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

    public int getRate() {
        return rate;
    }
}
