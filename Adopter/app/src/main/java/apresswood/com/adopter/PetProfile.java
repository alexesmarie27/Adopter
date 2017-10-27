package apresswood.com.adopter;


class PetProfile {
    private String description;
    private String name;

    public PetProfile(String name, String description) {
        this.description = description;
        this.name = name;
    }

    String getDescription() {
        return description;
    }

    String getName() {
        return name;
    }

    //TODO: lots of stuff
}
