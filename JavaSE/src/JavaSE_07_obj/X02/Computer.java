package JavaSE_07_obj.X02;

public class Computer extends Students{
    public double use_score;  //0.4
    public double english_score;  //0.2
    public double end_score;  //0.2
    public double center_score;   //0.2

    public Computer(int num, String name, String sex, int age,  double use_score,
                    double english_score, double end_score, double center_score) {
        super(num, name, sex, age);
        this.use_score = use_score;
        this.english_score = english_score;
        this.end_score = end_score;
        this.center_score = center_score;
    }

    public double getScore() {
        return 0.4*use_score+0.2*english_score+0.2*end_score+0.2*center_score;
    }
}
