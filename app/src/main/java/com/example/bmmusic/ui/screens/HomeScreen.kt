package com.example.bmmusic.ui.screens

import MediaPlayerCard
import SongsList
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bmmusic.data.Song
import com.example.bmmusic.data.songsList
@Composable
fun HomeScreen(songsList: List<Song>) {
    var selectedSong by remember { mutableStateOf<Song?>(null) }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White)
    ) {
        SongsList(songsList = songsList, onSongSelected = { song ->
            selectedSong = song
        })
        selectedSong?.let {
            MediaPlayerCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
                    .background(Color.Transparent),
                it
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        songsList = songsList
    )
}
