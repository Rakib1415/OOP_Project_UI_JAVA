
package salarycalculator;

public class ResultSheet {
    public double mathScore;
    public double physicScore;
    public double chemistryScore;
    
    public String getOverAllGradeLetter(){
        double avgScore = this.getAverageScore();
        return this.getGradeLetter(avgScore);
    }
    public double getAverageScore(){
        return (this.mathScore + this.chemistryScore + this.physicScore) / 3;
    }
    public String getMathGrade(){
        return this.getGradeLetter(this.mathScore);
    }
    public String getPhysicGrade(){
        return this.getGradeLetter(this.physicScore);
    }
    public String getChemistryGrade(){
        return this.getGradeLetter(this.chemistryScore);
    }
    private String getGradeLetter(double score){
        if(score <= 100 && score >= 90){
            return "A+";
        }
        else if(score < 90 && score >= 80){
            return "B+";
        }
        else if(score < 80 && score >= 70){
            return "C+";
        }
        else{
            return "F";
        }
    }
}
