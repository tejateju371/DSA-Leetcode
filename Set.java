import java.util.*;

class People   {
    public People (int aid,String name){
        super();
        this.aid=aid;
        this.name=name;

    }

    @Override
    public String toString() {
        return "People{" +
                "aid=" + aid +
                ", name='" + name + '\'' +
                '}';
    }

  /*  @Override
    public int compare(People o1, People o2) {
        if(o1.getAid()> o2.getAid()){
            return 1;
        }else if (o1.getAid()<o2.getAid()){
            return -1;
        }
        return 0;
    }*/
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof People people)) return false;
        return aid == people.aid && name.equals(people.name);
    }*/

    public int getAid() {
        return aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

   /* @Override
    public int hashCode() {
        return Objects.hash(aid, name);
    }
*/
    public int aid;
    public String name;

    /*@Override
    public int compareTo(People o) {
        return  this.getAid()>o.getAid()?1:this.getAid()<o.getAid()?-1:0;
    }*/
}


public class Sets  {
    public static void main(String args[]){
        Comparator<People> com=new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return o1.getAid()>o2.getAid()?1:-1;
            }
        };

        People p1=new People(1,"teju");
        People p2=new People(4,"tej");
        People p3=new People(2,"te");
        People p4=new People(3,"t");


        TreeSet<People> si=new TreeSet<People>(com);
        si.add(p1);
        si.add(p2);
        si.add(p3);
        si.add(p4);

       /* Comparator<People> com=new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return o1.getAid()> o2.getAid()?1:-1;
            }
        };*/
       si.forEach(System.out::println);







    }




}
