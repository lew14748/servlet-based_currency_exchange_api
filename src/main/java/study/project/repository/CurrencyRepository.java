package study.project.repository;

import java.util.Currency;
import java.util.Optional;

public interface CurrencyRepository extends BaseRepository<Currency> {
    Optional<Currency> findByCode();
}
