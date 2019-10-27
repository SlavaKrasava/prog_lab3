public class MoominMom extends Moomin {

    MoominMom(String name, Gender gender, Location location) {
        super(name, gender, location);
    }
    //Singleton?

    void lieDown(){
        System.out.println("Муми-мама прилегла в месте " + getCurrentLocation().getPlaceName());
    }

}
