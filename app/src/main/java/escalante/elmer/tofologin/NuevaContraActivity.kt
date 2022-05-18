package escalante.elmer.tofologin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class NuevaContraActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevacontrasena)

        auth = Firebase.auth

        val et_contra: EditText = findViewById(R.id.et_correo)
        val et_contra_repit: EditText = findViewById(R.id.et_contra_repit)
        val btn_restablecer: Button = findViewById(R.id.btnRestablecerContra)
        val btn_regresar: ImageView = findViewById(R.id.img_regresar_nuevacontra)

        btn_regresar.setOnClickListener{
            startActivity(Intent(this, RestaurarContraActivity::class.java))
        }

        btn_restablecer.setOnClickListener{
            var contra: String = et_contra.text.toString().trim()
            var contraRepit: String = et_contra_repit.text.toString().trim()

            //if(contra.isNullOrEmpty() == contraRepit.isNullOrEmpty()){
               // Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show()
            //}else{
                startActivity(Intent(this, PerfilesActivity::class.java))
            //}
        }
    }
}