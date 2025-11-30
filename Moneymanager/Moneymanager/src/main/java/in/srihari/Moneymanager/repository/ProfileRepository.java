package in.srihari.Moneymanager.repository;

import in.srihari.Moneymanager.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<ProfileEntity,Long>{
    //This interface will automatically provide crud operations for profile entity
    Optional<ProfileEntity>findByEmail(String email);
    Optional<ProfileEntity>findByActivationToken(String Token);
}
