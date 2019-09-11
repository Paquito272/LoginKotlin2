package lopez.francisco.loginkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val nombre = intent.extras.get("nombre")
        Toast.makeText(applicationContext, "Recibido: $nombre", Toast.LENGTH_LONG).show()


        tv3.text = "Tu nombre es "+nombre
    }
    override fun onStart() {
        super.onStart()
        Log.w("ejemplo", "Debo estar en el OnStar" )
    }
}
