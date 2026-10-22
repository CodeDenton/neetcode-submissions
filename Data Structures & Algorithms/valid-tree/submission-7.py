class Solution:
    def validTree(self, n: int, edges: List[List[int]]) -> bool:
        if len(edges) != n - 1:
            return False
        
        adj = [ [] for _ in range(n) ]
        for a,b in edges:
            adj[a].append(b)
            adj[b].append(a)
        
        visited = [False] * n

        self.dfs(0, adj, visited)

        for v in visited:
            if not v:
                return False
        return True
    
    def dfs(self, n: int, adj: List[List[int]], visited: List[bool]) -> None:
        visited[n] = True
        for next in adj[n]:
            if not visited[next]:
                self.dfs(next, adj, visited)