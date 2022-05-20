package escalante.elmer.tofologin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class RegistroActivity: AppCompatActivity(){
    private lateinit var auth: FirebaseAuth
    val database = Firebase.database
    val myRef = database.getReference("usuarios")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse)

        // Initialize Firebase Auth
        auth = Firebase.auth

        val et_usuario: EditText = findViewById(R.id.et_usuario)
        val et_correo: EditText = findViewById(R.id.correoElectronico)
        val et_contra1: EditText = findViewById(R.id.password)
        val et_contra2: EditText = findViewById(R.id.repitPassword)
        val btn_registrar: Button = findViewById(R.id.btnRegistro)
        val btn_regresar: ImageView = findViewById(R.id.btnRegresarRegistrarse)

        btn_regresar.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }

        btn_registrar.setOnClickListener{
            var usuario: String = et_usuario.text.toString().trim()
            var correo: String = et_correo.text.toString().trim()
            var contra1: String = et_contra1.text.toString().trim()
            var contra2: String = et_contra2.text.toString().trim()

            if(usuario.isNullOrEmpty() || correo.isNullOrEmpty() || contra1.isNullOrEmpty() || contra2.isNullOrEmpty()){
                Toast.makeText(this, "Favor de llenar todos los campos", Toast.LENGTH_SHORT).show()
            }else{
                if(contra1 != contra2){
                    Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show()
                }else{
                    auth.createUserWithEmailAndPassword(correo, contra1)
                        .addOnCompleteListener(this) { task ->
                            if (task.isSuccessful) {
                                // Sign in success, update UI with the signed-in user's information
                                //Log.d(TAG, "createUserWithEmail:success")
                                Toast.makeText(baseContext, "Registro exitoso", Toast.LENGTH_SHORT).show()


                                val usuarios = auth.currentUser

                                myRef.child(usuarios?.uid.toString()).child("Usuario").setValue(usuario)
                                myRef.child(usuarios?.uid.toString()).child("Correo").setValue(correo)
                                myRef.child(usuarios?.uid.toString()).child("Contraseña").setValue(contra1)

                                startActivity(Intent(this, ConfiguracionPerfilActivity::class.java))
                            } else {
                                // If sign in fails, display a message to the user.
                                Log.w("RegistroActivity", "createUserWithEmail:failure", task.exception)
                                Toast.makeText(baseContext, "Registro fallido",
                                    Toast.LENGTH_SHORT).show()
                                //updateUI(null)
                            }
                        }
                }
            }

        }
    }
}
