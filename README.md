# dockerAssignment 

Web Service and Docker assignment

A RESTful web service was created and it runs in a docker container. There are 4 GET routes that will display information from a JSON object that holds information about a playlist (a collection of songs).

There is a GET route that will display all of the songs within the playlist along with the name of the albums they are in, and the artist of that song.
One of the GET routes will display all of the songs by the artist The Night Game in the album Dog Years.
Another GET route will display all of the songs by Dave Matthews Band no matter which album it is in.
And the 4th GET route will display all of the artists in the JSON object
There are buttons that bring you directly to each route which will display the infromation mentioned above.

Here is how to run the program:

Make sure to download Docker onto your device
In the terminal change to the directory the project is in (i.e. cd docker-assignment)
Run the following commands inside the terminal (replace imageName with whatever name you want to call the docker image) A. docker build -f Dockerfile -t imageName B. docker run -p 8085:8085 imageName
Go to the following in a web browser: localhost:8085
Click on one of the buttons to get information such as which songs are in the album Dog Years
