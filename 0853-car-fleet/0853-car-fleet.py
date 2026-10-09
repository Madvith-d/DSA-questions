class Solution:
    def carFleet(self, target: int, position: list[int], speed: list[int]) -> int:

        sorted_indices = sorted(range(len(position)) , key = lambda i : position[i])
        previous_time = 0
        fleet_count = 0
        for index in sorted_indices[:: -1]:
            current_time = (target - position[index]) / speed[index]
            if current_time > previous_time : 
                fleet_count = fleet_count + 1
                previous_time = current_time
        return fleet_count
        