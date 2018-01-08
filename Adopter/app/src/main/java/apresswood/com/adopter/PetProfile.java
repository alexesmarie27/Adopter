package apresswood.com.adopter;


import android.graphics.drawable.Drawable;

class PetProfile {

    //TODO use Jackson to automap values to variables once DB is set up

    private String description;
    private String name;
    private int age;
    private String location;
    private String breed;
    private String gender;
    private Drawable profilePicture;

    PetProfile(String name, String description, int age, String location, String breed,
               String gender, Drawable profilePicture) {
        this.description = description;
        this.name = name;
        this.age = age;
        this.location = location;
        this.breed = breed;
        this.gender = gender;
        this.profilePicture = profilePicture;
    }

    String getDescription() {
        return this.description;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    String getLocation() {
        return this.location;
    }

    String getBreed() {
        return this.breed;
    }

    String getGender() {
        return this.gender;
    }

    Drawable getProfilePicture() {
        return this.profilePicture;
    }
}
