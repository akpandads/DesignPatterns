package com.akpanda.structural.composite;

import java.util.ArrayList;
import java.util.Collection;

class MyList extends ArrayList<ValueContainer>
{
    // please leave this constructor as-is
    public MyList(Collection<? extends ValueContainer> c)
    {
        super(c);
    }

    public int sum()
    {
        int result = 0;
        for (ValueContainer c : this)
        {
            for (int i : c)
            {
                result += i;
            }
        }
        return result;
    }
}