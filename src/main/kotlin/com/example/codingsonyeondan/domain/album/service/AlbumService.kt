package com.example.codingsonyeondan.domain.album.service

import com.example.codingsonyeondan.domain.album.dto.AlbumCreateDTO
import com.example.codingsonyeondan.domain.album.dto.AlbumDTO
import com.example.codingsonyeondan.domain.album.dto.AlbumModifyDTO
import com.example.codingsonyeondan.domain.album.model.Album
import com.example.codingsonyeondan.domain.image.model.Image
import org.springframework.web.multipart.MultipartFile

interface AlbumService {

    fun getAlbum(albumId: Long): AlbumDTO
    fun createAlbum(albumCreateDTO: AlbumCreateDTO, image: MultipartFile?) : AlbumDTO
    fun modifyAlbum(albumId: Long, albumModifyDTO: AlbumModifyDTO) : AlbumDTO
    fun deleteAlbum(albumId: Long)
}