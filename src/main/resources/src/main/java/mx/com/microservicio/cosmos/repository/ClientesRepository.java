package mx.com.microservicio.cosmos.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;

import mx.com.microservicio.cosmos.entity.ClientesEntity;

public interface ClientesRepository extends CosmosRepository<ClientesEntity, String>{

}
