package hitwh;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class L2022211810_8_Test
    extends TestCase
{
    public void testNumIslands_EmptyGrid() {
        char[][] grid = {};
        Solution8 solution = new Solution8();
        assertEquals(0, solution.numIslands(grid));
    }

    public void testNumIslands_SingleWaterCell() {
        char[][] grid = {
                {'0'}
        };
        Solution8 solution = new Solution8();
        assertEquals(0, solution.numIslands(grid));
    }


    public void testNumIslands_SingleIsland() {
        char[][] grid = {
                {'1', '1', '1'},
                {'1', '0', '1'},
                {'1', '1', '1'}
        };
        Solution8 solution = new Solution8();
        assertEquals(1, solution.numIslands(grid));
    }


    public void testNumIslands_MultipleIslands() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        Solution8 solution = new Solution8();
        assertEquals(3, solution.numIslands(grid));
    }


    public void testNumIslands_AllLand() {
        char[][] grid = {
                {'1', '1', '1'},
                {'1', '1', '1'},
                {'1', '1', '1'}
        };
        Solution8 solution = new Solution8();
        assertEquals(1, solution.numIslands(grid));
    }


    public void testNumIslands_NoIslands() {
        char[][] grid = {
                {'0', '0', '0'},
                {'0', '0', '0'},
                {'0', '0', '0'}
        };
        Solution8 solution = new Solution8();
        assertEquals(0, solution.numIslands(grid));
    }


    public void testNumIslands_LargeGrid() {
        char[][] grid = new char[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                grid[i][j] = (i % 2 == 0 && j % 2 == 0) ? '1' : '0'; // 创建一个棋盘模式的网格
            }
        }
        Solution8 solution = new Solution8();
        assertEquals(2500, solution.numIslands(grid)); // 100x100的网格中，每4个格子形成一个岛屿，共有25个岛屿
    }
}
