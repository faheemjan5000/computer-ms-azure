package faheem.microservices.computer.ms.repository;

import faheem.microservices.computer.ms.model.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepository extends JpaRepository<Computer,Integer> {
}
