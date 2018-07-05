Name of the project being reviewed: mt-tic-tac-toe
Gitub URL of the project being reviewed: https://github.com/johns612/mt-tic-tac-toe.git
Name of Reviewer: Andrew Thomas
Name of Programmer: Shevis Johnson
Date of Review: 10/26/2016

On a scale of 1 to 5, I give this code a rating of __5__ based on the following criteria:

1  The program has syntax errors and does not compile
2  The program compiles successfully but generates runtime errors
3  The program compiles and runs but does not perform correctly and does not accomplish everything stated in the README.md file
4  The program compiles and accomplishes everything stated in the README.md file but is insufficiently documented
5  The program accomplishes everything stated in the README.md and is well written and well documented

Criteria from ReadMe:
YES * This game uses TCP to pass information between server and client.
YES * First player to connect goes first
YES * pass moves as strings that represent the current board state 	

YES * MTClient.java handles keyborad input from the user.
YES * ClientListener.java recieves responses from the server and displays them
YES * MTServer.java listens for client connections and creates a ClientHandler for each new client
YES * ClientHandler.java recieves messages from a client and relays it to the other clients.

The code does all the followed criteria that was created and is well documented/written.

Suggestions for improving the code:
The data structures used here are done very well.. The only thing that I could possibly recommend is to implement better prompting as to who is going when.
You could also make little additions in small places that could randomize who goes first or store the results from each game that's played into a file.
No major fix recommendations though.
