package escalante.elmer.tofologin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import escalante.elmer.tofologin.databinding.ActivityPerfilesBinding
import escalante.elmer.tofologin.ui.perfil.PerfilFragment

class ActivityConfiguracion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracion)

        val btn_regresar: ImageButton = findViewById(R.id.btnRegresarConfiguracion)
        val btn_editarPerfil: Button = findViewById(R.id.editarperfil)
        val btn_cambiarPerfil: Button = findViewById(R.id.cambiarperfil)
        val btn_ayuda: Button = findViewById(R.id.ayuda)
        val btn_cerrarSesion: Button = findViewById(R.id.btncerrarSesion)


        btn_regresar.setOnClickListener{
            startActivity(Intent(this, PerfilFragment::class.java))
        }
        btn_editarPerfil.setOnClickListener{
            startActivity(Intent(this, ConfiguracionPerfilActivity::class.java))
        }
        btn_cambiarPerfil.setOnClickListener{
            startActivity(Intent(this, PerfilesActivity::class.java))
        }
        btn_ayuda.setOnClickListener{
            startActivity(Intent(this, PreguntasActivity::class.java))
        }
        btn_cerrarSesion.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }

    }
}