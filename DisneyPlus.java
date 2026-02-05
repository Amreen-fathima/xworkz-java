class DisneyPlus {
    public static void main(String[] args) {

        String englishMovies[] = {
            "Avengers","Avengers Age of Ultron","Infinity War","Endgame",
            "Iron Man","Iron Man 2","Iron Man 3","Thor","Thor Ragnarok",
            "Captain America","Civil War","Black Panther","Doctor Strange",
            "Ant-Man","Guardians","Spider-Man Homecoming","No Way Home",
            "Loki","Eternals","Shang-Chi"
        };

        String hindiMovies[] = {
            "Laxmii","Super 30","Tanhaji","Chhichhore","Bhuj",
            "Baaghi","Baaghi 2","MS Dhoni","Housefull","Total Dhamaal",
            "Lootcase","Baby","Badlapur","Stree","Kesari",
            "Raazi","Drishyam","Andhadhun","War","Padmaavat"
        };

        String tamilMovies[] = {
            "Vikram","Kaithi","Master","Bigil","Mersal",
            "Asuran","Jai Bhim","Karnan","Soorarai Pottru",
            "Viswasam","Sivaji","Anniyan","Ghajini","Thuppakki",
            "Kaththi","Pettta","Darbar","Vada Chennai","96","Pizza"
        };

        String teluguMovies[] = {
            "RRR","Baahubali","Baahubali 2","Pushpa","Magadheera",
            "Eega","Athadu","Pokiri","Khaidi","Leader",
            "Sye","DJ","Gabbar Singh","Jersey","Arjun Reddy",
            "Ala Vaikunta","Sarileru Neekevvaru","Kushi","Vakeel Saab","Tagore"
        };

        String malayalamMovies[] = {
            "Drishyam","Lucifer","Premam","Bangalore Days","Charlie",
            "Joji","Uyare","Virus","Minnal Murali","Kumbalangi Nights",
            "Ayyappanum","Kurup","Cold Case","Helen","Android Kunjappan",
            "Take Off","Sudani","Maheshinte","Hridayam","Jana Gana Mana"
        };

        // Print movies using for-each loops
        System.out.println("\nEnglish Movies:");
        for (String movie : englishMovies) {
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

        System.out.println("\nTelugu Movies:");
        for (String movie : teluguMovies) {
            System.out.println(movie);
        }

        System.out.println("\nMalayalam Movies:");
        for (String movie : malayalamMovies) {
            System.out.println(movie);
        }
    }
}
