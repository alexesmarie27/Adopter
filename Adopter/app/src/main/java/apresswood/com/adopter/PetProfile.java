package apresswood.com.adopter;


class PetProfile {

    //TODO use Jackson to automap values to variables once DB is set up
    
    private String description;
    private String name;
    private int age;
    private String location;
    private String breed;
    private String gender;

    public PetProfile(String name, String description, int age, String location, String breed,
                      String gender) {
        this.description = description;
        this.name = name;
        this.age = age;
        this.location = location;
        this.breed = breed;
        this.gender = gender;
    }

    String getDescription() {
        return description;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getLocation() {
        return location;
    }

    String getBreed() {
        return breed;
    }

    String getGender() {
        return gender;
    }
}
