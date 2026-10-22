class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        adj = [[] for _ in range(numCourses)]
        for a,b in prerequisites:
            adj[b].append(a)

        state = [0] * numCourses

        for i in range(numCourses):
            if self.hasCycle(i, adj, state):
                return False
        return True


    def hasCycle(self, course: int, adj: List[List[int]], state: List[int]) -> bool:
            if state[course] == 1:
                return True
            if state[course] == 2:
                return False
            
            state[course] = 1
            for nxt in adj[course]:
                if self.hasCycle(nxt, adj, state):
                    return True
            state[course] = 2
            return False
        
