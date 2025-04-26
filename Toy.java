
//Создадим конструктор для инициализации полей 
//С его помощью будем создавать и управлять объектами класса.
public class Toy {

    int id;
    String name;
    double dropRate;

    public Toy(int id, String name, double dropRate) {
        this.id = id;
        this.name = name;
        this.dropRate = dropRate;
    }

    public void setWeight(float dropRate) {
        this.dropRate = dropRate;
    }

    public double getRate() {
        return dropRate;
    }

    @Override
    public String toString() {
        return "Toy [id=" + id + ", name=" + name + ", dropRate=" + dropRate + "]";
    }
    
}