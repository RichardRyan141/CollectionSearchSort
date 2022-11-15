import java.util.*;
import java.util.stream.Collectors;

public class MainRichard141 {
    public static void main(String[] args)
    {
        System.out.println("=========LIST==========");
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(5);
        intList.add(3);
        intList.add(7);
        intList.add(1);
        System.out.println(intList);
        intList.add(2, 0);
        System.out.println(intList);
        intList.remove((Integer)3);
        System.out.println(intList);
        intList.remove(1);
        System.out.println(intList);
        intList.set(1,10);
        System.out.println(intList);
        intList = intList.stream().sorted().collect(Collectors.toList());
        System.out.println(intList);

        System.out.println("==========SET==========");

        Set<String> strSet = new HashSet<String>();
        if (strSet.isEmpty())
        {
            System.out.println("strSet is empty");
        }
        else
        {
            System.out.println("strSet is not empty");
        }
        strSet.add("Richard");
        strSet.add("Ryan");
        strSet.add("Adi");
        strSet.add("Richard");
        System.out.println(strSet);
        if (strSet.contains("Ryan"))
        {
            System.out.println("String 'Ryan' is in the set");
        }
        else
        {
            System.out.println("String 'Ryan' is not in the set");
        }
        if (strSet.contains("Budi"))
        {
            System.out.println("String 'Budi' is in the set");
        }
        else
        {
            System.out.println("String 'Budi' is not in the set");
        }
        if (strSet.isEmpty())
        {
            System.out.println("strSet is empty");
        }
        else
        {
            System.out.println("strSet is not empty");
        }

        System.out.println("==========MAP==========");

        Map<Integer, String> strIntMap = new HashMap<Integer, String>();
        strIntMap.put(1, "Richard");
        strIntMap.put(2, "Ryan");
        strIntMap.put(3, "Adi");
        for (Map.Entry<Integer, String> x : strIntMap.entrySet())
        {
            System.out.println("Key : " + x.getKey());
            System.out.println("Value : " + x.getValue());
            System.out.println("-------------------");
        }
        System.out.println("Value with key of 2 is " + strIntMap.get(2));

        System.out.println("==========QUEUE==========");

        Queue<Integer> intQueue = new LinkedList<Integer>();
        for (int i=0; i<5; i++)
        {
            intQueue.add(i);
        }
        System.out.println(intQueue);
        intQueue.remove();
        System.out.println(intQueue);
        System.out.println("Top of queue : " + intQueue.peek());
        System.out.println("Size of queue : " + intQueue.size());

        System.out.println("==========STACK==========");

        Stack<Integer> intStack = new Stack<Integer>();
        for (int i=0; i<5; i++)
        {
            intStack.add(i);
        }
        System.out.println(intStack);
        intStack.pop();
        System.out.println(intStack);
        System.out.println("Top of stack : " + intStack.peek());
        System.out.println("Size of stack : " + intStack.size());

        System.out.println("==========COMPARE TO==========");

        String str1 = "Richard";
        String str2 = "Ryan";
        String str3 = "Richard";
        if (str1.compareTo(str2) == 0)
        {
            System.out.println("str1 (\"" + str1 + "\") and str2 (\"" + str2 + "\") has the same value");
        }
        else
        {
            if (str1.compareTo(str2) > 0)
            {
                System.out.println("str1 (\"" + str1 + "\") is lexicographically less than str2 (\"" + str2 + "\")");
            }
            else
            {
                System.out.println("str1 (\"" + str1 + "\") is lexicographically greater than str2 (\"" + str2 + "\")");
            }
        }
        if (str1.compareTo(str3) == 0)
        {
            System.out.println("str1 (\"" + str1 + "\") and str3 (\"" + str3 + "\") has the same value");
        }
        else
        {
            if (str1.compareTo(str3) > 0)
            {
                System.out.println("str1 (\"" + str1 + "\") is lexicographically less than str3 (\"" + str3 + "\")");
            }
            else
            {
                System.out.println("str1 (\"" + str1 + "\") is lexicographically greater than str3 (\"" + str3 + "\")");
            }
        }
    }
}
