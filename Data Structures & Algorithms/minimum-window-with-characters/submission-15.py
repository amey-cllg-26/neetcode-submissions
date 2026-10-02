class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if len(s)<len(t):
            return ""
        need=[0]*128
        have=[0]*128
        for ch in t:
            need[ord(ch)] +=1
        required=0
        for i in range(128):
            if need[i]>0:
                required +=1
        matches=0
        left=0
        min_len=float("inf")
        min_start=0
        for right in range(len(s)):
            c=s[right]
            if need[ord(c)] >0:
                have[ord(c)] +=1
                if have[ord(c)]==need[ord(c)]:
                    matches+=1
            while matches==required:
                if right-left+1 <min_len:
                    min_len=right-left+1
                    min_start=left
                    
                lc=s[left]
                if need[ord(lc)]>0:
                    have[ord(lc)] -=1
                    if have[ord(lc)]<need[ord(lc)]:        
                        matches-=1
                left +=1
        if min_len==float('inf'):
            return ""
        return s[min_start:min_start+min_len]
