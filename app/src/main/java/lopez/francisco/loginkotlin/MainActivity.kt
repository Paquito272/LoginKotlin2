package lopez.francisco.loginkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnIngresar.setOnClickListener {

            val user = etUser.text.toString()
            val pass = etPass.text.toString()
            val btnIngresar = btnIngresar
            if (user.equals("paco") && pass.equals("123")){

                toast("Binbenido Mortal", Toast.LENGTH_SHORT)
                val i = Intent(applicationContext,  Activity2::class.java)
                i.putExtra("nombre",etUser.text.trim().toString())
                startActivity(i)

            }else {


                toast("Verifica tu usuario y contraseña", Toast.LENGTH_SHORT)
            }
        }





        }

    fun toast(mensaje: String, tiempo: Int = Toast.LENGTH_LONG) {
        Toast.makeText(this, mensaje, tiempo).show()
    }
}
