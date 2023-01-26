-- -----------------------------------------------------
-- Data `ACCOUNT`
-- -----------------------------------------------------
INSERT INTO ACCOUNT (ACCOUNT_ID, EMAIL)
VALUES (2, 'honggil@korea.com');
INSERT INTO ACCOUNT (ACCOUNT_ID, EMAIL)
VALUES (3, 'gamchan@korea.com');
INSERT INTO ACCOUNT (ACCOUNT_ID, EMAIL)
VALUES (4, 'general@korea.com');
INSERT INTO ACCOUNT (ACCOUNT_ID, EMAIL)
VALUES (5, 'mountain@korea.com');
-- -----------------------------------------------------
-- Data `PRODUCT`
-- -----------------------------------------------------
INSERT INTO PRODUCT (PRODUCT_ID, PRODUCT_NAME, PRICE)
VALUES (1, '서울 스튜디오', '300000');
INSERT INTO PRODUCT (PRODUCT_ID, PRODUCT_NAME, PRICE)
VALUES (2, '인천 스튜디오', '150000');
INSERT INTO PRODUCT (PRODUCT_ID, PRODUCT_NAME, PRICE)
VALUES (3, '부천 스튜디오', '180000');
INSERT INTO PRODUCT (PRODUCT_ID, PRODUCT_NAME, PRICE)
VALUES (4, '수원 스튜디오', '120000');
-- -----------------------------------------------------
-- Data `RESERVE`
-- -----------------------------------------------------
INSERT INTO RESERVE(PRODUCT_ID, ACCOUNT_ID, RESERVE_FROM, RESERVE_TO, CREATED_AT, UPDATED_AT)
VALUES ('1', '2', NOW(), NOW(), NOW(), null);
INSERT INTO RESERVE(PRODUCT_ID, ACCOUNT_ID, RESERVE_FROM, RESERVE_TO, CREATED_AT, UPDATED_AT)
VALUES ('2', '3', NOW(), NOW(), NOW(), null);
INSERT INTO RESERVE(PRODUCT_ID, ACCOUNT_ID, RESERVE_FROM, RESERVE_TO, CREATED_AT, UPDATED_AT)
VALUES ('3', '4', NOW(), NOW(), NOW(), null);
INSERT INTO RESERVE(PRODUCT_ID, ACCOUNT_ID, RESERVE_FROM, RESERVE_TO, CREATED_AT, UPDATED_AT)
VALUES ('4', '2', NOW(), NOW(), NOW(), null);