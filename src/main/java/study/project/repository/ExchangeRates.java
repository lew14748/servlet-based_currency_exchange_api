package study.project.repository;

import study.project.model.ExchangeRate;

import java.util.List;
import java.util.Optional;

public interface ExchangeRates extends BaseRepository<ExchangeRate> {
    Optional<ExchangeRate> findByCurrencyCodes(String srcCurrencyCode, String tgtCurrencyCode);
    List<ExchangeRate> findByCodesViaUSD(String srcCurrencyCode, String tgtCurrencyCode);
}
