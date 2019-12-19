package JavaSE_10_Collection.java.stream;

public class Apple {
    private int weight;
    private String color;
    private String catalog;   //品类

    public Apple(){}
    public Apple(int weight, String color, String catalog) {
        this.weight = weight;
        this.color = color;
        this.catalog = catalog;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getCatalog() {
        return catalog;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() :0;
        result = 31*result+(catalog!=null?catalog.hashCode():0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if (obj == null||getClass()!=obj.getClass())return false;

        Apple apple =(Apple) obj;
        if (color != null?!color.equals(apple.color):apple.color!=null)return false;
        return catalog != null?catalog.equals(apple.catalog): apple.catalog==null;
    }

    @Override
    public String toString() {
        return "重量:"+weight+"\t颜色:"+color+"\t品类:"+catalog;
    }
}
