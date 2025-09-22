-- Data initialization for H2 in‑memory database
-- Runs on startup via spring.sql.init.* properties

INSERT INTO USERS (id, username, password) VALUES (1, 'admin', 'admin');
INSERT INTO USERS (id, username, password) VALUES (2, 'u', 'p');
INSERT INTO USERS (id, username, password) VALUES (3, 'user', 'password');

