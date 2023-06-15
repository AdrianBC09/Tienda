package com.Tienda.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    
    //version de serializacion
    private static final serialversionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long idCtaegoria;//se transforma en id_categoria
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Categoria() {
    }
    
    
   public Categoria(String descripcion, String rutaImagen, boolean activo){
       this.descripcion = descripcion;
       this.rutaImagen = rutaImagen;
   }
}