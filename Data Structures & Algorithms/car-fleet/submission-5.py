class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        cars=sorted(zip(position,speed),reverse=True)
        lastTime=0
        fleets=0
        for pos,spd in cars:
            time=(target-pos)/spd
            if time>lastTime:
                fleets +=1
                lastTime=time
        return fleets
