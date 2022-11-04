package b1.uts2003040123.muhammadfarrelpradipta

import android.R.integer
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class Home : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()



        val btnCalculate:Button = findViewById(R.id.btn_calculate)
        btnCalculate.setOnClickListener(this)

        val  btnStandarBMI :Button = findViewById(R.id.btn_standar)
        btnStandarBMI.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when(v.id){
         R.id.btn_calculate->{

             var rg_gender:RadioGroup =findViewById(R.id.radio)
             val radioId = rg_gender.checkedRadioButtonId
             var edtGender :RadioButton = findViewById(radioId)
             var edtTinggi:EditText = findViewById(R.id.inp_tinggi)
             var edtBerat:EditText = findViewById(R.id.inp_berat)
             var inTinggi = (edtTinggi.text.toString()).toDouble()
             var inBerat = Integer.parseInt(edtBerat.text.toString())
             var inGender = edtGender.text.toString()


            val movecalculate = Intent(this@Home,DetailCalculate::class.java)
             movecalculate.putExtra(DetailCalculate.Extra_Tinggi, inTinggi)
             movecalculate.putExtra(DetailCalculate.Extra_Berat,inBerat)
             movecalculate.putExtra(DetailCalculate.Extra_Gender,inGender)
             startActivity(movecalculate);
         }
            R.id.btn_standar -> {
                val movestandar = Intent(this@Home,StandarBMI::class.java)
                startActivity(movestandar)
            }
        }
    }
}

private fun Intent.putExtra(extraTinggi: String, inTinggi: Any) {
    TODO("Not yet implemented")
}


private fun Intent.putExtra(extraGender: String, edtGender: RadioButton) {
    TODO("Not yet implemented")
}


private fun Intent.putExtra(extraTinggi: String, edtTinggi: EditText) {

}
