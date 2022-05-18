package escalante.elmer.tofologin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ConfiguracionPerfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configurarperfil)

        val btn_siguiente: Button = findViewById(R.id.btnSiguiente)

        btn_siguiente.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }

    }
}