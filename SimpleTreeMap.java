
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class SimpleTreeMap {

    public static void main(String args[]) {

        //TreeMap declaration
        TreeMap<Integer, String> myTreeMap = new TreeMap<Integer, String>();

        //put elements to TreeMap
        myTreeMap.put(1, "Stuart");
        myTreeMap.put(23, "Michael");
        myTreeMap.put(7, "Johnny");
        myTreeMap.put(5, "Ivy");
        myTreeMap.put(2, "Alex");

        //Display and print out myTreeMap using Iterator
        Set set = myTreeMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry myEntry = (Map.Entry) iterator.next();
            System.out.print("key: " + myEntry.getKey() + " value: ");
            System.out.println(myEntry.getValue());
        }
        //TreeMap printed in classical way
        System.out.println(myTreeMap);
        //removing an element with the key =2
        myTreeMap.remove(2);
        //myTreeMap after removing:
        System.out.println(myTreeMap);

    }
}

//OUTPUT:
/*

key: 1 value: Stuart
key: 2 value: Alex
key: 5 value: Ivy
key: 7 value: Johnny
key: 23 value: Michael
{1=Stuart, 2=Alex, 5=Ivy, 7=Johnny, 23=Michael}
{1=Stuart, 5=Ivy, 7=Johnny, 23=Michael}
*/
