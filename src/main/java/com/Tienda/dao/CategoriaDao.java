
package com.Tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Tienda.domain.Categoria;

public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    //Mas adelante, vamos a tener métodos ampliados
    
}
