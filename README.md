# Documentação da API de Empregos

## Introdução

Esta documentação detalha as funcionalidades da API de Empregos, uma ferramenta projetada para facilitar o gerenciamento e a procura de oportunidades de emprego. A API oferece funcionalidades chave para criação, consulta, atualização e remoção de vagas, com foco na eficiência e facilidade de uso.

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

#### Endpoint:
```
GET /empregos/alljobs
```

#### Detalhes:
Este endpoint retorna uma lista paginada de vagas, com um máximo de 20 vagas por requisição. É ideal para visualizar todas as oportunidades disponíveis de forma organizada e eficiente.

#### Resposta Esperada:
Lista paginada de vagas disponíveis, incluindo informações detalhadas de cada vaga.

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

Desenvolvi a API de Empregos para aprimorar meus conhecimentos em APIs REST com Java, proporcionando uma plataforma abrangente para administração de oportunidades de trabalho.
