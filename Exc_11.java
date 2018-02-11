package Exc_11;

import java.util.HashSet;
import java.util.Set;

public class Exc_11
{
    public static void main(String[] args)
    {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i<10;i++)
        {
            set1.add((int)(Math.random()*15)+1);
            set2.add((int)(Math.random()*15)+1);
        }
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(symmetricSetDifference(set1,set2));
    }

    public static Set<Integer> symmetricSetDifference(Set<Integer> set1, Set<Integer> set2)
    {
        Set<Integer> removeSet = new HashSet<>();
        removeSet.addAll(set1);
        removeSet.retainAll(set2);
        set1.addAll(set2);
        set1.removeAll(removeSet);
        return set1;
    }
}
