package escalante.elmer.tofologin

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val container: ImageView = findViewById(R.id.logo_principal)

        container.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}