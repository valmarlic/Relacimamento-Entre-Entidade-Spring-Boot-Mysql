package com.exemplo03manytomany.Exemplo03manytomany;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.exemplo03manytomany.Exemplo03manytomany.modelo.Aluno;
import com.exemplo03manytomany.Exemplo03manytomany.modelo.Curso;
import com.exemplo03manytomany.Exemplo03manytomany.repositorio.AlunoRepositorio;
import com.exemplo03manytomany.Exemplo03manytomany.repositorio.CursoRepositorio;

@SpringBootApplication
public class Exemplo03manytomanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(Exemplo03manytomanyApplication.class, args);
	}
	@Bean
	public CommandLineRunner mappingDemo(AlunoRepositorio ar, CursoRepositorio cr) {
		return args -> {
	
			// Criar um aluno
			Aluno aluno = new Aluno();
			aluno.setAluno("Ralf");
	
			// Cadastrar na tabela alunos
			ar.save(aluno);
	
			// Criar três cursos
			Curso c1 = new Curso();
			c1.setCurso("Java - Spring Boot");
	
			Curso c2 = new Curso();
			c2.setCurso("Python - Flask");
	
			Curso c3 = new Curso();
			c3.setCurso("PHP - Laravel");
	
			// Cadastrar os cursos na tabela cursos
			cr.saveAll(Arrays.asList(c1, c2, c3));
	
			// Adicionar os primeiro e o terceiro curso no aluno
			aluno.getCursos().addAll(Arrays.asList(c1, c3));
	
			// Atualizar a lista de cursos do aluno
			ar.save(aluno);
		};
	}
}
