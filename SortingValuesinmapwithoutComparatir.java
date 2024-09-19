import java.util.*;

public class Maps {
    public  static  void main(String args[]){
        Map<Integer,String> map=new HashMap<>();
        map.put(54,"teja");
        map.put(53,"eja");
        map.put(52,"ja");
        map.put(15,"a");
        map.put(5,"raa");
        map.put(4,"teaj");
        Set<Integer> li=  map.keySet();
        for(int i :li){
            System.out.println(i);

        }
     Object[] arr =   li.toArray();
        Arrays.sort(arr);
        for(Object i :arr){
            System.out.println(i);
        }
        for(Object i: arr){
            System.out.println(i +map.get(i));
        }
        //Collections.sort(map);




    }
}
