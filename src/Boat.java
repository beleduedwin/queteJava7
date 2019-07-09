
public class Boat extends Vehicule {

    //Appel constructeur parent
    public Boat(String brand, int kilometres) {
        super(brand, kilometres);
    }

    @Override
    public String doStuff() {
        return "je suis " + this.getBrand() + "et je fais glou glou !";
    }
}