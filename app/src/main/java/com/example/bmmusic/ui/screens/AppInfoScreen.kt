package com.example.bmmusic.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.bmmusic.R
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight


@Composable
fun AppInfoScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(0.dp)
                .background(MaterialTheme.colorScheme.background)
        ) {
            // Teks penjelasan aplikasi musik
            HeadingText("Selamat datang di BM Music")
            Spacer(modifier = Modifier.height(4.dp))
            BodyText("BM Music adalah aplikasi inovatif yang dirancang untuk memaksimalkan pengalaman mendengarkan musik pengguna. Dengan fokus pada kepraktisan, BM Music memungkinkan pengguna untuk menikmati musik berdasarkan perpustakaan pribadi mereka. Dengan antarmuka yang ramah pengguna, aplikasi ini memungkinkan akses mudah dan cepat ke berbagai musik favorit pengguna, menjadikan pengalaman mendengarkan musik lebih personal dan menyenangkan.")
            Spacer(modifier = Modifier.height(4.dp))
            // Teks profil pembuat aplikasi
            Divider()
            SubheadingText("Profil Pembuat Aplikasi")
            Spacer(modifier = Modifier.height(4.dp))
            // Informasi Profil Pertama (Ahmad Rifai)

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.abc),
                    contentDescription = null,
                    modifier = Modifier
                        .size(160.dp, 120.dp)
                        .clip(MaterialTheme.shapes.medium)
                )

                SubheadingText("Aditya Putra Ramadhan")

                BodyText("2103421048")

                SubheadingText("Andafa Eka Octariano")

                BodyText("2103421009")

            }
        }
    }
}

@Composable
fun HeadingText(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold),
        modifier = Modifier.padding(bottom = 16.dp)
    )
}

@Composable
fun BodyText(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier.padding(bottom = 10.dp)
    )
}

@Composable
fun SubheadingText(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
        modifier = Modifier.padding(bottom = 3.dp)
    )
}

@Composable
fun ProfileInfo(name: String, nim: String, kelas: String, image: Painter) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .size(160.dp, 120.dp)
                .clip(MaterialTheme.shapes.medium)
        )

        SubheadingText(name)

        BodyText(nim)

        BodyText(kelas)
    }
}
