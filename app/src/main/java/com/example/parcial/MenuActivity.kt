import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.parcial.CambioActivity  // Asegúrate de importar la clase CambioActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        // Encuentra el botón por su ID
        val btnKambio = findViewById(R.id.btnKambio)

        // Agrega un OnClickListener al botón
        btnKambio.setOnClickListener {
            // Crea un Intent para iniciar la actividad CambioActivity
            val intent = Intent(this, CambioActivity::class.java)
            startActivity(intent)
        }
    }
}
