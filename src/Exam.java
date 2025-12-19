import java.util.ArrayList;

public class Exam {
    private int examId;
    private String examName;
    private ArrayList<Question> questions;
    private Candidate candidate;
    private int totalQuestions;

    public Exam(int examId, String examName, Candidate candidate) {
        this.examId = examId;
        this.examName = examName;
        this.candidate = candidate;
        this.questions = new ArrayList<>();
        this.totalQuestions = 0;
    }

    public int getExamId() {
        return examId;
    }
    public void setExamId(int examId) {
        this.examId = examId;
    }
    public String getExamName() {
        return examName;
    }
    public void setExamName(String examName) {
        this.examName = examName;
    }
    public ArrayList<Question> getQuestions() {
        return questions;
    }
    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
    public Candidate getCandidate() {
        return candidate;
    }
    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }
    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void addQuestion(Question question) {
        questions.add(question);
        totalQuestions++;
    }

    public void startExam() {
        System.out.println("=== Starting Exam: " + examName + " ===");
        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Total questions: " + totalQuestions + "\n");
    }

    public void displayExamInfo() {
        System.out.println("Exam ID: " + examId);
        System.out.println("Exam Name: " + examName);
        System.out.println("Total Questions: " + totalQuestions);
        System.out.println("Candidate: " + candidate.getName());
    }
}
