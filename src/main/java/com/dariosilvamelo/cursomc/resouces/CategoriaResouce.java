package com.dariosilvamelo.cursomc.resouces;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dariosilvamelo.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResouce {
	
    @RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
    	
    	Categoria c1 = new  Categoria(1,"Informartica");
       	Categoria c2 = new  Categoria(2,"Escritorio");
       	
       	List<Categoria> list = new ArrayList<>();
       	
       	list.add(c1);
       	list.add(c2);

       	return list;
    }

}
