class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        int min=Integer.MAX_VALUE;
        int sec=Integer.MAX_VALUE;
                for(int i=0;i<arr.length;i++){
                    if(arr[i]<min){
                        sec=min;
                        min=arr[i];
                    }
                    else if(arr[i]<sec && arr[i]!=min){
                        sec=arr[i];
                    }
                }
                ArrayList<Integer> nums=new ArrayList<>();
                if(sec==Integer.MAX_VALUE){
                    nums.add(-1);
                }
                else{
                    nums.add(min);
                    nums.add(sec);
                }
                return nums;
    }
}
