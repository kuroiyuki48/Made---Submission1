package com.example.myapplication;

import java.util.ArrayList;

public class MovieData {
    public static String[][] data = new String[][] {
            {
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/9QusGjxcYvfPD1THg6oW3RLeNn7.jpg",
                    "Aquaman (2018)",
                    "December 21, 2018",
                    "68% of 100%",
                    "Action, Adventure, Fantasy",
                    "Once home to the most advanced civilization on Earth, Atlantis is now an " +
                            "underwater kingdom ruled by the power-hungry King Orm. With a vast " +
                            "army at his disposal, Orm plans to conquer the remaining oceanic people " +
                            "and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, " +
                            "half-Atlantean brother and true heir to the throne.",
                    "https://image.tmdb.org/t/p/w220_and_h330_face/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg",
                    "https://youtu.be/WDkg3h8PCVU"
            },
            {
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/bOGkgRGdhrBYJSLpXaxhXVstddV.jpg",
                    "Avengers: Infinity War (2018)",
                    "April 27, 2018",
                    "83% of 100%",
                    "Action, Adventure, Fantasy",
                    "As the Avengers and their allies have continued to protect the world from threats too large " +
                            "for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. " +
                            "A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of " +
                            "unimaginable power, and use them to inflict his twisted will on all of reality. Everything the " +
                            "Avengers have fought for has led up to this moment - the fate of Earth and existence itself has " +
                            "never been more uncertain.",
                    "https://image.tmdb.org/t/p/w220_and_h330_face/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg",
                    "https://youtu.be/sAOzrChqmd0"
            },
            {
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/xcaSYLBhmDzJ6P14bcKe0KTh3QV.jpg",
                    "Bohemian Rhapsody (2018)",
                    "November 2, 2018",
                    "81% of 100%",
                    "Drama, Music",
                    "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon " +
                            "take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs " +
                            "become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, " +
                            "Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success " +
                            "and excess.",
                    "https://image.tmdb.org/t/p/w220_and_h330_face/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg",
                    "https://youtu.be/HlRd9Zy25zo"
            },
            {
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/wtZj5nn6hVwgakPdg6y6gm3eFXU.jpg",
                    "Bumblebee (2018)",
                    "December 21, 2018",
                    "65% of 100%",
                    "Action, Adventure, Sci-fi",
                    "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. " +
                            "Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, " +
                            "battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",
                    "https://image.tmdb.org/t/p/w220_and_h330_face/fw02ONlDhrYjTSZV8XO6hhU3ds3.jpg",
                    "https://youtu.be/fAIX12F6958"
            },
            {
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/lFwykSz3Ykj1Q3JXJURnGUTNf1o.jpg",
                    "How to Train Your Dragon: The Hidden World (2019)",
                    "February 22, 2019",
                    "76% of 100%",
                    "Animation, Family, Adventure",
                    "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, " +
                            "elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief " +
                            "is tested, both dragon and rider must make impossible decisions to save their kind.",
                    "https://image.tmdb.org/t/p/w220_and_h330_face/xvx4Yhf0DVH8G4LzNISpMfFBDy2.jpg",
                    "https://youtu.be/qNGLuCijKZ0"
            },
            {
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/rL1ITQuX0lmSNPu52pRRHUyim5N.jpg",
                    "Glass (2019)",
                    "January 18, 2019",
                    "65% of 100%",
                    "Thriller, Drama, Sci-fi",
                    "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities " +
                            "to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, " +
                            "the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                    "https://image.tmdb.org/t/p/w220_and_h330_face/svIDTNUoajS8dLEo7EosxvyAsgJ.jpg",
                    "https://youtu.be/95ghQs5AmNk"
            },
            {
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/cwiJQXezWz876K3jS57Sq56RYCZ.jpg",
                    "Mary Poppins Returns (2018)",
                    "December 19, 2018",
                    "66% of 100%",
                    "Fantasy, Family, Comedy",
                    "In Depression-era London, a now-grown Jane and Michael Banks, along with Michael's three children, " +
                            "are visited by the enigmatic Mary Poppins following a personal loss. Through her unique magical " +
                            "skills, and with the aid of her friend Jack, she helps the family rediscover the joy and wonder " +
                            "missing in their lives.",
                    "https://image.tmdb.org/t/p/w220_and_h330_face/uTVGku4LibMGyKgQvjBtv3OYfAX.jpg",
                    "https://youtu.be/PzcaR1N0pTI"
            },
            {
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/jnOuttTfG9KKpmOZtprC4pA1AlZ.jpg",
                    "Mortal Engines (2018)",
                    "December 14, 2018",
                    "60% of 100%",
                    "Adventure, Fantasy",
                    "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other " +
                            "in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, " +
                            "Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will " +
                            "change the course of his life forever.",
                    "https://image.tmdb.org/t/p/w220_and_h330_face/iteUvQKCW0EqNQrIVzZGJntYq9s.jpg",
                    "https://youtu.be/IRsFc2gguEg"
            },
            {
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/axjFiijtxdfK3CD9dMwrdgLwblD.jpg",
                    "Robin Hood (2018)",
                    "November 21, 2018",
                    "58% of 100%",
                    "Adventure, Action, Thriller",
                    "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                    "https://image.tmdb.org/t/p/w220_and_h330_face/AiRfixFcfTkNbn2A73qVJPlpkUo.jpg",
                    "https://youtu.be/tJfDBSWYqU8"
            },
            {
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/uUiId6cG32JSRI6RyBQSvQtLjz2.jpg",
                    "Spider-Man: Into the Spider-Verse (2018)",
                    "December 14, 2018",
                    "84% of 100%",
                    "Action, Adventure, Animation, Sci-fi, Comedy",
                    "Miles Morales is juggling his life between being a high school student and being a spider-man. " +
                            "When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are " +
                            "transported to this dimension.",
                    "https://image.tmdb.org/t/p/w220_and_h330_face/iiZZdoQBEYBv6id8su7ImL0oCbD.jpg",
                    "https://youtu.be/ii3n7hYQOl4"
            }
    };

    public static ArrayList<Movie> getListData() {
        Movie movie = null;
        ArrayList<Movie> list = new ArrayList<>();
        for (String[] aData : data) {
            movie = new Movie();
            movie.setImage(aData[0]);
            movie.setName(aData[1]);
            movie.setRelease(aData[2]);
            movie.setScore(aData[3]);
            movie.setGenre(aData[4]);
            movie.setOverview(aData[5]);
            movie.setPhoto(aData[6]);
            movie.setTrailer(aData[7]);

            list.add(movie);
        }
        return list;
    }
}
