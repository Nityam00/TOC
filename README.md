# TOC
# Project Details
  The task is to implement a pushdown automata in java to check strings of the form wwR 
  
Input Details:

  Any array of characters
  
Output Details:

  Whether the given string is acceptable or not
  
  ---
  
# Algorithm:
>Step 1) Start by opening any Java IDE

Step 2) Import the necessary packages

Step 3) Create a variable named top which is used to keep a track of the top of the stack

Step 4) Ask the user for input and store the String in a variable

Step 5) Convert the given String to an integer format by subtracting it with the character '0'

Step 6) Push the above integer in the stack

Step 7) Pass the stack along with the to another function to operate on it

Step 8) In this function run a loop from with j=1 until it reaches the length of the string

Step-9) Compare the top of the stack with the character at the given position

Step-10) If the comparison is false push the character into the stack and follow step 11

Step-11) Increment the value of j and continue the loop

Step-12) If the comaprison is true then move to another function

Step 13) In this second function run a loop j=i, where j runs from the current position of the string to the length of the string

Step-14) Keep on comapring the elements on the top of the stack with the elements to be read yet

//  Step 13 is an assumption step in which we assume that while scanning we have reached the middle of the string. 

Step 15) If the comparison holds true, keep popping the elements and continue step 13 otherwise return a value of 0

Step 16) If the top of the stack has exhausted and the string is yet to be read or the there are some elements in the stack yet
to be read return 0

Step 17) Display that the given NPDA has a form wwR and terminate the previous function then

Step 18) After the termination of the loop in the first function display that the function is not of the form wwR(or use a flag
for the same)

Step 19) End


