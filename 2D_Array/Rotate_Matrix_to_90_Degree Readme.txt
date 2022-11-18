Program - Matrix Rotation
Language Used - Java
Program Theory
First create a java program to rotate a matrix by 90 degree in a clockwise rotation.
The clockwise rotation is also known as right rotation.

The rotation of a matrix involves two steps:

First, find the transpose of the given matrix.
Then,Swap the elements of the first column with the last column (if the matrix is of 3*3). The second column remains the same.

Constraints:
Matrix must have the same number of rows and columns.
Do not use any extra memory in proportion to the input size.
That is , space complexity should be 1.


Sample Input
1  2  3  4
5  6  7  8
9  10 11 12
13 14 15 16

Sample Output
13  9  5  1
14  10  6  2
15  11  7  3
16  12  8  4
