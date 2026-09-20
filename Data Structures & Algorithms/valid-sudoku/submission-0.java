import java.util.Set;
import java.util.HashSet;
class Solution{
   public boolean isValidSudoku(char[][] board){
    Set<Character>[] rows=new HashSet[9];
    Set<Character>[] cols=new HashSet[9];
    Set<Character>[] boxes=new HashSet[9];
    for(int i=0;i<9;i++){
        rows[i]=new HashSet<>();
        cols[i]=new HashSet<>();
        boxes[i]=new HashSet<>();
    }
    for(int r=0;r<9;r++){
        for(int c=0;c<9;c++){
            char d=board[r][c];
            if(d=='.'){
            continue;
            }
            int boxIndex=(r/3)*3+(c/3);
            if(rows[r].contains(d)){
            return false;
            }
            if(cols[c].contains(d)){
            return false;
            }
            if(boxes[boxIndex].contains(d)){
                return false;
            }
            rows[r].add(d);
            cols[c].add(d);
            boxes[boxIndex].add(d);
        }
    }
    return true;
    }
  }