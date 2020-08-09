package com.example.incrementalcounter;

public class ItemCost {

    private Resource res;
    private int cost;

    public ItemCost(Resource res, int cost)
    {
        this.res = res;
        this.cost = cost;
    }

    public Resource getResource()
    {
        return res;
    }

    public int getCost()
    {
        return cost;
    }

    public void changeCost(int multiplier)
    {
        cost *= multiplier;
    }
}
