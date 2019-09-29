
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
        
        
        Set<String> mySet1 = new HashSet<>();
        mySet1.add("One");
        mySet1.add("Two");
        mySet1.add("Three");
        mySet1.add("Four");
        
        Set<String> mySet2 = new HashSet<>();
        mySet2.add("One");
        mySet2.add("Three");
        mySet2.add("Five");
        mySet2.add("Six");
        
        Set<String> resultSet = union(mySet1,mySet2);
        
        Iterator<String> iterator = resultSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    public static <E> Set<E> union(Set<E> set1,Set<E> set2){
        Set result = new HashSet<>(set1);
        result.add(set2);
        return result;
    } 
    
}
