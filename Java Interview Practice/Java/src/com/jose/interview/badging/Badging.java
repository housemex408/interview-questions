package com.jose.interview.badging;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by housemex408 on 4/12/17.
 */
public class Badging {

    public boolean isWellFormed(String [] input) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> actions;

        //O(n)
        for(String i : input)
        {
            if(!i.matches("(L|E)\\s\\d{3}")) return false;
            String id = i.substring(2, i.length());
            String action = i.substring(0,1);

            //id exists
            if(map.containsKey(id))
            {
                actions = map.get(id);
                String lastAction = actions.get(actions.size() - 1);
                if(lastAction == action) return false;
                actions.add(action);
            }
            //id doesn't exist yet
            else
            {
                if(action.equals("L")) return  false;
                actions = new ArrayList<>();
                actions.add(action);
                map.put(id, actions);
            }
        }

        Iterator<Map.Entry<String, ArrayList<String>>> entries = map.entrySet().iterator();

        //O(n)
        while(entries.hasNext())
        {
            Map.Entry<String, ArrayList<String>> es = entries.next();
            actions = es.getValue();
            String action = actions.get(actions.size() - 1);
            if(action.equals("E")) return false;
        }

        return true;
    }
}
