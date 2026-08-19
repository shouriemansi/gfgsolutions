public class UpperBound {
    static int upperBound(int[] arr, int target){
        int n=arr.length;
        int l=0;
        int h=n-1;
        int res=n;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]<=target){
                l=mid+1;
            } 
            else{
                res=mid;
                h=mid-1;
            }
        }
        return res;
    }
}
