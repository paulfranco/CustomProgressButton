package co.paulfran.customprogressbutton

import android.content.Context
import android.view.View
import android.view.animation.Animation
import android.widget.ProgressBar
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout

class ProgressButton(
    context: Context?,
    view: View
) {
    // Variables
    private val cardView: CardView
    private val layout: ConstraintLayout
    private val progressBar: ProgressBar
    private val textView: TextView


    // Methods
    fun buttonActivated() {
        progressBar.visibility = View.VISIBLE
        textView.text = "Please Wait..."
    }

    fun buttonFinished() {
        layout.setBackgroundColor(cardView.resources.getColor(R.color.green))
        progressBar.visibility = View.GONE
        textView.text = "Done"
    }

    init {
        // Initailize elements
        cardView = view.findViewById(R.id.card_view)
        layout = view.findViewById(R.id.constraint_layout)
        progressBar = view.findViewById(R.id.progressBar)
        textView = view.findViewById(R.id.textView)
    }
}