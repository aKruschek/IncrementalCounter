package com.example.incrementalcounter;

public class Item {

    private int owned;
    private String name;
    private double rateAddition;
    private ItemCost[] items;
    private Resource affected;

    public Item(String name, ItemCost[] items, Resource affected)
    {
        this.name = name;
        rateAddition = 0.1;
        this.items = items;
        this.affected = affected;
    }


    public String getName() {
        return name;
    }

    public int getOwned()
    {
        return owned;
    }

    public void buy() throws Exception {

        boolean everythingGood = true;

        for(ItemCost ic : items)
        {
            if (ic.getCost() > ic.getResource().getTotal())
            {
                everythingGood = false;
            }

        }

        if(everythingGood)
        {
            affected.setRate(1.5);
            owned ++;

            for(ItemCost ic : items)
            {
                ic.getResource().spend(ic.getCost());
                ic.changeCost(2);
            }
        }
    }
}
