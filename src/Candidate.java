public class Candidate {
    private int id;
    private String name;
    private String email;
    private int score;

    public Candidate(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.score = 0;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public void incrementScore() {
        score++;
    }

    public void displayInfo() {
        System.out.println("Candidate ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Score: " + score);
    }
}
