package escalante.elmer.tofologin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RestaurarContraActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurarcontrasena)

        auth = Firebase.auth

        val Usuario: EditText = findViewById(R.id.et_correo_usuario)
        val btn_checar: Button = findViewById(R.id.btnChecar)
        val btn_regresar: ImageView = findViewById(R.id.img_regresar_restaurar)

        btn_regresar.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }

        btn_checar.setOnClickListener{
            var correo: String = Usuario.text.toString().trim()

            if(correo.isNullOrEmpty()){
                Toast.makeText(this, "Favor de llenar el campo", Toast.LENGTH_SHORT).show()
            }else{
                auth.sendPasswordResetEmail(correo).addOnCompleteListener{ task ->
                    if(task.isSuccessful){
                        Toast.makeText(this, "Se envio un correo", Toast.LENGTH_SHORT).show()
                        startActivity(Intent(this, NuevaContraActivity::class.java))
                    }else{
                        Toast.makeText(this, "Ocurrio un error inesperado", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}