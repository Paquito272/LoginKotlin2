package lopez.francisco.loginkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_tercera.*

class tercera : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera)


        val numimagen = intent.extras.get("numimagen")



        if (numimagen.equals('1')){
            //Picasso.get().load("http://3.bp.blogspot.com/-mgOGh4s32JQ/TtDXA24WxAI/AAAAAAAAABE/dkM1XhVjEpM/w1200-h630-p-k-no-nu/%25C2%25A1estoy+bien%2521.png").into(imgReaccion);
            imgReaccion.setImageResource(R.drawable.happy);

        }else{

            //Picasso.get().load("http://3.bp.blogspot.com/-mgOGh4s32JQ/TtDXA24WxAI/AAAAAAAAABE/dkM1XhVjEpM/w1200-h630-p-k-no-nu/%25C2%25A1estoy+bien%2521.png").into(imgReaccion);
            imgReaccion.setImageResource(R.drawable.sad);

        }



    }
}
