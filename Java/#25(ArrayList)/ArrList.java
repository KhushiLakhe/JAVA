import java.util.ArrayList;
import java.util.Collections;
class ArrList{
public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<Integer>();
    // add element
    list.add(0);
    list.add(3);
    list.add(2);
    System.out.println(list);
    // get element
    int element = list.get(1);
    System.out.println(element);
    // add an element in between
    list.add(1,6);
    System.out.println(list);
    // set element
    list.set(3,5);
    System.out.println(list);
    // remove an element
    list.remove(2);
    System.out.println(list);
    //size of an element
    int size = list.size();
    System.out.println(size);
    // loop
    for(int i = 0; i < list.size() ;i++){
        System.out.println(list.get(i));
    // sorting
    Collections.sort(list);
    System.out.println(list);
    }
}}