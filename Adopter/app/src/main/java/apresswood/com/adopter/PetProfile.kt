package apresswood.com.adopter

import android.graphics.drawable.Drawable

data class PetProfile(var description: String,
                      var name: String,
                      var age: Int,
                      var location: String,
                      var breed: String,
                      var gender: String,
                      var profilePicture: Drawable)