import java.util.ArrayList;
import java.util.Arrays;

public class GradeBook2
{
    private double[] scores;
    private int scoresSize;

    /**
     Constructs a gradebook with no scores and a given capacity.
     @capacity the maximum number of scores in this gradebook
     */
    public GradeBook2(int capacity)
    {
        scores = new double[capacity];
        scoresSize = 0;
    }

    /**
     Adds a score to this gradebook.
     @param score the score to add
     @return true if the score was added, false if the gradebook is full
     */
    public boolean addScore(double score)
    {
        if (scoresSize < scores.length)
        {
            scores[scoresSize] = score;
            scoresSize++;
            return true;
        }
        else
            return false;
    }

    /**
     Computes the sum of the scores in this gradebook.
     @return the sum of the scores
     */
    public double sum()
    {
        double total = 0;
        for (int i = 0; i < scoresSize; i++)
        {
            total = total + scores[i];
        }
        return total;
    }

    public int getScoresSize(){
        return scoresSize;
    }

    /**
     Gets the minimum score in this gradebook.
     @return the minimum score, or 0 if there are no scores.
     */
    public double minimum()
    {
        if(scoresSize == 0){
            System.out.println("empty");
            return 0;
        }
        double smallest = scores[0];

        // STUDENT TODO: Implement your logic here
        for(int i = 1; i < scores.length; i++){
            if(scores[i] < smallest){
                smallest = scores[i];
            }
        }

        return smallest;
    }



    /**
     Gets the final score for this gradebook.
     @return the sum of the scores, with the lowest score dropped if
     there are at least two scores, or 0 if there are no scores.
     */
    public double finalScore()
    {
        if (scoresSize == 0)
            return 0;
        else if (scoresSize == 1)
            return scores[0];
        else
            return sum() - minimum();
    }

    @Override
    public String toString() {
        String s = "";

        for(int i = 0; i < scoresSize; i++){
            s += scores[i] + " ";
        }
        return s;
    }
}