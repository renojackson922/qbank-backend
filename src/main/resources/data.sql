DROP TABLE IF EXISTS quiz, question, answer;

CREATE TABLE `quiz` (
                        `id` bigint(20) NOT NULL AUTO_INCREMENT,
                        `quiz_uuid` varchar(36) NOT NULL,
                        `quiz_name` varchar(255) NOT NULL,
                        `user_id` bigint(20) NOT NULL,
                        `try_cnt` mediumint(6) DEFAULT 0,
                        `finish_cnt` mediumint(6) DEFAULT 0,
                        `reviewed_cnt` mediumint(6) DEFAULT 0,
                        `start_at` datetime(3) NOT NULL,
                        `end_at` datetime(3) DEFAULT NULL,
                        `created_at` datetime(3) DEFAULT current_timestamp(3),
                        `updated_at` datetime(3) DEFAULT current_timestamp(3),
                        `deleted_at` datetime(3) DEFAULT NULL,
                        PRIMARY KEY (`id`),
                        UNIQUE KEY `quid_uuid` (`quiz_uuid`)
);
-- ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

INSERT INTO quiz
(quiz_uuid, quiz_name, user_id, try_cnt, finish_cnt, reviewed_cnt, start_at, end_at, created_at, updated_at, deleted_at)
VALUES('487c2c68-7b4e-4bdb-a7a9-60ca1330663b', '테스트퀴즈', 1, 0, 0, 0, '2022-01-29 18:09:44.908', NULL, '2022-01-29 18:10:00.022', '2022-01-29 18:10:03.141', NULL);


CREATE TABLE question (
                          id            bigint(20) auto_increment,
                          quiz_uuid     varchar(36) not null,
                          quiz_type     tinyint	default(1),
                          multi_yn	    bit	default(0),
                          min_length    mediumint(4) default(0),
                          max_length	mediumint(4) default(0),
                          question      varchar(1024) not null,
                          example_type  tinyint default(1),
                          example_text  text null,
                          created_at    datetime(3) default(now()),
                          updated_at    datetime(3) default(now()),
                          deleted_at    datetime(3) null,
                          primary key(`id`)
);




CREATE TABLE answer (
                        id          bigint(20) auto_increment,
                        quiz_uuid   varchar(36) not null,
                        quiz_type   tinyint	default(1),
                        answer    varchar(1024) not null,
                        created_at   datetime(3) default(now()),
                        updated_at   datetime(3) default(now()),
                        deleted_at   datetime(3) null,
                        primary key(`id`)
);



-- CREATE TABLE quiz (
--       uuid              VARCHAR(255) NOT NULL
--     , q_name            VARCHAR(500) NOT NULL
--     , author            VARCHAR(100) NOT NULL
--     , frst_regist_dttm  DATETIME
--     , frst_regist_id    VARCHAR(255)
--     , frst_regist_ip    VARCHAR(255)
--     , frst_regist_info  VARCHAR(1000)
--     , updt_dttm         DATETIME
--     , updt_id           VARCHAR(255)
--     , updt_ip           VARCHAR(255)
--     , updt_info         VARCHAR(1000)
--     , PRIMARY KEY (`uuid`)
-- );
--
-- CREATE TABLE question (
--       uuid                  VARCHAR(255) NOT NULL
--     , qid                   INT AUTO_INCREMENT
--     , quiz_type             INT(1) NOT NULL
--     , multi_yn              VARCHAR(1) DEFAULT('N')
--     , min_length            INT NOT NULL
--     , max_length            INT NOT NULL
--     , question              VARCHAR(2000) NOT NULL
--     , example_type          INT(1) NOT NULL
--     , example_text          VARCHAR(2000) NOT NULL
--     , frst_regist_dttm      DATETIME
--     , frst_regist_id        VARCHAR(255)
--     , frst_regist_ip        VARCHAR(255)
--     , frst_regist_info      VARCHAR(1000)
--     , updt_dttm             DATETIME
--     , updt_id               VARCHAR(255)
--     , updt_ip               VARCHAR(255)
--     , updt_info             VARCHAR(1000)
--     , FOREIGN KEY (`uuid`) REFERENCES `quiz`(`uuid`)
-- );
--
-- CREATE TABLE question_example_filepath (
--       qid               INT
--     , file_name         VARCHAR(1000)     NOT NULL
--     , file_ext          VARCHAR(10)       NOT NULL
--     , file_type         VARCHAR(100)      NOT NULL
--     , file_size         INT               NOT NULL
--     , use_at            VARCHAR(1)
--     , frst_regist_dttm  DATETIME
--     , frst_regist_id    VARCHAR(255)
--     , frst_regist_ip    VARCHAR(255)
--     , frst_regist_info  VARCHAR(1000)
--     , updt_dttm         DATETIME
--     , updt_id           VARCHAR(255)
--     , updt_ip           VARCHAR(255)
--     , updt_info         VARCHAR(1000)
--     , FOREIGN KEY (`qid`) REFERENCES `question`(`qid`)
--
-- );
--
-- CREATE TABLE answer (
--   id INT AUTO_INCREMENT  PRIMARY KEY,
--   first_name VARCHAR(250) NOT NULL,
--   last_name VARCHAR(250) NOT NULL,
--   career VARCHAR(250) DEFAULT NULL
-- );
