# Rank Elements in an Array

## Difficulty: Easy

## Platform: Manual

## Solved On
09 Jul 2026 at 10:32 pm

Given an array of integers, assign a rank to each element based on its value.

The smallest unique element should have rank 1, the second smallest unique element should have rank 2, and so on.

If duplicate values exist, they must receive the same rank.

Print the rank of each element in the order they appear in the original array.

Example:
Input:
100 2 70 2 5

Output:
4 1 3 1 2

Explanation:
Sorted unique elements: [2, 5, 70, 100]

2   -> Rank 1
5   -> Rank 2
70  -> Rank 3
100 -> Rank 4

Original array:
100 2 70 2 5

Ranks:
4 1 3 1 2

## My Notes / Approach:
Approach:
1. Copy the original array into a temporary array.
2. Sort the temporary array.
3. Remove duplicate elements.
4. Store each unique element and its rank in a HashMap.
5. Traverse the original array and print the corresponding rank from the HashMap.

Time Complexity:
O(n log n)

Space Complexity:
O(n)

Tags:
#Array #Sorting #HashMap #Ranking #NQT2027 #TCSNQT #Java #Easy