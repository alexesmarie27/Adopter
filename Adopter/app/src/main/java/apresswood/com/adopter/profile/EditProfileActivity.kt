package apresswood.com.adopter.profile

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.SeekBar
import apresswood.com.adopter.FontManager
import apresswood.com.adopter.R
import kotlinx.android.synthetic.main.edit_profile.*
import org.honorato.multistatetogglebutton.ToggleButton


class EditProfileActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener, ToggleButton.OnValueChangedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_profile)

        val iconFont = FontManager.getTypeface(applicationContext, FontManager.FONTAWESOME)
        FontManager.markAsIconContainer(this.back_button, iconFont)

        this.distance!!.setOnSeekBarChangeListener(this)
        this.age!!.setOnSeekBarChangeListener(this)
        this.gender!!.setOnValueChangedListener(this)
    }

    fun goBack(view: View) {
        //TODO: Save new criteria in DB

        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }

    override fun onProgressChanged(seekBar: SeekBar, progress: Int,
                                   fromUser: Boolean) {
        if (seekBar == this.distance) {
            distance_value.text = progress.toString()
        } else {
            age_value.text = progress.toString()
        }
    }

    override fun onStartTrackingTouch(seekBar: SeekBar) {
    }

    override fun onStopTrackingTouch(seekBar: SeekBar) {
    }

    override fun onValueChanged(position: Int) {
    }
}