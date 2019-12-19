package JavaSE_07_obj;


class ColaEmployee{            //员工类
    String name;
    int month;

    public ColaEmployee(String name, int month) {
        this.name = name;
        this.month = month;
    }
    public double getSalary(int month){
        return 0;
    }
}

class SalariedEmployee extends ColaEmployee {    //固定工资员工类
    double salary;

    public SalariedEmployee(String name, int month, double salary) {
        super(name, month);
        this.salary = salary;
    }
    public double getSalary(int month){
        if(this.month==month)
            return salary+100;
        else return salary;
    }
}

class HourlyEmployee extends ColaEmployee{           //小时工员工类
    double hour;
    double hour_salary;

    public HourlyEmployee(String name, int month, double hour, double hour_salary) {
        super(name, month);
        this.hour = hour;
        this.hour_salary = hour_salary;
    }

    public double getSalary(int month){
        if(hour>160){
            if(this.month==month)
                return 160*hour_salary+(hour-160)*1.5*hour_salary+100;
            else return 160*hour_salary+(hour-160)*1.5*hour_salary;
        }else{
            if(this.month==month)
                return hour_salary*hour+100;
            else return hour*hour_salary;
        }
    }
}

class SalesEmployee extends ColaEmployee{                //销售人员员工类
    double achievement;        //业绩
    double rate;            //比率

    public SalesEmployee(String name, int month, double achievement, double rate) {
        super(name, month);
        this.achievement = achievement;
        this.rate = rate;
    }
    public double getSalary(int month){
        if(this.month==month)
            return achievement*rate+100;
        else return achievement*rate;
    }
}

class Company{
    public void getSalary(ColaEmployee c,int month){
        System.out.println(c.name+"在"+month+"月的工资为"+c.getSalary(month));
    }
}
public class Test4 {

    public static void main(String[] args) {
        ColaEmployee[] cc = {    new SalariedEmployee("习大大",3,10000.0),
                new HourlyEmployee("特朗姆",1,720,0.031),
                new SalesEmployee("普京",3,100000000,0.01)
        };
            Company c = new Company();
            c.getSalary(cc[0],3);
            c.getSalary(cc[1],3);
            c.getSalary(cc[2],3);
    }
}