package com.example.questtugaslayout_0197

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Act4(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(R.color.background_app))
            .padding(horizontal = 16.dp)
            .padding(top = 65.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = stringResource(R.string.Prodi),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.text_dark)
        )

        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = stringResource(R.string.Univ),
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.text_dark)
        )

        Spacer(modifier = Modifier.height(25.dp))

        ProfileCard(
            nama = stringResource(R.string.profile_farhan_name),
            informasi = stringResource(R.string.profile_farhan_address),
            warnaKartu = colorResource(R.color.card_gray),
            warnaNama = colorResource(R.color.text_white),
            warnaInformasi = colorResource(R.color.text_yellow),
            namaBergaya = true
        )
        Spacer(modifier = Modifier.height(12.dp))

        ProfileCard(
            nama = stringResource(R.string.profile_ijul_name),
            informasi = stringResource(R.string.profile_ijul_phone),
            alamat = stringResource(R.string.profile_ijul_address),
            warnaKartu = colorResource(R.color.card_purple),
            warnaNama = colorResource(R.color.text_white),
            warnaInformasi = colorResource(R.color.text_cyan)
        )
        Spacer(modifier = Modifier.height(12.dp))

        ProfileCard(
            nama = stringResource(R.string.profile_apdan_name),
            informasi = stringResource(R.string.profile_apdan_phone),
            alamat = stringResource(R.string.profile_apdan_address),
            warnaKartu = colorResource(R.color.card_blue),
            warnaNama = colorResource(R.color.text_white),
            warnaInformasi = colorResource(R.color.text_cyan)
        )
        Spacer(modifier = Modifier.height(12.dp))

        ProfileCard(
            nama = stringResource(R.string.profile_pajar_name),
            informasi = stringResource(R.string.profile_pajar_phone),
            alamat = stringResource(R.string.profile_pajar_address),
            warnaKartu = colorResource(R.color.card_green),
            warnaNama = colorResource(R.color.text_white),
            warnaInformasi = colorResource(R.color.text_white)
        )
        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = stringResource(R.string.copyright),
            color = colorResource(R.color.text_dark),
            fontSize = 10.sp,
            modifier = Modifier.padding(bottom = 8.dp)
        )
    }
}

@Composable
fun ProfileCard(
    nama: String,
    informasi: String,
    warnaKartu: Color,
    warnaNama: Color,
    warnaInformasi: Color,
    alamat: String = "",
    namaBergaya: Boolean = false
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(
            containerColor = warnaKartu
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.images),
                contentDescription = stringResource(R.string.logo_description),
                modifier = Modifier.size(65.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = nama,
                    fontSize = if (namaBergaya) 19.sp else 20.sp,
                    fontWeight = if (namaBergaya) {
                        FontWeight.Normal
                    } else {
                        FontWeight.Bold
                    },
                    fontFamily = if (namaBergaya) {
                        FontFamily.Cursive
                    } else {
                        FontFamily.Default
                    },
                    color = warnaNama,
                    maxLines = 1
                )

                Text(
                    text = informasi,
                    fontSize = 13.sp,
                    color = warnaInformasi,
                    modifier = Modifier.padding(top = 2.dp),
                    maxLines = 1
                )

                if (alamat.isNotEmpty()) {
                    Text(
                        text = alamat,
                        fontSize = 13.sp,
                        color = colorResource(R.color.text_yellow),
                        modifier = Modifier.padding(top = 5.dp),
                        maxLines = 1
                    )
                }
            }

            Spacer(modifier = Modifier.width(8.dp))

            Image(
                painter = painterResource(R.drawable.images),
                contentDescription = stringResource(R.string.logo_description),
                modifier = Modifier.size(65.dp)
            )
        }
    }
}



