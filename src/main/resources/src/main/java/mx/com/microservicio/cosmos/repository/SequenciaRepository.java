package mx.com.microservicio.cosmos.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;

import mx.com.microservicio.cosmos.entity.SequenciaEntity;

public interface SequenciaRepository extends CosmosRepository<SequenciaEntity, String> {

}
