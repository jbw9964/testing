package core.testing;

import org.springframework.stereotype.*;

@Repository
public class JPATestRepoImpl implements TestRepo {

    private final JPATestRepo jpaRepo;

    public JPATestRepoImpl(JPATestRepo jpaRepo) {
        this.jpaRepo = jpaRepo;
    }
}
