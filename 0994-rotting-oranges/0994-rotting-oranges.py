class Solution:
    def orangesRotting(self, grid):
        q = deque()
        m = len(grid)
        n = len(grid[0])
        fresh = 0
        for i in range(m):
            for j in range(n):

                if grid[i][j] == 2:
                    q.append([i, j, 0])

                elif grid[i][j] == 1:
                    fresh += 1
        if fresh == 0:
            return 0
        directions = [(0,1), (1,0), (-1,0), (0,-1)]
        res = 0
        while q:
            r, c, cost = q.popleft()
            res = max(res, cost)
            for dr, dc in directions:
                x = r + dr
                y = c + dc
                if 0 <= x < m and 0 <= y < n and grid[x][y] == 1:
                    grid[x][y] = 2
                    fresh -= 1
                    q.append([x, y, cost + 1])
        return res if fresh == 0 else -1