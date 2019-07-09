
public class Car extends Vehicule{


    //Appel constructeur parent
    public Car(String brand, int kilometres) {
        super(brand,kilometres);

    }

    @Override
    public String doStuff() {

        return "je suis " + this.getBrand() + "et je fais vroum vroum !";
    }

    }
