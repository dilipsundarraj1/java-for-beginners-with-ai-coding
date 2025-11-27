package com.modernjava._3classandobjects;

public class MovieDemo {
    static void main(String[] args) {

//        Movie movie1 = new Movie();
//        movie1.title = "Harry Potter";
//        movie1.duration = 50;
//        movie1.genre = "Action";
//        movie1.rating = 3.5;
//        System.out.println("Movie: " + movie1.title +
//                ", Duration: " + movie1.duration +
//                " minutes, Genre: " + movie1.genre +
//                ", Rating: " + movie1.rating + "/10.0");
//
//        System.out.println("movie1 : " + movie1);
//
//        Movie movie2 = new Movie();
//        movie2.title = "Inception";
//        movie2.duration = 148;
//        movie2.genre = "Sci-Fi";
//        movie2.rating = 8.8;
//        System.out.println("Movie: " + movie2.title +
//                ", Duration: " + movie2.duration +
//                " minutes, Genre: " + movie2.genre +
//                ", Rating: " + movie2.rating + "/10.0");
//
//        System.out.println("movie2 : " + movie2);
//
//        var movie3 = new Movie();
//        movie3.title = "Inception";
//        movie3.duration = 148;
//        movie3.genre = "Sci-Fi";
//        movie3.rating = 8.8;
//        System.out.println("Movie: " + movie3.title +
//                ", Duration: " + movie3.duration +
//                " minutes, Genre: " + movie3.genre +
//                ", Rating: " + movie3.rating + "/10.0");
//
//        // Modifying Object State
//        movie3.rating = 9.0;
//        System.out.println("After Changing Movie: " + movie3.title +
//                ", Duration: " + movie3.duration +
//                " minutes, Genre: " + movie3.genre +
//                ", Rating: " + movie3.rating + "/10.0");
//
//        // Object Reference and Aliasing
//        Movie alias = movie3;      // alias points to the SAME object as movie3
//        alias.genre = "Sci-Fi/Action";
//        System.out.println("Object Reference : " + movie3.genre);   // prints Sci-Fi/Action
//        System.out.println("Object Reference Changing Movie: " + movie3.title +
//                ", Duration: " + movie3.duration +
//                " minutes, Genre: " + movie3.genre +
//                ", Rating: " + movie3.rating + "/10.0");
//
//        // Changing Object References
//        Movie x = movie3;           // x → same object as movie3
//        movie3 = new Movie();       // movie3 now points to a NEW object
//        movie3.title = "The Matrix";
//        System.out.println("Changing Object References: " + x.title); // still "Inception
//        System.out.println("Changing Object References movie3: " + movie3.title); // still "Inception
//        System.out.println("Object Reference Changing Movie: " + movie3.title +
//                ", Duration: " + movie3.duration +
//                " minutes, Genre: " + movie3.genre +
//                ", Rating: " + movie3.rating + "/10.0");

        var movie4 = new Movie();
        movie4.printMovie();
        System.out.println("Formatted Duration: " + movie4.formattedDuration(movie4.duration));

        var movie5 = new Movie("Avengers: Endgame",
                181, "Action/Adventure", 8.4);
        movie5.printMovie();
        System.out.println("Formatted Duration: " + movie5.formattedDuration(movie5.duration));

        var movie6 = new Movie("Avengers: Endgame",
                -181, "Action/Adventure", 8.4);
        System.out.println("Parameterized Constructor : ");
        movie6.printMovie();
        movie6.printMovie(movie6);
        System.out.println("Formatted Duration: " + movie6.formattedDuration(movie6.duration));
        System.out.println("Overloaded Formatted Duration movie6: " + movie6.formattedDuration());


        var movie7 = new Movie("",
                -181, "Action/Adventure", 18.4);
        System.out.println("Parameterized Constructor movie7 : ");
        movie7.printMovie();
        System.out.println("Formatted Duration: " + movie7.formattedDuration(movie7.duration));
        System.out.println("Overloaded Formatted Duration movie7: " + movie7.formattedDuration());
        System.out.println("Overloaded Formatted Duration movie7: " + movie7.formattedDuration(98090));


        movie7.duration = -181;

        System.out.println("Parameterized Constructor movie7 : ");
        movie7.printMovie();
        System.out.println("Formatted Duration: " + movie7.formattedDuration(movie7.duration));
    }
}
