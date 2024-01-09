INSERT INTO tb_competencias (id, nome) VALUES (1, 'Python');
INSERT INTO tb_competencias (id, nome) VALUES (2, 'Java');
INSERT INTO tb_competencias (id, nome) VALUES (3, 'Eclipse');
INSERT INTO tb_competencias (id, nome) VALUES (4, 'JavaScript');
INSERT INTO tb_competencias (id, nome) VALUES (5, 'HTML');
INSERT INTO tb_competencias (id, nome) VALUES (6, 'CSS');
INSERT INTO tb_competencias (id, nome) VALUES (7, 'React');
INSERT INTO tb_competencias (id, nome) VALUES (8, 'Node.js');
INSERT INTO tb_competencias (id, nome) VALUES (9, 'SQL');
INSERT INTO tb_competencias (id, nome) VALUES (10, 'Git');
INSERT INTO tb_competencias (id, nome) VALUES (11, 'Linux');
INSERT INTO tb_competencias (id, nome) VALUES (12, 'Shell Scripting');
INSERT INTO tb_competencias (id, nome) VALUES (13, 'Docker');
INSERT INTO tb_competencias (id, nome) VALUES (14, 'Kubernetes');
INSERT INTO tb_competencias (id, nome) VALUES (15, 'RESTful API');
INSERT INTO tb_competencias (id, nome) VALUES (16, 'JSON');
INSERT INTO tb_competencias (id, nome) VALUES (17, 'Maven');
INSERT INTO tb_competencias (id, nome) VALUES (18, 'Spring Framework');
INSERT INTO tb_competencias (id, nome) VALUES (19, 'Agile Methodologies');
INSERT INTO tb_competencias (id, nome) VALUES (20, 'DevOps');


INSERT INTO tb_empregos (nome, descricao) VALUES ('Desenvolvedor Full Stack', 'Responsável pelo desenvolvimento de aplicações web, atuando tanto no front-end quanto no back-end.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('Engenheiro de Redes', 'Projetar, implementar e gerenciar redes de computadores, garantindo a comunicação eficiente e segura dos sistemas.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('Analista de Segurança da Informação', 'Avaliar e implementar medidas de segurança para proteger sistemas e dados contra ameaças cibernéticas.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('Arquiteto de Soluções Cloud', 'Projetar e implementar arquiteturas de soluções em ambientes de computação em nuvem.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('Cientista de Dados', 'Analisar grandes conjuntos de dados para extrair insights e apoiar a tomada de decisões baseada em dados.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('Analista de Banco de Dados', 'Gerenciar e otimizar bancos de dados, garantindo a integridade e eficiência no armazenamento de informações.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('Administrador de Sistemas', 'Manter e administrar servidores e sistemas operacionais para garantir o funcionamento adequado da infraestrutura.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('Especialista em Integração de Sistemas', 'Integrar diferentes sistemas para garantir a interoperabilidade e eficiência das operações empresariais.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('UX/UI Designer', 'Projetar interfaces de usuário intuitivas e atraentes, focando na experiência do usuário.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('Analista de Business Intelligence', 'Coletar, analisar e apresentar dados para auxiliar na tomada estratégica de decisões empresariais.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('Engenheiro de Software', 'Desenvolver e manter software, participando de todo o ciclo de vida do desenvolvimento.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('Analista de Qualidade de Software', 'Garantir a qualidade dos produtos de software por meio de testes e análises rigorosas.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('Especialista em Virtualização', 'Implementar e gerenciar ambientes virtualizados para otimizar recursos e facilitar a administração de servidores.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('Analista de Suporte Técnico', 'Prestar suporte técnico a usuários, solucionando problemas relacionados a hardware, software e redes.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('Scrum Master', 'Facilitar e liderar equipes de desenvolvimento ágil, seguindo a metodologia Scrum.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('Analista de Redes Sociais', 'Gerenciar a presença online de uma empresa, monitorando e interagindo nas redes sociais.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('Engenheiro de Machine Learning', 'Desenvolver algoritmos e modelos de machine learning para análise de dados e automação de processos.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('Especialista em Segurança de Aplicações', 'Identificar e corrigir vulnerabilidades em aplicações para garantir a segurança da informação.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('Administrador de Banco de Dados NoSQL', 'Gerenciar bancos de dados NoSQL, como MongoDB, para armazenamento eficiente de dados não estruturados.');
INSERT INTO tb_empregos (nome, descricao) VALUES ('Administrador de Banco de Dados NoSQL', 'Gerenciar bancos de dados NoSQL, como MongoDB, para armazenamento eficiente de dados não estruturados.');




INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (1, 1);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (2, 2);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (3, 19);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (4, 7);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (5, 16);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (6, 5);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (7, 12);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (8, 14);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (9, 11);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (10, 20);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (11, 4);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (12, 15);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (13, 8);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (14, 3);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (15, 10);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (16, 6);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (17, 18);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (18, 13);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (19, 17);
INSERT INTO tb_empregos_competencias (emprego_id, competencias_id) VALUES (20, 9);

