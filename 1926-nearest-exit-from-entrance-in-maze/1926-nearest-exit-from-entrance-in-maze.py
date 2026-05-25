class Solution:
    def nearestExit(self, maze: List[List[str]], entrance: List[int]) -> int:        
        m = len(maze)
        n = len(maze[0])
        queue = deque()
        queue.append((entrance[0], entrance[1], 0))
        maze[entrance[0]][entrance[1]] = '+'
        directions = [(1,0), (-1,0), (0,1), (0,-1)]
        while queue:
            r, c, dist = queue.popleft()
            for dr, dc in directions:
                nr = r + dr
                nc = c + dc
                if 0 <= nr < m and 0 <= nc < n and maze[nr][nc] == ".":
                    if nr == 0 or nr == m-1 or nc == 0 or nc == n-1:
                        return dist + 1
                    maze[nr][nc] = '+'
                    queue.append((nr, nc, dist + 1))
        return -1