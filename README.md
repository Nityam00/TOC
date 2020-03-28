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

>Step 2) Import the necessary packages

>Step 3) Create a variable named top which is used to keep a track of the top of the stack

>Step 4) Ask the user for input and store the String in a variable

>Step 5) Convert the given String to an integer format by subtracting it with the character '0'

>Step 6) Push the above integer in the stack

>Step 7) Pass the stack along with the to another function to operate on it

>>Step 8) In this function run a loop from with j=1 until it reaches the length of the string

>>Step-9) Compare the top of the stack with the character at the given position

>>Step-10) If the comparison is false push the character into the stack and follow step 11

>>Step-11) Increment the value of j and continue the loop

>>Step-12) If the comaprison is true then move to another function

>>>Step 13) In this second function run a loop j=i, where j runs from the current position of the string to the length of the string

>>>Step-14) Keep on comapring the elements on the top of the stack with the elements to be read yet This is an assumption step in which we assume that while scanning we have reached the middle of the string. 

>>>Step 15) If the comparison holds true, keep popping the elements and continue step 13 otherwise return a value of 0

>>>Step 16) If the top of the stack has exhausted and the string is yet to be read or the there are some elements in the stack yet
to be read return 0

>>>Step 17) Display that the given NPDA has a form wwR and terminate the previous function then

>>Step 18) After the termination of the loop in the first function display that the function is not of the form wwR(or use a flag
for the same)

>Step 19) End

---
# Logic Used:
  1) Take string as input
  2) Push the first character of the String on the stack
  3) Traverse till the end of the string and keep checking if the top of the stack matches the character of the string being read
  4) This is done because in a String of form wwR , it is at the centre that the top of the stack will match the next character of the String 
  5) In an NPDA also we keep on checking at every point whether it matches or not( when it encounters consecutive characters)
  ### Logic Used to determine the location of the centre
  6) If it matches keep popping from the stack and compare it with the next character of the string. If the stack becomes empty and also the string reaches the last character while popping, it implies that we were at the centre of the string 
  7) If it does not reach the end of the String and the stack is empty, it implies that it was not the centre of the string.
  8) IN this way the location of the cdentre was determined
  ### Logic to determine whether palindrome or not:
  9) While popping in step 6, we can simulataneously comapare if the popped character matches the next character of the string. If not, either we have not reached the centre or it is not a palindrome.
  # Display the output:
  10) Display it is of the form wwR if all the above conditions are satisfied otherwise not
  
  
