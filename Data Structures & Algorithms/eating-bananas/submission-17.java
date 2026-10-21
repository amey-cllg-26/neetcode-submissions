class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile=0;
        for(int p:piles){
            maxPile=Math.max(maxPile,p);
        }
        int low=1,high=maxPile;
        while(low<high){
            int mid=low+(high-low)/2;
            if(canFinish(piles,mid,h)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean canFinish(int[] piles,int k,int h){
        int hours=0;
        for(int p:piles){
            hours+=(p+k-1)/k;
            if(hours>h) return false;
        }
        return true;
    }
}
