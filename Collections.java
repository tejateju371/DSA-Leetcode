
import java.util.*;



public class Collections{

public static void main(String[] args) {


    List <Integer>con=new ArrayList();
    con.add(5);
   // con.add("hello");
    con.add(1,3);
        con.add(3);
    con.add(1);
    con.add(13);
    Collection.sort(con);


    for(Object h1:con){
        System.out.println(h1);
    }
}


}