package b1.uts2003040123.muhammadfarrelpradipta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class DetailCalculate : AppCompatActivity(), View.OnClickListener {
    companion object{
        const val Extra_Tinggi = "extra_tinggi"
        const val Extra_Berat = "extra_berat"
        const val Extra_Gender = "extra_gender"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_calculate)
        supportActionBar?.hide()

        val tvDataRecieved:TextView = findViewById(R.id.tv_hasil)
        val Berat =intent.getIntExtra(Extra_Berat,0)
        val Tinggi = intent.getDoubleExtra(Extra_Tinggi, 0.0)
        val Gender = intent.getStringExtra(Extra_Gender)


        val hasil = Berat/(Tinggi*Tinggi)


        if (Gender == "Perempuan"){
            if (hasil < 18 ){
                tvDataRecieved.setText("Berdasarkan data yang anda berikan dimana berat badan anda  $Berat kg dan tinggi badan anda $Tinggi  meter maka  nilai BMI anda yaitu $hasil karena anda seorang $Gender maka anda masuk dalam kategori Kurus/Underweight")
            }else if(hasil >= 18 && hasil < 25){
                tvDataRecieved.setText("Berdasarkan data yang anda berikan dimana berat badan anda  $Berat kg dan tinggi badan anda $Tinggi  meter maka  nilai BMI anda yaitu $hasil karena anda seorang $Gender maka anda masuk dalam kategori Normal/Weight")
            }else if (hasil >= 25 && hasil <27){
                tvDataRecieved.setText("Berdasarkan data yang anda berikan dimana berat badan anda  $Berat kg dan tinggi badan anda $Tinggi  meter maka  nilai BMI anda yaitu $hasil karena anda seorang $Gender maka anda masuk dalam kategori Kegemukan/Overweight")
            }else if (hasil > 27){
                tvDataRecieved.setText("Berdasarkan data yang anda berikan dimana berat badan anda  $Berat kg dan tinggi badan anda $Tinggi  meter maka  nilai BMI anda yaitu $hasil karena anda seorang $Gender maka anda masuk dalam kategori Obesitas")
            }
        }else if (Gender == "Laki-Laki"){
            if (hasil < 17 ){
                tvDataRecieved.setText("Berdasarkan data yang anda berikan dimana berat badan anda  $Berat kg dan tinggi badan anda $Tinggi  meter maka  nilai BMI anda yaitu $hasil karena anda seorang $Gender maka anda masuk dalam kategori Kurus/Underweight")
            }else if(hasil >= 17 && hasil < 23){
                tvDataRecieved.setText("Berdasarkan data yang anda berikan dimana berat badan anda  $Berat kg dan tinggi badan anda $Tinggi  meter maka  nilai BMI anda yaitu $hasil karena anda seorang $Gender maka anda masuk dalam kategori Normal/Weight")
            }else if (hasil >= 23 && hasil <27){
                tvDataRecieved.setText("Berdasarkan data yang anda berikan dimana berat badan anda  $Berat kg dan tinggi badan anda $Tinggi  meter maka  nilai BMI anda yaitu $hasil karena anda seorang $Gender maka anda masuk dalam kategori Kegemukan/Overweight")
            }else if (hasil > 27){
                tvDataRecieved.setText("Berdasarkan data yang anda berikan dimana berat badan anda  $Berat kg dan tinggi badan anda $Tinggi  meter maka  nilai BMI anda yaitu $hasil karena anda seorang $Gender maka anda masuk dalam kategori Obesitas")
            }
        }


    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}