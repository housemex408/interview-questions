package com.jose.interview.twodeearray;

/**
 * Created by housemex408 on 4/13/17.
 */
public class TwoDeeArray {

    public String print(int [][] input)
    {
        final int columns = input.length;
        final int rows = input[0].length;

        StringBuffer buffer = new StringBuffer();

        for(int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                buffer.append(input[i][j]);
                buffer.append(" ");
            }
            buffer.append("\n");
        }

        return buffer.toString();
    }
}
