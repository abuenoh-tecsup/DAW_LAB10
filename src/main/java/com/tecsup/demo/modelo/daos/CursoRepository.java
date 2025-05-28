package com.tecsup.demo.modelo.daos;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.tecsup.demo.modelo.documents.Curso;

public interface CursoRepository extends MongoRepository<Curso, String> {
}
