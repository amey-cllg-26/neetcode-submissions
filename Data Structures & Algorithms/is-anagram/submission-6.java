
class Solution{
 public boolean isAnagram(String s, String t){
   if(s.length() !=t.length()){
     return false;
    }
    Map<Character,Integer> mapS= new HashMap<>();
    Map<Character,Integer> mapT=new HashMap<>();
    for(int i=0;i<s.length();i++){
      char chS=s.charAt(i);
      char chT=t.charAt(i); 
      int  countS=mapS.getOrDefault(chS,0);
      mapS.put(chS,countS+1);
      int countT=mapT.getOrDefault(chT,0);
      mapT.put(chT,countT+1);
    }
    return mapS.equals(mapT);
}
}