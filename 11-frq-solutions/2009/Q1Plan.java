/**
Have a random number generator from 1-6
A run Occurs when 2 or more consecutive tosses
of the cube produce the same value

A)
int[] GetCubeTosses(NumberCube cube, int numTosses)
cube tosses into array
numtosses > 0
return array

B)
getLongestRun(int[] arr, cubetosses)
int[] array;
int run = 0
int maxnum = 0
while() (or for loop arr.length)
  if compare arr[i] with arr[i+1]
    add to array[run] and run++
  if arr[i] > maxnum
  maxnum = arr[i]
    if run == 0
      return -1
    else
      return array
*/
