public class Question {
    private int id;
    private String text;
    private String[] options;
    private int correctOptionIndex;

    public Question(int id, String text, String[] options, int correctOptionIndex) {
        this.id = id;
        this.text = text;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String[] getOptions() {
        return options;
    }
    public void setOptions(String[] options) {
        this.options = options;
    }
    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }
    public void setCorrectOptionIndex(int correctOptionIndex) {
        this.correctOptionIndex = correctOptionIndex;
    }

    public boolean checkAnswer(int userAnswer) {
        return userAnswer == correctOptionIndex;
    }

    public void displayQuestion() {
        System.out.println("Q" + id + ": " + text);
        for (int i = 0; i < options.length; i++) {
            System.out.println("  " + (i + 1) + ") " + options[i]);
        }
    }
}
