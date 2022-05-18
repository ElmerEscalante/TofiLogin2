package escalante.elmer.tofologin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ConfiguracionPerfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configurarperfil)

        val btn_siguiente: Button = findViewById(R.id.btnSiguiente)
        val btn_cerrar: ImageView = findViewById(R.id.cerrar)

        btn_siguiente.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
        btn_cerrar.setOnClickListener{
            startActivity(Intent(this, PerfilesActivity::class.java))
        }

    }
}