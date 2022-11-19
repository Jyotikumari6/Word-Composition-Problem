# Word-Composition-Problem in java
# Steps to execute the code
1) First, Download the impledgetechnoprob.java file, Input_01 and Input_02 text file.  (or the zip file{consisting of all files})

2) (Extract in case of zip file)

3) Then change the directory of Input_01 and Input_02 text file in impledgetechnoprob.java file and run in any Java IDE or in command prompt using below commands:

    * javac  impledgetechnoprob.java 

    * java  impledgetechnoprob

# Overview
* Finding Compound word is a Word Composition problem which is very much like word breaking problem. These tyes of problems are solved using various approaches like OP, backtracking and Trie Data Structure. 

* I have used the Trie Data Structure because as per the instruction given in the question was that the time efficiency matters and as it is faster searching technique, I basically used this data structure to implement the logic and find the longest and second longest word.

# Approach
* The thing that suggested to use this structure was the problem that consist the traversing the string character by character. All the valid words should be tracked    which can be easily done using this data structure.

* A Trie is an advanced data structure that is sometimes also known as prefix tree or digital tree. It is a tree that stores the data in an ordered and efficient way. We generally use trie's to store strings.

* First,  path of the text files are defined
* Second, Initialization of tree node is done.
* Then, adding word and searching word by traversing each characters in String is performed.
* The traversing is done until a complete word is found from the tree.
* Then, it recursivley checks whether the remaining part is also a word OR a compound word.
