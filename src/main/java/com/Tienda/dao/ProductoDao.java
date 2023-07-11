package com.Tienda.dao;

import com.Tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

//DAO (data access object)
public interface ProductoDao extends JpaRepository<Producto, Long>{
    //Mas adelante vamos a tener metodos ampliados
} 