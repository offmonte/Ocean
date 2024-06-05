package br.com.fiap.ocean.repository;

import br.com.fiap.ocean.entity.Agua;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AguaRepository extends JpaRepository<Agua, Long> {
}
