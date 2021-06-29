package id.jwt.refreshtoken.repository;

import id.jwt.refreshtoken.entity.ERole;
import id.jwt.refreshtoken.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
