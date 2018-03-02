package apresswood.com.adopter

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import apresswood.com.adopter.data.PetProfile
import apresswood.com.adopter.profile.ProfileActivity
import com.lorentzos.flingswipe.SwipeFlingAdapterView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList


class MainActivity : AppCompatActivity(), SwipeFlingAdapterView.onFlingListener {
    var petProfiles = ArrayList<PetProfile>()
    var adapter: AnimalListAdapter = AnimalListAdapter(petProfiles, this@MainActivity)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO delete aftet DB set up
        val petProfile1 = PetProfile("DogName", "This is a test description", 2,
                "Test Location", "Test breed", "Female", this.getDrawable(R.drawable.cutepuppy))
        petProfiles.add(petProfile1)

        //TODO call db to get list of animals
        this.frame!!.adapter = adapter
        this.frame!!.setFlingListener(this)

        frame!!.setOnItemClickListener { itemPosition, dataObject ->
            val view = frame!!.selectedView
            adapter.notifyDataSetChanged()
        }
    }

    protected fun goToProfile(view: View) {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }

    override fun removeFirstObjectInAdapter() {}

    override fun onLeftCardExit(dataObject: Any) {
        //array.remove(0);
        adapter.notifyDataSetChanged()
    }

    override fun onRightCardExit(dataObject: Any) {
        //array.remove(0);
        adapter.notifyDataSetChanged()
    }

    override fun onAdapterAboutToEmpty(itemsInAdapter: Int) {}

    override fun onScroll(scrollProgressPercent: Float) {
        val view = this.frame!!.selectedView
        view.findViewById<View>(R.id.background).alpha = 0f
        view.findViewById<View>(R.id.item_swipe_right_indicator).setAlpha(if (scrollProgressPercent < 0)
            -scrollProgressPercent
        else
            0F)
        view.findViewById<View>(R.id.item_swipe_left_indicator).setAlpha(if (scrollProgressPercent > 0)
            scrollProgressPercent
        else
            0F)
    }
}