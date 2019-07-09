
class Hangar{

    public static void main(String[] args) {
        Car obj = new Car("Clio", 1200);
        Boat obj1 = new Boat("Titanic", 1654);

        obj.doStuff();
        obj1.doStuff();

        System.out.println(obj1.doStuff());
        System.out.println(obj1.doStuff());
    }
}