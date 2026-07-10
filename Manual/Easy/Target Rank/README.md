# Target Rank

## Difficulty: Easy

## Platform: Manual

## Solved On
10 Jul 2026 at 11:41 pm

Given an array of N integers and a target integer X, find all the indices where X occurs in the array. The indices should be printed in increasing order using 0-based indexing.

If the target appears multiple times, print all its indices separated by spaces. If the target is not present in the array, print -1.

Input Format
The first line contains an integer N, representing the number of elements in the array.
The second line contains N space-separated integers.
The third line contains an integer X, representing the target element.
Output Format
Print all the indices where X is present in the array, separated by spaces.
If X does not exist in the array, print -1.
Constraints
1 ≤ N ≤ 10^5
-10^9 ≤ arr[i], X ≤ 10^9
Example 1

Input

5
10 20 30 20 40
20

Output

1 3

Explanation

The target value 20 appears at indices 1 and 3.

Example 2

Input

6
5 7 5 9 5 1
5

Output

0 2 4

Explanation

The target value 5 occurs at indices 0, 2, and 4.

Example 3

Input

4
2 4 6 8
5

Output

-1

Explanation

The target value 5 is not present in the array.

## My Notes / Approach:
Approach:
1. Read the number of elements.
2. Store all elements in an ArrayList.
3. Read the target value.
4. Traverse the list from index 0 to n-1.
5. Whenever the current element matches the target, print its index.

Time Complexity:
O(n), where n is the number of elements.

Space Complexity:
O(n), due to storing the input elements in the ArrayList.give in a copy pastable format
