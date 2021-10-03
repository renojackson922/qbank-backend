DROP TABLE IF EXISTS quiz, question, answer;

CREATE TABLE quiz (
      uuid              VARCHAR(255) NOT NULL
    , q_name            VARCHAR(500) NOT NULL
    , author            VARCHAR(100) NOT NULL
    , frst_regist_dttm  DATETIME
    , frst_regist_id    VARCHAR(255)
    , frst_regist_ip    VARCHAR(255)
    , frst_regist_info  VARCHAR(1000)
    , updt_dttm         DATETIME
    , updt_id           VARCHAR(255)
    , updt_ip           VARCHAR(255)
    , updt_info         VARCHAR(1000)
    , PRIMARY KEY (`uuid`)
);

CREATE TABLE question (
      uuid                  VARCHAR(255) NOT NULL
    , qid                   INT AUTO_INCREMENT
    , quiz_type             INT(1) NOT NULL
    , multi_yn              VARCHAR(1) DEFAULT('N')
    , min_length            INT NOT NULL
    , max_length            INT NOT NULL
    , question              VARCHAR(2000) NOT NULL
    , example_type          INT(1) NOT NULL
    , example_text          VARCHAR(2000) NOT NULL
    , frst_regist_dttm      DATETIME
    , frst_regist_id        VARCHAR(255)
    , frst_regist_ip        VARCHAR(255)
    , frst_regist_info      VARCHAR(1000)
    , updt_dttm             DATETIME
    , updt_id               VARCHAR(255)
    , updt_ip               VARCHAR(255)
    , updt_info             VARCHAR(1000)
    , FOREIGN KEY (`uuid`) REFERENCES `quiz`(`uuid`)
);

CREATE TABLE question_example_filepath (
      qid               INT
    , file_name         VARCHAR(1000)     NOT NULL
    , file_ext          VARCHAR(10)       NOT NULL
    , file_type         VARCHAR(100)      NOT NULL
    , file_size         INT               NOT NULL
    , use_at            VARCHAR(1)
    , frst_regist_dttm  DATETIME
    , frst_regist_id    VARCHAR(255)
    , frst_regist_ip    VARCHAR(255)
    , frst_regist_info  VARCHAR(1000)
    , updt_dttm         DATETIME
    , updt_id           VARCHAR(255)
    , updt_ip           VARCHAR(255)
    , updt_info         VARCHAR(1000)
    , FOREIGN KEY (`qid`) REFERENCES `question`(`qid`)

);

CREATE TABLE answer (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL
);
