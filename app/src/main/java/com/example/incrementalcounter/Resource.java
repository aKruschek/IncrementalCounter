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

    public void autoCollection()
    {
        total += rate;
    }

    public void manualCollection(int clickRate)
    {
        total += clickRate;
    }

    public void spend(int cost)
    {
        total -= cost;
    }
}
