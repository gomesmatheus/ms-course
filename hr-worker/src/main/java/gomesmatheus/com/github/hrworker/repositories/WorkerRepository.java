package gomesmatheus.com.github.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gomesmatheus.com.github.hrworker.entities.Worker;


public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
