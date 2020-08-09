package com.example.incrementalcounter;

import android.widget.TextView;

public class ResourceView {

    private Resource res;
    private TextView tv;

    public ResourceView(Resource res, TextView tv)
    {
        this.res = res;
        this.tv = tv;
        tv.setText(Integer.toString(res.getTotal()));
    }

    public void autoCollection()
    {
        res.autoCollection();
        tv.setText(Integer.toString(res.getTotal()));
    }
}
