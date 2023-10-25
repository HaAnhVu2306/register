package com.example.register_app

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.register_app.ui.theme.Register_appTheme
import android.widget.EditText;
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : ComponentActivity() {
    val firstname: EditText = findViewById(R.id.editTextText)
    val lastname: EditText = findViewById(R.id.editTextText2)
    val male: RadioButton = findViewById(R.id.radioButton4)
    val female: RadioButton = findViewById(R.id.radioButton5)
    val birthday: EditText = findViewById(R.id.editTextText4)
    val address: EditText = findViewById(R.id.editTextText3)
    val email: EditText = findViewById(R.id.editTextText5)
    val checkbox: CheckBox = findViewById(R.id.checkBox)
    val button: Button = findViewById(R.id.button)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Chua nhap du cac truong thong tin", Toast.LENGTH_LONG).show()
        button.setOnClickListener(register())
    }

    private fun register(): View.OnClickListener? {
        if(firstname.length()==0 ||
            lastname.length()==0||
            birthday.length()==0||
            address.length()==0||
            email.length()==0 ||
            !male.isChecked ||
            !female.isChecked ||
            !checkbox.isChecked)
            Toast.makeText(this, "Chua nhap du cac truong thong tin", Toast.LENGTH_SHORT).show()
    }
}
