# Project 2: Guess The Movie

The rules are simple, the computer randomly picks a movie title, and shows you how many letters it's made up of. The goal is to try to figure out the movie by guessing one letter at a time.

If a letter is indeed in the title the computer will reveal its correct position in the word, if not, you lose a point. If you lose 10 points, game over!

BUT the more correct letters you guess the more obvious the movie becomes and at a certain point you should be able to figure it out.

The program will randomly pick a movie title from a text file that contains a large list of movies.
Once the computer picks a random title, it will display underscores "_" in place of the real letters, thereby only giving away the number of letters in the movie title.
![screen shot](https://github.com/ezechidc/UdacityJavaOOP/blob/master/GuessMovieGame/images/screen-shot-2017-07-11-at-11.26.18-pm.png)

Then it will wait for the player to enter their first letter guess.

If the letter was indeed in the word, the underscores "_" that match that letter will be replaced with the correct letter revealing how many letters have matched their guess and where they are.

![screen shot](https://github.com/ezechidc/UdacityJavaOOP/blob/master/GuessMovieGame/images/screen-shot-2017-07-11-at-11.26.29-pm.png)

If their guess isn't in the movie title, then the output will display the same output as the previous step as well as any letters that have been previously guessed wrong.

![screen shot](https://github.com/ezechidc/UdacityJavaOOP/blob/master/GuessMovieGame/images/screen-shot-2017-07-11-at-11.26.38-pm.png)

Eventually, if the player manages to guess all the letters in the movie title correctly before they lost 10 points, they win else they loose.

![screen shot](https://github.com/ezechidc/UdacityJavaOOP/blob/master/GuessMovieGame/images/screen-shot-2017-07-11-at-11.27.11-pm.png)
