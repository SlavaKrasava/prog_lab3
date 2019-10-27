public class ThingToInteract implements ForInteraction{
    private String thingName;
    private String interaction;
    ThingToInteract(String thingName, String interaction){
        this.thingName = thingName;
        this.interaction = interaction;
    }

    @Override
    public String toString() {
        return thingName+interaction;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ThingToInteract){
            return ((ThingToInteract) o).thingName.equals(thingName)
                    && ((ThingToInteract) o).interaction.equals(interaction);
        }
        return false;
    }

    public String getThingName() {
        return thingName;
    }

    public String getInteraction() {
        return interaction;
    }

    @Override
    public void interact(Moomin user) {
        System.out.println(user.getName() + " решил " + interaction);
    }
}
