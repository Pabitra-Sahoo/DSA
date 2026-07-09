# Find All Occurrences of a Target Element

## Difficulty: Easy

## Platform: Manual

## Solved On
09 Jul 2026 at 11:15 pm

Given an array of integers and a target value, print all the indices where the target element occurs.

If the target appears multiple times, print all of its indices separated by spaces.

Input Format:
- The first line contains an integer N, the size of the array.
- The second line contains N space-separated integers.
- The third line contains the target element.

Output Format:
Print all indices where the target element is found.

Example 1:
Input:
5
10 20 30 20 40
20

Output:
1 3

Example 2:
Input:
6
5 7 5 8 5 9
5

Output:
0 2 4

## My Notes / Approach:
Approach:
1. Read the size of the array.
2. Store all elements in an ArrayList.
3. Read the target value.
4. Traverse the list from index 0 to N-1.
5. Whenever the current element equals the target, print its index.

Time Complexity:
O(n)

Space Complexity:
O(n)

Concepts Used:
- ArrayList
- Linear Search
- Traversal

Suitable For:
Campus Placement Preparation (TCS NQT, Infosys, Capgemini, Wipro)