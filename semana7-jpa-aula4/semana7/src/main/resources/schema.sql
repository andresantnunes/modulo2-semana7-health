
DROP TABLE filial CASCADE;
CREATE TABLE filial {
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(300),
    localizacao VARCHAR(300),
    anosServico INT
};