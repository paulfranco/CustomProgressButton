package co.paulfran.customprogressbutton

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Instantiate View
    var view: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // set view to our custom button
        view = findViewById<View>(R.id.myProgressButton)
        // set an onClickListener
        view!!.setOnClickListener { view ->
            // Initialize our ProgressButton
            val progressButton = ProgressButton(this@MainActivity, view)
            // call on the buttonActivated method
            progressButton.buttonActivated()
            // Initialize a handler
            val handler = Handler()
            // call postDelayed Method for 3 seconds
            handler.postDelayed({
                // call on the buttonFinished method
                progressButton.buttonFinished()
                // Initialize a second handler
                val handler1 = Handler()
                // call postDelayed on the second handler
                handler1.postDelayed({
                    // initialize an intent to navigate to the second screen after 2 seconds
                    val intent =
                        Intent(this@MainActivity, SecondActivity::class.java)
                    // navigate to the second screen
                    startActivity(intent)
                }, 2000)
            }, 3000)

        }
    }
}