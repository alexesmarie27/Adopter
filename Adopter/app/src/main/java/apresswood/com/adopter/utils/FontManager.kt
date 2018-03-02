package apresswood.com.adopter.utils

import android.content.Context
import android.graphics.Typeface
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


object FontManager {

    internal val ROOT = "fonts/"
    internal val FONTAWESOME = ROOT + "fontawesome-webfont.ttf"

    fun getTypeface(context: Context, font: String): Typeface {
        return Typeface.createFromAsset(context.assets, font)
    }

    internal fun markAsIconContainer(v: View, typeface: Typeface) {
        if (v is ViewGroup) {
            for (i in 0 until v.childCount) {
                val child = v.getChildAt(i)
                markAsIconContainer(child, typeface)
            }
        } else if (v is TextView) {
            v.typeface = typeface
        }
    }
}