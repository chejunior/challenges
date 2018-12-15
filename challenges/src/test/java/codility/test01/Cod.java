package codility.test01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
class Numbers {
    
    private Integer realNumber;
    private int ocurrences;
    public Integer getRealNumber() {
        return realNumber;
    }
    public void setRealNumber(Integer realNumber) {
        this.realNumber = realNumber;
    }
    public int getOcurrences() {
        return ocurrences;
    }
    public void setOcurrences(int ocurrences) {
        this.ocurrences = ocurrences;
    }
    
}
public class Cod {
    
    @SuppressWarnings("unchecked")
    public static List<Integer> rearrange(List<Integer> elements) {
        // Write your code here
        TreeSet<Integer> set =new TreeSet(elements);
        List<Numbers> x = new ArrayList();
        for (Integer i : set) {
            String line = Integer.toString(i,2);
            int count = line.length() - line.replace("1", "").length();
            Numbers n = new Numbers();
            n.setRealNumber(i);
            n.setOcurrences(count);

            x.add(n);
        }
        order(x);
        List<Integer> l = new ArrayList<>();
        for (Numbers numbers : x) {
            l.add(numbers.getRealNumber());
        }
        
        return l;

    }
    
    
    
    private static void order(List<Numbers> persons) {

        Collections.sort(persons, new Comparator() {

            public int compare(Object o1, Object o2) {

                Integer oc1 = ((Numbers) o1).getOcurrences();
                Integer oc2 = ((Numbers) o2).getOcurrences();
                int sComp = oc1.compareTo(oc2);

                if (sComp != 0) {
                   return sComp;
                } 

                Integer x1 = ((Numbers) o1).getRealNumber();
                Integer x2 = ((Numbers) o2).getRealNumber();
                return x1.compareTo(x2);
        }});
    }
    

}
