public class Main {
    public static void main(String[] args) {
        Candidate candidate1 = new Candidate(101, "Aibol Nurmakhanov", "aiboltop@example.com");
        Candidate candidate2 = new Candidate(102, "Akzhan Beysenbay", "akana@example.com");

        Exam javaExam = new Exam(1, "Java Basics Exam", candidate1);

        Question q1 = new Question(1, "What is the size of int in Java?", new String[]{"8 bits", "16 bits", "32 bits", "64 bits"}, 2);
        Question q2 = new Question(2, "Which keyword is used for inheritance in Java?", new String[]{"extends", "inherits", "implements", "super"}, 0);
        Question q3 = new Question(3, "What is the default value of boolean in Java?", new String[]{"true", "false", "0", "null"}, 1);

        javaExam.addQuestion(q1);
        javaExam.addQuestion(q2);
        javaExam.addQuestion(q3);

        javaExam.displayExamInfo();
        System.out.println();
        javaExam.startExam();

        for (Question q : javaExam.getQuestions()) {
            q.displayQuestion();
            System.out.println();
        }

        System.out.println("=== Simulating candidate answers ===");
        int[] simulatedAnswers = {2, 0, 1};

        for (int i = 0; i < javaExam.getQuestions().size(); i++) {
            Question q = javaExam.getQuestions().get(i);
            if (q.checkAnswer(simulatedAnswers[i])) {
                candidate1.incrementScore();
                System.out.println("Question " + (i + 1) + ": Correct!");
            } else {
                System.out.println("Question " + (i + 1) + ": Wrong!");
            }
        }

        System.out.println("\n=== Exam Results ===");
        candidate1.displayInfo();
        System.out.println("\n=== Comparing Candidates ===");
        System.out.println("Candidate 1: " + candidate1.getName() + ", Score: " + candidate1.getScore());
        System.out.println("Candidate 2: " + candidate2.getName() + ", Score: " + candidate2.getScore());

        if (candidate1.getScore() > candidate2.getScore()) {
            System.out.println(candidate1.getName() + " has a higher score.");
        } else if (candidate1.getScore() < candidate2.getScore()) {
            System.out.println(candidate2.getName() + " has a higher score.");
        } else {
            System.out.println("Both candidates have the same score.");
        }
    }
}
