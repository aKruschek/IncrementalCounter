package com.example.incrementalcounter;

public class Item {

    private int owned;
    private String name;
    private Resource resource, resource1;
    private double rateAddition;
    private int cost, cost1;

    public Item(String name, Resource resource, Resource resource1)
    {
        this.name = name;
        this.resource = resource;
        this.resource1 = resource1;
        rateAddition = 0.1;
        cost = 20; //wood
        cost1 = 30; //metal
    }


    public String getName() {
        return name;
    }

    public int getOwned()
    {
        return owned;
    }

    public void buy() throws Exception {

        if(cost <= resource.getTotal() && cost1 <= resource1.getTotal()) {
            resource.setRate(rateAddition);

            owned ++;

            resource.spend(cost);
            resource1.spend(cost1);

            cost *= 1.2;
            rateAddition *= 1.2;

        }

    }
}
