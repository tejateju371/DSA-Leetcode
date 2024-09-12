

public class Trys{
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int min=-1;
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                min=max;
                max=arr[i];
            }
        }
                  System.out.println(min);
  
    }



}