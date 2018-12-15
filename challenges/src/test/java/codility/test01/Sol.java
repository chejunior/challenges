package codility.test01;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;


public class Sol {

    public String solution(String y) {
        String x = "no answer";

        int T = y.length();
        for (int t = 0; t < T; t++) {
            char[] s = y.toCharArray();
            int length = s.length;


            int i = length - 1;
            while (i > 0 && s[i] <= s[i - 1]) {
               i--;
            }

            if (i != 0) {
                int j = i;
                int k = i;
                while (j < length) {
                    if (s[j] > s[i - 1] && s[j] < s[k]) {
                        k = j;
                    }
                    j++;
                }

                char tmp = s[i - 1];
                s[i - 1] = s[k];
                s[k] = tmp;
                Arrays.sort(s, i, length);

                x = new String(s);
            } 
        }
        return x;
    }

}
