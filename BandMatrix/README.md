
# Band Matrix

This program takes two integer command-line arguments *n* and *width*, and prints out a band matrix with width *width*. Each element whose distance from the primary diagonal is greater than the width of the matrix is represented as a zero; an asterisk prints for each element that is not. With the knowledge of these restrictions, the user can manipulate the pattern of the matrix.  
For example, if the user entered "5, 2" into the console, the output would print as following:  
\* \* \* 0 0  
\* \* \* \* 0  
\* \* \* \* \*  
0 \* \* \* \*  
0 0 \* \* \* 