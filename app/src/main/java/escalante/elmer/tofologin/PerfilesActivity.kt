package escalante.elmer.tofologin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class PerfilesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfiles)

        val btn_perfil1: ImageButton = findViewById(R.id.btnPerfil1)
        val btn_perfil2: ImageButton = findViewById(R.id.btnPerfil2)
        val btn_perfil3: ImageButton = findViewById(R.id.btnPerfil3)
        val btn_perfil4: ImageButton = findViewById(R.id.btnPerfil4)


        btn_perfil1.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
        btn_perfil2.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
        btn_perfil3.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
        btn_perfil4.setOnClickListener{
            startActivity(Intent(this, ConfiguracionPerfilActivity::class.java))
        }
    }
}