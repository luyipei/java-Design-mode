public class Teacher extends Preson{
    private int paperAmount;
    private double feedbackScore;

    public int getPaperAmount() {
        return paperAmount;
    }

    public void setPaperAmount(int paperAmount) {
        this.paperAmount = paperAmount;
    }

    public double getFeedbackScore() {
        return feedbackScore;
    }

    public void setFeedbackScore(double feedbackScore) {
        this.feedbackScore = feedbackScore;
    }

    @Override
    public void accept(AwardCheck awardCheck) {
        awardCheck.visit(this);

    }
}
