package vcmsa.ci.playlistmanager

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    @SuppressLint("MissingSuperCall")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val playlist = arrayOf(
            "Happy: Pharell Williams, 4,5",
            "She Will: Drake, 3,6",
            "Views: Drake, 3,4",
            "Soweto Groove: Kelvin Momo, 4,2",

        )

        val tvDetails = findViewById<TextView>(R.id.tvDetails)
        val builder = StringBuilder()

        for (song in playlist) {
            builder.append( song).append("\n\n")
        }

        builder.toString().also { tvDetails.text = it }
    }

    override fun setContentView(activityDetail: Int) {

    }
}