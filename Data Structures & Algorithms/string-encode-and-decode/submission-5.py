class Solution:
    def encode(self,strs):
        result=""
        for s in strs:
            result= result+str(len(s))+"#"+s
        return result
    def decode(self,s):
        result=[]
        i=0
        while i<len(s):
            j=s.index("#",i)
            length=int(s[i:j])
            start=j+1
            end=start+length
            result.append(s[start:end])
            i=end
        return result