package com.cinnamon.proplayer;


public class News {

    Integer foto;
    String titulo;
    String descripcion;


    public News(Integer foto, String titulo) {
        this.foto = foto;
        this.titulo = titulo;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
