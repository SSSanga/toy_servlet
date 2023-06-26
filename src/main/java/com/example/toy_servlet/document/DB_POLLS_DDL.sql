
CREATE TABLE CHOICE
(
  CHOICE_ID VARCHAR(50) NOT NULL COMMENT '설문 답항 코드',
  CHOICE    VARCHAR(50) NOT NULL COMMENT '설문 답항',
  PRIMARY KEY (CHOICE_ID)
) COMMENT '설문 답항 ';

CREATE TABLE QUESTION_CHOICE 
(
  QUESTIONS_ID VARCHAR(50) NOT NULL COMMENT '설문 문항 코드',
  CHOICE_ID    VARCHAR(50) NOT NULL COMMENT '설문 답항 코드'
) COMMENT '문답';

CREATE TABLE QUESTIONS
(
  QUESTIONS    VARCHAR(50) NOT NULL COMMENT '설문 문항',
  QUESTIONS_ID VARCHAR(50) NOT NULL COMMENT '설문 문항 코드',
  PRIMARY KEY (QUESTIONS_ID)
) COMMENT '설문 문항';

CREATE TABLE RESPONDENTS
(
  RESPONDENTS    VARCHAR(50) NOT NULL COMMENT '설문자',
  PASSWORD       VARCHAR(50) NOT NULL COMMENT '비밀번호',
  RESPONDENTS_ID VARCHAR(50) NOT NULL COMMENT '설문자 코드',
  PRIMARY KEY (RESPONDENTS_ID)
) COMMENT '설문자';

CREATE TABLE STATISTICS
(
  STATISTICS_ID  VARCHAR(50) NOT NULL COMMENT '설문 통계 코드',
  RESPONDENTS_ID VARCHAR(50) NOT NULL COMMENT '설문자 코드',
  QUESTIONS_ID   VARCHAR(50) NOT NULL COMMENT '설문 문항 코드',
  CHOICE_ID      VARCHAR(50) NOT NULL COMMENT '설문 답항 코드',
  PRIMARY KEY (STATISTICS_ID)
) COMMENT '설문 통계';

ALTER TABLE STATISTICS
  ADD CONSTRAINT FK_RESPONDENTS_TO_STATISTICS
    FOREIGN KEY (RESPONDENTS_ID)
    REFERENCES RESPONDENTS (RESPONDENTS_ID);

ALTER TABLE STATISTICS
  ADD CONSTRAINT FK_QUESTIONS_TO_STATISTICS
    FOREIGN KEY (QUESTIONS_ID)
    REFERENCES QUESTIONS (QUESTIONS_ID);

ALTER TABLE STATISTICS
  ADD CONSTRAINT FK_CHOICE_TO_STATISTICS
    FOREIGN KEY (CHOICE_ID)
    REFERENCES CHOICE (CHOICE_ID);

ALTER TABLE QUESTION_CHOICE 
  ADD CONSTRAINT FK_QUESTIONS_TO_QUESTION_CHOICE 
    FOREIGN KEY (QUESTIONS_ID)
    REFERENCES QUESTIONS (QUESTIONS_ID);

ALTER TABLE QUESTION_CHOICE 
  ADD CONSTRAINT FK_CHOICE_TO_QUESTION_CHOICE 
    FOREIGN KEY (CHOICE_ID)
    REFERENCES CHOICE (CHOICE_ID);
