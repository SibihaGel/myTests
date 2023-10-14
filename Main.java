package org.example;
/*
Given an m x n 2D binary map1 map2 which represents a map of '1's (land) and '0's (water),
 return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 You may assume all four edges of the grid are all surrounded by water.

 */

public class Main {
    public static void main(String[] args) {



        char[][] map2 = {
                {'1', '1', '1', '0', '0'},
                {'1', '0', '0', '1', '1'},
                {'0', '0', '0', '0', '0'},
                {'1', '0', '1', '1', '1'}
        };

        System.out.println(countOfIslands(map2));
    }

    public static int countOfIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    // found island
                    count++;
                    clearRestOfLand(grid, i, j);
                }
            }

        }
        return count;
    }

    private static void clearRestOfLand(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length ||  j >= grid[i].length || grid[i][j] == '0') {
            return;

        }


        grid[i][j] = '0'; // visited
        clearRestOfLand(grid, i+1, j);
        clearRestOfLand(grid, i-1, j);
        clearRestOfLand(grid, i, j+1);
        clearRestOfLand(grid, i, j-1);
    }

}
