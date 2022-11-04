package b1.uts2003040123.muhammadfarrelpradipta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        Handler().postDelayed(
            {
              val moving = Intent(this@MainActivity, Home::class.java)
                startActivity(moving)
                finish()
            },3000)
    }
}

private fun Handler.postDelayed(function: () -> Unit) {

}
