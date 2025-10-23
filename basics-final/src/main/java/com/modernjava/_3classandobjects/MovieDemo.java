package com.modernjava._3classandobjects;

public class MovieDemo {
    public static void main(String[] args) {

        Movie movie1 = new Movie();
        movie1.title = "Harry Potter";
        movie1.duration = 50;
        movie1.genre = "Action";
        movie1.rating = 3.5;
        System.out.println("Movie: " + movie1.title + ", Duration: " + movie1.duration + " minutes, Genre: " + movie1.genre + ", Rating: " + movie1.rating + "/10.0");

        var movie2 = new Movie();
        movie2.title = "The Matrix";
        movie2.duration = 136;
        movie2.genre = "Sci-Fi";
        movie2.rating = 8.7;
        System.out.println("Movie: " + movie2.title + ", Duration: " + movie2.duration + " minutes, Genre: " + movie2.genre + ", Rating: " + movie2.rating + "/10.0");

        // Modifying Object State
        movie2.rating = 9.0;
        System.out.println("Movie: " + movie2.title + ", Duration: " + movie2.duration + " minutes, Genre: " + movie2.genre + ", Rating: " + movie2.rating + "/10.0");

        // Object Reference and Aliasing
        Movie alias = movie2;      // alias points to the SAME object as movie2
        alias.genre = "Sci-Fi/Action";
        System.out.println(movie2.genre);   // prints Sci-Fi/Action
        System.out.println("Movie: " + movie2.title + ", Duration: " + movie2.duration + " minutes, Genre: " + movie2.genre + ", Rating: " + movie2.rating + "/10.0");

        // Changing Object References
        Movie x = movie2;           // x → same object as movie2
        movie2 = new Movie();       // movie2 now points to a NEW object
        movie2.title = "Inception";
        System.out.println(x.title); // still "The Matrix"

        //Constructors
        var movie3 = new Movie();
        System.out.println("Movie: " + movie3.title + ", Duration: " + movie3.duration + " minutes, Genre: " + movie3.genre + ", Rating: " + movie3.rating + "/10.0");
        //movie3.title.toUpperCase();

        // New object using parameterized constructor
        Movie movie4 = new Movie("Avengers: Endgame", 181, "Action/Adventure", 8.4, 13, "Disney+");
        System.out.println("Movie: " + movie4.title + ", Duration: " + movie4.duration + " minutes, Genre: " + movie4.genre + ", Rating: " + movie4.rating + "/10.0");
        var duration  = movie4.formattedDuration();
        System.out.println("Formatted Duration: " + duration);

        // Demonstrating invalid state
        movie4.duration = -50;
        System.out.println("Movie: " + movie3.title + ", Duration: " + movie3.duration + " minutes, Genre: " + movie3.genre + ", Rating: " + movie3.rating + "/10.0");

        Movie m2 = new Movie("Harry Potter", -150, "Fantasy", 8.5, 0, "HBO Max"); // Negative duration replaced with 0
        m2.printMovie(m2);

        var rating = MovieUtils.minimumAgeToRating(m2.minimumAge);
        System.out.println("Film Rating: " + rating);

        var trimmedTitle  = Movie.trimTitle(movie4.title);
        System.out.println("trimmedTitle: " + trimmedTitle);

        // Math Operators
        var maxNumber = Math.max(1, 2);
        var intVal= Integer.valueOf(1);


        //Encapsulation :  Demonstrating invalid state
        movie4.duration = -50;
        System.out.println("Movie: " + movie3.title + ", Duration: " + movie3.duration + " minutes, Genre: " + movie3.genre + ", Rating: " + movie3.rating + "/10.0");




    }
}
