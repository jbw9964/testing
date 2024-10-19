package core.testing;

import org.springframework.data.jpa.repository.*;

public interface JPATestRepo extends JpaRepository<TestEntity, Long> {

}
