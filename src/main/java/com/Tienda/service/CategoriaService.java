
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    //Método que retona la lista de categorias
    public List<Categoria> getCategorias(boolean activos);
}
