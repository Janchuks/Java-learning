import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dati = new Scanner(System.in);
        int score = 0;
        String answer;

        System.out.println("Sveiks lietotāj!");
        System.out.println("Šodien pārbaudīsim tavas vēstures un ģeogrāfijas zināšanas testā");
        System.out.println("-Eiropas pilsētas-");
        System.out.println("Atbildēsi uz 10 jautājumiem par un ap Eiropas savienību");
        System.out.println("*".repeat(6));

        score += askQuestion(dati, "Cik eiropas savienībā ir dalībvalstu?",
                "A- 20", "B- 29", "C- 27", "C");

        score += askQuestion(dati, "Kurā Beļģijas pilsētā atrodas Eiropas Savienības galvenā mītne?",
                "A- Briselē", "B- Andenē", "C- Borēnā", "A");

        score += askQuestion(dati, "Kurā gadā Latvija iestājās ES?",
                "A- 2007", "B- 2020", "C- 2004", "C");

        score += askQuestion(dati, "Kurā gadā Latvija atvadījās no naudas vienības - lats?",
                "A- 2004", "B- 2014", "C- 2016", "B");

        score += askQuestion(dati, "Kurā valstī cūku nedrīkst saukt par Napoleonu, jo tas var beigties ar cietumsodu?",
                "A- Vācija", "B- Francija", "C- Anglija", "B");

        System.out.println("ļoti labi! pusi esi atbildējis, apskatīsim tavus punktus");
        System.out.println("Jums ir " + score + " punkti no 5!");

        int percentage = score * 10;
        System.out.println("Tas ir " + percentage + "%");
        if (percentage < 50) {
            System.out.println("Tavs rezultāts ir zems, tev vēl jāmācās!");
        } else {
            System.out.println("Apsveicam, jūs zināt Eiropas pilsētas un vēsturi!");
        }

        dati.close();
    }

    public static int askQuestion(Scanner dati, String question, String optionA, String optionB, String optionC, String correctAnswer) {
        String answer;
        do {
            System.out.println(question);
            System.out.println("Atbilžu varianti");
            System.out.println(optionA);
            System.out.println(optionB);
            System.out.println(optionC);
            answer = dati.nextLine().toUpperCase();
        } while (!answer.equals("A") && !answer.equals("B") && !answer.equals("C"));

        if (answer.equals(correctAnswer)) {
            System.out.println("Jūsu atbilde ir pareiza");
            return 1;
        } else {
            System.out.println("Jūsu atbilde nav pareiza");
            return 0;
        }
    }
}
