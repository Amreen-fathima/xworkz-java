class AmazonPrime {

    public static void main(String[] args) {

        String kannadaMovies[] = {
            "KGF","Ugramm","Rama Rama Re","Godhi Banna","Dia",
            "Lucia","Ulidavaru","Tagaru","Kavaludaari","Bell Bottom",
            "Garuda Gamana","Gultoo","Hero","Operation Alamelamma",
            "Sarkari Hi Pra Shaale","777 Charlie","Avane Srimannarayana",
            "Kirik Party","Rajkumara","Chowka"
        };

        String hindiMovies[] = {
            "Shershaah","Jai Bhim","Drishyam","Badla","Article 15",
            "Raazi","Andhadhun","Kesari","Padman","Tanhaji",
            "Dangal","PK","3 Idiots","Queen","Barfi",
            "Gully Boy","Sanju","Chak De India","Stree","War"
        };

        String tamilMovies[] = {
            "Jai Bhim","Soorarai Pottru","Vikram Vedha","Kaithi","Asuran",
            "Master","Visaranai","Super Deluxe","Karnan","Sarpatta",
            "96","Vada Chennai","Pizza","Thani Oruvan","Mersal",
            "Bigil","Kaththi","Ghajini","Anniyan","Sivaji"
        };

        String englishMovies[] = {
            "The Tomorrow War","Without Remorse","Sound of Metal",
            "Manchester by the Sea","Borat","The Big Sick","Joker",
            "Interstellar","Inception","Tenet",
            "The Prestige","Dunkirk","Gladiator","Braveheart",
            "The Revenant","Titanic","Avatar","Skyfall","Gravity","Arrival"
        };

        String teluguMovies[] = {
            "Jersey","RRR","Pushpa","Magadheera","Eega",
            "Rangasthalam","Ala Vaikunta","Athadu","Pokiri","Baahubali",
            "Baahubali 2","Gabbar Singh","Khaidi","Sye","Arjun Reddy",
            "DJ","Sarileru Neekevvaru","Kushi","Vakeel Saab","Leader"
        };

        System.out.println("\nKannada Movies:");
        for (String movie : kannadaMovies) {
            System.out.println(movie);
        }

        System.out.println("\nHindi Movies:");
        for (String movie : hindiMovies) {
            System.out.println(movie);
        }

        System.out.println("\nTamil Movies:");
        for (String movie : tamilMovies) {
            System.out.println(movie);
        }

        System.out.println("\nEnglish Movies:");
        for (String movie : englishMovies) {
            System.out.println(movie);
        }

        System.out.println("\nTelugu Movies:");
        for (String movie : teluguMovies) {
            System.out.println(movie);
        }
    }
}
