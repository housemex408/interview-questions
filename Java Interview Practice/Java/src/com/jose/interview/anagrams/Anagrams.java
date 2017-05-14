package com.jose.interview.anagrams;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;

import java.util.HashMap;

/**
 * Time Complexity
 * sum(c1:c12) + n(b1) + n(b2)
 * sum(c1:c12) + n(b1 + b2)
 * O(n)
 */
public class Anagrams {
    public boolean isAnagram(String source, String target)
    {
        //c1 + c2
        String src, trg;

        //c3
        RegularExpression regEx = new RegularExpression("[\\s]+");

        // c4 + c5 + c6
        if(regEx.matches(source) || regEx.matches(target))
            return false;

        // c7 + c8 + c9
        if(source.length() >= target.length()) {
            src = source;
            trg = target;
        }
        else {
            src = target;
            trg = source;
        }

        //c10
        //52 characters in alphabet and 6 non alphabet characters between A-Z and a-z
        int [] srcCounts = new int[52 + 6];

        //c11
        //A-Z starts at decimal 65
        final int offset = 65;

        //O(n)
        //c12
        for(char c : src.toCharArray())
        {
            //c13
            int location = ((int)c) - offset;
            //c14
            int value = srcCounts[location];
            //c15
            srcCounts[location] = ++value;
        }

        //O(n)
        //c16
        for(char c : trg.toCharArray())
        {
            //c17
            int location = ((int)c) - offset;
            //c18
            int value = srcCounts[location];
            //c19
            if(value == 0) return false;
            //c20
            srcCounts[location] = --value;
        }

        return true;
    }

    public boolean isAnagramDS(String source, String target)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        String src, trg;
        RegularExpression regEx = new RegularExpression("[\\s]+");

        if(regEx.matches(source) || regEx.matches(target))
            return false;

        if(source.length() >= target.length()) {
            src = source;
            trg = target;
        }
        else {
            src = target;
            trg = source;
        }

        //O(n)
        for(char c : src.toCharArray())
        {
            if(map.containsKey(c))
            {
                int temp = map.get(c);
                map.put(c, ++temp);
            }
            else
            {
                map.put(c, 1);
            }
        }

        //O(n)
        for(char c : trg.toCharArray())
        {
            if(!map.containsKey(c)) return false;

            int temp = map.get(c);

            if(temp < 1) return false;
            map.put(c, --temp);
        }

        return true;
    }
}
