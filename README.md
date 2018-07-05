# Multi-Threaded Tic Tac Toe (2-player)
This repo contains programs to run a 2-player tic-tac-toe game. It will contain a game server program as well as a game client program. The clients will be able to play eachother over the network through the server.

Git Primary Repo: https://github.com/shevisj/Networked-Tic-Tac-Toe.git

Team Member Roles:
* Shevis Johnson: develop entire program

Application Layer Protocol:
* This game uses TCP to pass information between server and client.
* First player to connect goes first
* pass moves as strings that represent the current board state 	

* MTClient.java handles keyborad input from the user.
* ClientListener.java recieves responses from the server and displays them
* MTServer.java listens for client connections and creates a ClientHandler for each new client
* ClientHandler.java recieves messages from a client and relays it to the other clients.
