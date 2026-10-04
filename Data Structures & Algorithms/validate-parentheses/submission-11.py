class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        matching={')':'(',']':'[','}':'{'}
        for c in s:
            if c in '([{':
                stack.append(c)
            else:
                if not stack:
                    return False
                top=stack.pop()
                if top != matching[c]:
                    return False
        return len(stack)==0

        