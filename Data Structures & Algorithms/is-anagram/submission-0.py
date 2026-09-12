class Solution:
   def isAnagram(self,s,t):
      if(len(s)!=len(t)):
         return False
      countS={}
      countT={}
      for chS,chT in zip(s,t):
          countS[chS]=countS.get(chS,0)+1
          countT[chT]=countT.get(chT,0)+1
      return countS==countT