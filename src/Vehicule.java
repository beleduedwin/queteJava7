
public abstract class Vehicule {

    //Attributs
    private String brand;
    private int kilometers;

    //Constructeur
    public Vehicule(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    //Getters and setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    //La methode abstraite
   public abstract String doStuff();
}