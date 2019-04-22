package kr.hs.dgsw.spring_mini_blog.repository;

import kr.hs.dgsw.spring_mini_blog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByAccountAndPassword(String account, String password);
}
