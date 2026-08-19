class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int n = arr.length;
        int l = 0;
        int h = n-1;
        int res = arr.length;

        while(l<=h){
            int mid = l + (h-l)/2;
            if(arr[mid] >= target){
                res = mid;
                h = mid - 1;
            }
            else{
                l = mid+1;
            }
        }
        return res; 
    }
}
