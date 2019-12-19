package JavaSE_07_obj.X02;

public class Main {
    public static void main(String[] args) {
        Students[] s = {new English(2019001,"TaylorSwift","女",31,88,66,99),
                        new Computer(2019002,"胡歌","男",35,86,77,98,95),
                        new WenXue(2019003,"张国荣","男",65,55,67,77,71)};
        for (int i = 0; i <3 ; i++) {
            System.out.println("学号:"+s[i].num+"\t\t姓名:"+s[i].name+"\t\t性别:"+s[i].sex+"\t\t年龄:"+s[i].age+"\t\t综合成绩:"+s[i].getScore());
        }
    }
}
