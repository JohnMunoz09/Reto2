package reto.mintic.ciclo4.Reto.Interface;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import reto.mintic.ciclo4.Reto.Model.Supplement;

import java.util.Optional;


public interface InterfaceSupplement extends MongoRepository<Supplement, String> {

    Optional<Supplement> findByReference(String reference);
}
