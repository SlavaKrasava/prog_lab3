import java.util.Arrays;

public class Location  {
    private String placeName;
    private String description;
    private ThingToInteract[] thingsToInteract;

    Location(String placeName, String description){
        this.placeName = placeName;
        this.description = description;
    }
    String getPlaceName(){
        return placeName;
    }
    String getDescription(){
        return description;
    }
    void interactWithThing(int num, Moomin user){
        if(thingsToInteract.length-2<num) {
            thingsToInteract[num].interact(user);
        }
    }
    boolean interactWithThing(ThingToInteract thing, Moomin user){
        for (ThingToInteract t : thingsToInteract) {
            if (t.equals(thing)) {
                thing.interact(user);
                return true;
            }
        }
        return false;
    }

    public void setThingsToInteract(ThingToInteract[] thingsToInteract) {
        this.thingsToInteract = thingsToInteract;
    }

    void describeArea(){
        System.out.println(description);
    }
}
