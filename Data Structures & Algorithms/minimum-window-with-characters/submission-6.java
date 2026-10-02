class Solution{
    public String minWindow(String s, String t){
        if(s.length()<t.length()) return "";
        int[] need=new int[128];
        int[] have=new int[128];
        for(int i=0;i<t.length();i++){
            need[t.charAt(i)]++;
        }
        int required=0;
        for(int i=0;i<128;i++){
            if(need[i]>0) required++;
        }
        int matches=0;
        int left=0;
        int minLen=Integer.MAX_VALUE;
        int minStart=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(need[c]>0){
                have[c]++;
                if(have[c]==need[c]){
                    matches++;
                }
            }
            while(matches==required){
                if(right-left+1 < minLen){
                    minLen=right-left+1;
                    minStart=left;
                }
                char lc=s.charAt(left);
                if(need[lc]>0){
                    have[lc]--;
                    if(have[lc]<need[lc]){
                        matches--;  
                    }
                }
                left++;
            }
        }
        if(minLen==Integer.MAX_VALUE) return "";
        return s.substring(minStart,minStart+minLen);
    }
}