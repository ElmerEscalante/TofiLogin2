package escalante.elmer.tofologin

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import lizarraga.juan.nave.R

class BotonConfiguracion: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracion)

        val btn_configuracion: ImageButton = findViewById(R.id.btnConfiguracion)

        btn_configuracion.setOnClickListener{
            val intent: Intent = Intent(this, FantasiaView::class.java)
            startActivity(intent)
        }
    }
}