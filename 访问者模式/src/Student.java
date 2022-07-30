public class Student extends Preson{
    private int paperAmount;
    private double score;

    public int getPaperAmount() {
        return paperAmount;
    }

    public void setPaperAmount(int paperAmount) {
        this.paperAmount = paperAmount;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public void accept(AwardCheck awardCheck) {
        awardCheck.visit(this);

    }
}
