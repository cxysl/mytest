package JavaSE_07_obj.X02;

public class WenXue extends Students{
    public double speech_score;  //0.35
    public double works_score;  //0.35
    public double end_score;  //0.15
    public double center_score;   //0.15

    public WenXue(int num, String name, String sex, int age,
                  double speech_score, double works_score, double end_score, double center_score) {
        super(num, name, sex, age);
        this.speech_score = speech_score;
        this.works_score = works_score;
        this.end_score = end_score;
        this.center_score = center_score;
    }

    public double getScore() {
        return 0.35*speech_score+0.35*works_score+0.15*end_score+0.15*center_score;
    }
}
