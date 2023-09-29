package com.example.aplikasikartunama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.aplikasikartunama.R
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height


import com.example.aplikasikartunama.ui.theme.AplikasiKartuNamaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AplikasiKartuNamaTheme {
                // menggunakan surface untuk menentukan background colour pada tema saya
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    KartuNama("Wildan Assyidiq", "Machine Learning Engineer", "wildan.assyidiq@students.utdi.ac.id", "081542929562")
                }
            }
        }
    }
}

@Composable
fun KartuNama(name: String, jobTitle: String, email: String, phoneNumber: String) { //function pada kode program
    Column( //Menggunakan layout column
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        MaterialTheme.colorScheme.primary,
                        MaterialTheme.colorScheme.secondary
                    )
                )
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp) // Jarak antara elemen-elemen dalam Column
        ) {
            Text(
                text = "ID CARD",
                style = MaterialTheme.typography.headlineLarge.copy(fontSize = 50.sp),
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .border(2.dp, Color.Black) // Ukuran border 2dp, warna hitam
                    .padding(8.dp) // Sesuaikan dengan jarak dari tepi atas
            )

            Spacer(modifier = Modifier.height(16.dp)) // Jarak antara teks dan gambar

           Image(
                painter = painterResource(id = R.drawable.myfoto), // Menempatkan gambar
                contentDescription = null,
                modifier = Modifier.fillMaxHeight(0.65f).fillMaxWidth(1f)
            )
        }

        Text( //Biodata diri saya
            text = name,
            style = MaterialTheme.typography.titleLarge.copy(fontSize = 30.sp),
            fontWeight = FontWeight.Bold,
            color = Color(0xFF04112C)

        )
        Text(
            text = jobTitle,
            style = MaterialTheme.typography.bodyLarge.copy(fontSize = 20.sp),
            color = Color(0xFF010625)
        )
        Text(
            text = "Email: $email",
            style = MaterialTheme.typography.bodyMedium.copy(fontSize = 15.sp),
            color = Color(0xFF370446)
        )
        Text(
            text = "Phone: $phoneNumber",
            style = MaterialTheme.typography.bodyMedium.copy(fontSize = 15.sp),
            color = Color(0xFFEDFAF5)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun KartuNamaPreview() {
    AplikasiKartuNamaTheme {
        KartuNama("Wildan Assyidiq", "Machine Learning Engineer", "wildan.assyidiq@students.utdi.ac.id", "081542929562")
    }
}