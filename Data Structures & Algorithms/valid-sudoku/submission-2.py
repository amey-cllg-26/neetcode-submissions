class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows=[set() for _ in range(9)]
        cols=[set() for _ in range(9)]
        boxes=[set() for _ in range(9)]
        for r in range(9):
            for c in range(9):
                d=board[r][c]
                if d==".":
                    continue
                boxIndex=(r//3)*3+(c//3)
                if d in rows[r]:
                    return False
                if d in cols[c]:
                    return False
                if d in boxes[boxIndex]:
                    return False
                rows[r].add(d)
                cols[c].add(d)
                boxes[boxIndex].add(d)
        return True