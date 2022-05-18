package escalante.elmer.tofologin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import escalante.elmer.tofologin.databinding.ActivityPerfilesBinding
import escalante.elmer.tofologin.ui.perfil.PerfilFragment

class PreguntasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preguntasfrecuentes)

        val btn_regresar: ImageView = findViewById(R.id.cerrar)

        btn_regresar.setOnClickListener{
            startActivity(Intent(this, ActivityConfiguracion::class.java))
        }
    }
}