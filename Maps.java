import java.util.*;
class Employees implements Comparable<Employees>{
    public Employees(int eid,String name){
        super();
        this.eid=eid;
        this.name=name;
    }
    public void setName(String name){
        this.name=name;

    }
    public void setEid(int eid){
        this.eid=eid;

    }
    public int getEid(){
        return eid;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                '}';
    }

    public int eid;
    private String name;




    @Override
    public int compareTo(Employees o) {
        return this.eid>o.eid?-1:1;
    }
}
public class Maps {
    public  static  void main(String args[]){
        Employees e1=new Employees(1,"teju");
        Map<Employees,Integer> maps=new HashMap<>();
        maps.put(e1,30000);
        maps.put(new Employees(2,"raju"),20000);
        maps.put(new Employees(0,"rao"),10000);
        //Collections.sort(maps,(o1,o2)->o1.);
        Set<Employees>si=   maps.keySet();
         List <Employees>ls=  si.stream().toList();
         Collections.sort(ls);
        for(Employees i:ls){
            System.out.println(i);
        }




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
