package lk.ac.mrt.fit.library_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.ac.mrt.fit.library_api.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
