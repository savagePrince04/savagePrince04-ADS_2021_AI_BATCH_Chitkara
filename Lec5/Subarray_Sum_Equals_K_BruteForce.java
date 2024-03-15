package Lec5;

public class Subarray_Sum_Equals_K_BruteForce {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8};
        int k=5;
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
