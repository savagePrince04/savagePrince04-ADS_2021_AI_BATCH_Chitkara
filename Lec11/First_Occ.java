package Lec11;

public class First_Occ {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int item=300;
      int res= Find(arr,0,item) ;
        System.out.println(res);
    }
    public static int Find(int arr[],int index,int item){
        if(index== arr.length){
            return -1;
        }
        if(arr[index]==item){
            return index;
        }
         return Find(arr,index+1,item);
    }
}
