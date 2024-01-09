# Documentação da API de Empregos

## Introdução

Esta documentação detalha as funcionalidades da API de Empregos, ideal para a gestão e procura de vagas de emprego. A API oferece operações essenciais como criação, consulta detalhada, atualização e remoção de vagas.

## Funcionalidades e Respostas da API

### 1. Criação de Vagas (POST)

#### Endpoint:
```
POST /empregos
```

#### Exemplo de Corpo da Requisição:
```json
{
  "nome": "Desenvolvedor Front-end",
  "descricao": "Desenvolver interfaces de usuário...",
  "competencias": [
    {"id": 3, "nome": "JavaScript"}
  ]
}
```

#### Resposta Esperada:
Confirmação da criação da vaga.

### 2. Consulta de Vagas (GET)

#### Endpoint para Listagem Completa:
```
GET /empregos/alljobs
```

#### Detalhes:
Retorna uma lista paginada de vagas, com um máximo de 20 vagas por requisição.

#### Endpoint para Detalhes da Vaga:
```
GET /empregos/{id}
```

#### Detalhes:
Retorna os detalhes de uma vaga específica, usando o ID da vaga como parâmetro.

#### Exemplo de Uso:
```
GET /empregos/123
```

#### Resposta Esperada:
```json
{
  "nome": "Desenvolvedor Front-end",
  "descricao": "Desenvolver interfaces de usuário...",
  "competencias": [
    {"id": 3, "nome": "JavaScript"}
  ]
}
```

### 3. Atualização de Vagas (PUT)

#### Endpoint:
```
PUT /empregos/{id}
```

#### Exemplo de Corpo da Requisição para Atualização:
```json
{
  "id": 12,
  "nome": "Analista de Qualidade de Software",
  "descricao": "Garantir a qualidade dos produtos de software por meio de testes e análises rigorosas.",
  "competencias": [
    {"id": 7, "nome": "React"}
  ]
}
```

#### Resposta Esperada:
Confirmação da atualização da vaga.

### 4. Remoção de Vagas (DELETE)

#### Endpoint:
```
DELETE /empregos/{id}
```

#### Resposta Esperada:
Confirmação da remoção da vaga.

## Conclusão

Desenvolvida para aprimorar conhecimentos em APIs REST com Java, a API de Empregos é uma plataforma abrangente para a administração de oportunidades de trabalho, conectando empresas e candidatos de forma eficaz. Para mais informações, acesse nossa [documentação completa](#).
