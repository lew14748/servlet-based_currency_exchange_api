package study.project.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRate {
        private int id;
        private Currency baseCurrencyId;
        private Currency targetCurrencyId;
        private BigDecimal rate;

        public ExchangeRate(Currency baseCurrencyId, Currency targetCurrencyId, BigDecimal rate) {
            this.baseCurrencyId = baseCurrencyId;
            this.targetCurrencyId = targetCurrencyId;
            this.rate = rate;
        }
}
