CREATE TABLE IF NOT EXISTS currencies (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    code VARCHAR NOT NULL CHECK ( LENGTH(code) = 3),
    full_name VARCHAR NOT NULL,
    sign VARCHAR
);

CREATE TABLE IF NOT EXISTS exchange_rates (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    base_currency INTEGER NOT NULL,
    target_currency INTEGER NOT NULL,
    rate DECIMAL(6),
    UNIQUE (base_currency, target_currency),
    FOREIGN KEY (base_currency) REFERENCES currencies(id),
    FOREIGN KEY (target_currency) REFERENCES currencies(id)
);