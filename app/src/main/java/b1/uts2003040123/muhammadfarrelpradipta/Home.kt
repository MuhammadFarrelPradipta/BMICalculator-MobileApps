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

    private lateinit var  edtGender: RadioButton
    private lateinit var  edtTinggi: EditText
    private lateinit var  edtBerat: EditText
    private  lateinit var rbtnBoy : RadioButton
    private  lateinit var rbtnGirl : RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()



        val btnCalculate:Button = findViewById(R.id.btn_calculate)
        btnCalculate.setOnClickListener(this)

        val  btnStandarBMI :Button = findViewById(R.id.btn_standar)
        btnStandarBMI.setOnClickListener(this)
        var rg_gender:RadioGroup =findViewById(R.id.radio)
        val radioId = rg_gender.checkedRadioButtonId
        edtGender  = findViewById(radioId)
        edtTinggi = findViewById(R.id.inp_tinggi)
        edtBerat = findViewById(R.id.inp_berat)
        rbtnBoy = findViewById(R.id.btn_boy)
        rbtnGirl = findViewById(R.id.btn_girl)
    }

    override fun onClick(v: View?) {
        when(v?.id){
         R.id.btn_calculate->{
             var inGender = edtGender.text.toString().trim()
             var inpBerat = edtBerat.text.toString().trim()
             var inpTinggi = edtTinggi.text.toString().trim()
             var inBoy =  rbtnBoy.text.toString().trim()
             var inGirl = rbtnGirl.text.toString().trim()

            var  IsEmpetyField = false
             if(inGender.isEmpty()){
                 IsEmpetyField = true
                 edtGender.setError("Field ini tidak boleh kosong")
             }
             if (inpBerat.isEmpty()){
                 IsEmpetyField = true
                 edtBerat.setError("Field ini tidak boleh kosong")
             }
             if (inpTinggi.isEmpty()){
                 IsEmpetyField = true
                 edtTinggi.setError("Field ini tidak boleh kosong")
             }
             if(!IsEmpetyField){
                 if (rbtnBoy.isChecked()){
                     var inTinggi = (edtTinggi.text.toString()).toDouble()
                     var inBerat = Integer.parseInt(edtBerat.text.toString())
                     val movecalculate = Intent(this@Home,DetailCalculate::class.java)
                     movecalculate.putExtra(DetailCalculate.Extra_Tinggi, inTinggi)
                     movecalculate.putExtra(DetailCalculate.Extra_Berat,inBerat)
                     movecalculate.putExtra(DetailCalculate.Extra_Gender,inBoy)
                     startActivity(movecalculate);
                 }
                 if (rbtnGirl.isChecked()){
                     var inTinggi = (edtTinggi.text.toString()).toDouble()
                     var inBerat = Integer.parseInt(edtBerat.text.toString())
                     val movecalculate = Intent(this@Home,DetailCalculate::class.java)
                     movecalculate.putExtra(DetailCalculate.Extra_Tinggi, inTinggi)
                     movecalculate.putExtra(DetailCalculate.Extra_Berat,inBerat)
                     movecalculate.putExtra(DetailCalculate.Extra_Gender,inGirl)
                     startActivity(movecalculate);
                 }


             }


         }
            R.id.btn_standar -> {
                val movestandar = Intent(this@Home,StandarBMI::class.java)
                startActivity(movestandar)
            }
        }
    }
}

private fun EditText.error(s: String) {

}

private fun RadioButton.error(s: String) {

}

private fun Intent.putExtra(extraTinggi: String, inTinggi: Any) {
    TODO("Not yet implemented")
}


private fun Intent.putExtra(extraGender: String, edtGender: RadioButton) {
    TODO("Not yet implemented")
}


private fun Intent.putExtra(extraTinggi: String, edtTinggi: EditText) {

}
