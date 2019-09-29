
package genericsexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author me
 */
public class GenericsExample {

    
    public static void main(String[] args) {
        
        Container<Integer,String> container1 = new Container<>(12,"Red");
        int value = container1.getItem1();
        String word = container1.getItem2();
        System.out.println(value);
        System.out.println(word);
        
        
        Set<String> mySet1 = new HashSet<String>();
        mySet1.add("One");
        mySet1.add("Two");
        mySet1.add("Three");
        mySet1.add("Four");
        
        Set<String> mySet2 = new HashSet<String>();
        mySet2.add("One");
        mySet2.add("Three");
        mySet2.add("Five");
        mySet2.add("Six");
        
        Set<String> resultSet = union(mySet1,mySet2);
        
        Iterator<String> itr = resultSet.iterator();
        while(itr.hasNext()){
            String val = itr.next();
            System.out.println(val);
        }
    }
    
    public static <E> Set<E> union(Set<E> set1,Set<E> set2){
        Set<E> result = new HashSet<E>(set1);
        result.addAll(set2);
        return result;
    } 
    
}
