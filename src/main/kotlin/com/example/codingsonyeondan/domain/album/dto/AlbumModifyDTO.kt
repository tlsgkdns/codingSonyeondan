package com.example.codingsonyeondan.domain.album.dto

import java.time.LocalDateTime

data class AlbumModifyDTO(
    val title: String,
    val artist: String,
    val releasedDate: LocalDateTime
)