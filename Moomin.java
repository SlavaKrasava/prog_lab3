abstract public class Moomin implements Alive {
    Moomin(String name, Gender gender, Location currLocation){
        this.name = name;
        this.gender = gender;
        currentLocation = currLocation;
    }
    private Location currentLocation;
    private String name;
    private Gender gender;
    private State currentState;

    @Override
    public void say(String msg) {
        System.out.println(name + " говорит: " + msg);
    }

    @Override
    public void sleep(){
        if (currentState.equals(State.TIRED)) {
            System.out.println(name + " is sleeping.");
        }else{
            String heShe = getGender().equals(Gender.FEMALE) ? "she" : "he";
            System.out.println(name + " can't sleep unless " + heShe + " is tired.");
            setCurrentState(State.NORMAL);
        }
    }

    @Override
    public String toString() {
        return name + ", " + gender.toString();
    }


    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public State getCurrentState() {
        return currentState;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
    enum Gender{
        MALE,
        FEMALE;
    }
    private enum State{
        TIRED,
        NORMAL
    }
}