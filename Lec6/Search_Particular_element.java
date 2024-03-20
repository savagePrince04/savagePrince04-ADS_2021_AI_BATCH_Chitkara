package Lec6;

public class Search_Particular_element {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int target =7;
        int index=Search(arr,target);
        System.out.println(index);
    }
    public static int Search(int arr[],int target){
        int low =0;
        int high= arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (arr[mid]>target) {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
