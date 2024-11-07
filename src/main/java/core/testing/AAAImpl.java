package core.testing;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Repository
public class AAAImpl {

    @Autowired
    private AAA jpaRepo;
}
