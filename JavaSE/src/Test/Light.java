package Test;

public class Light {
    public static void main(String[] args) {
        int[] people = new int[100];
        int[] light = new int[100];
        boolean[] open = new boolean[100];
        for (int i = 0; i <light.length; i++) {
            light[i] = i+1;
        }
        for (int j = 0; j <people.length ; j++) {
            people[j] = j+1;
        }
        for (int i = 0; i < open.length; i++) {
            open[i] = true;
        }
        for (int i = 0; i <light.length; i++) {
            for (int j = 0; j <people.length ; j++) {
                if (light[i]%people[j]==0) open[i] = !open[i];
            }
        }
        for (int i = 0; i < open.length; i++) {
            System.out.println("open["+(i+1)+"]:"+open[i]+"\t");
        }
    }
}
