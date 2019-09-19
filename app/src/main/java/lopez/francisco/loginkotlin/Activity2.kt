package lopez.francisco.loginkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_main.*

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val nombre = intent.extras.get("nombre")
        Toast.makeText(applicationContext, "Recibido: $nombre", Toast.LENGTH_LONG).show()


        tv3.text = "Tu nombre es "+nombre


        val ArregloRetos = arrayOf(0,1,2)


        btnAdivinar.setOnClickListener {

            var variable = ArregloRetos.random()

            val rnds = (0..2).random()



            val numero = etNumero.text.toString()



            if (rnds.equals(variable)){

                val i = Intent(applicationContext,  tercera::class.java)
                i.putExtra("numimagen",'1')
                startActivity(i)


            }else{

                val i = Intent(applicationContext,  tercera::class.java)
                i.putExtra("numimagen",'2')
                startActivity(i)

            }


        }




    }

}
