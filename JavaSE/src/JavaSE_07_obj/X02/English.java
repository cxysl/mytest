package JavaSE_07_obj.X02;

public class English extends Students{
    public double speech_score;
    public double end_score;
    public double center_score;

    public English(int num, String name, String sex, int age,
                   double speech_score, double end_score, double center_score) {
        super(num, name, sex, age);
        this.speech_score = speech_score;
        this.end_score = end_score;
        this.center_score = center_score;
    }

    public double getScore() {
        return 0.5*speech_score+0.25*end_score+0.25*center_score;
    }
}
