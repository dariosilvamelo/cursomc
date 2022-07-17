package com.dariosilvamelo.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dariosilvamelo.cursomc.domain.Categoria;
import com.dariosilvamelo.cursomc.domain.Produto;
import com.dariosilvamelo.cursomc.repositores.CategoriaRepository;
import com.dariosilvamelo.cursomc.repositores.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;	

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	
		Categoria cat01 = new Categoria(null,"Informatica");
		Categoria cat02 = new Categoria(null,"Escritorio");
		
		Produto p1 = new Produto(null,"Computador",2000.00);
		Produto p2 = new Produto(null,"Impressora",800.00);		
		Produto p3 = new Produto(null,"Mouse",2000.00);
		
		
		cat01.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat02.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat01));
		p2.getCategorias().addAll(Arrays.asList(cat01,cat02));
		p3.getCategorias().addAll(Arrays.asList(cat01));

		categoriaRepository.saveAll(Arrays.asList(cat01, cat02));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		 
	}

}
