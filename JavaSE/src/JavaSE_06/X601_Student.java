package JavaSE_06;
class Student{
    String name;
    int num;   //学号
    int resuit;  //成绩
    public  Student(String name,int num,int resuit){
        this.name = name;
        this.num = num;
        this.resuit = resuit;
    }
    public void show(){
        System.out.println("姓名："+this.name+"\t学号："+this.num+"\t成绩："+this.resuit);
    }
}

public class X601_Student {
    public static void main(String[] args) {
        Student[] s = {
                new Student("不胖",001,75),
                new Student("小胖",002,59),
                new Student("中胖",003,88),
                new Student("大胖",004,44),
                new Student("超胖",005,99),
        };
        int len = s.length;
        System.out.println(len+"个学生信息：");
        for (int i = 0; i < 5 ; i++) {
            s[i] .show();
        }
        System.out.println("\n按分数排序后"+len+"个学生信息：");

        for (int i = 1; i < 5 ; i++){
            for (int j = 0; j < 5-i; j++) {
                if (s[j].resuit>s[j+1].resuit){
                    Student x = s[j];
                    s[j] = s[j+1];
                    s[j+1]= x;
                }
            }
        }
        for (int i = 0; i < 5 ; i++) {
            s[i] .show();
        }
    }
}