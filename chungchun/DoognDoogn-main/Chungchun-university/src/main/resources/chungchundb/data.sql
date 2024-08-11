INSERT INTO cc_user (user_id, user_pwd, user_name, user_phone, user_auth) VALUES
                                                                              ('ADMIN', '$2a$10$Zo5VVleQRyPhtJTC1JZ3geu6o45qzK62hi2piCvq7YBEpzMyPRJJO', '홍길동', '010-1234-5678', 'ROLE_ADMIN'),
                                                                              ('user2', '$2a$10$Zo5VVleQRyPhtJTC1JZ3geu6o45qzK62hi2piCvq7YBEpzMyPRJJO', '김앙츄', '010-2345-6789', 'ROLE_USER'),
                                                                              ('user3', '$2a$10$Zo5VVleQRyPhtJTC1JZ3geu6o45qzK62hi2piCvq7YBEpzMyPRJJO', '삼패기', '010-3456-7890', 'ROLE_USER'),
                                                                              ('user4', '$2a$10$Zo5VVleQRyPhtJTC1JZ3geu6o45qzK62hi2piCvq7YBEpzMyPRJJO', '박지민', '010-4567-8901', 'ROLE_USER'),
                                                                              ('user5', '$2a$10$Zo5VVleQRyPhtJTC1JZ3geu6o45qzK62hi2piCvq7YBEpzMyPRJJO', '최민수', '010-5678-9012', 'ROLE_USER');

INSERT INTO cc_course (cls_name, open_date, close_date, cls_intro, cls_prof) VALUES
                                                                                 ('뜨개질 고수로 한걸음', '2024-05-09', '2024-12-16', '뜨개질 입문을 해보아요', 'Professor.B'),
                                                                                 ('핸드 드립 브루잉', '2024-05-09', '2024-12-16', '핸드 드립 기초부터 마스터까지 완벽 정복!', 'Dr.J'),
                                                                                 ('두근두근 게임 소프트웨어 만들기', '2024-05-09', '2024-12-16', '어떤 프로그램이든 간편하고 쉽게 만들어봅시다!', 'Dr. Lee'),
                                                                                 ('간편 시 노래 창작', '2024-05-09', '2024-12-16', '아아~~ 모두 같이 음유시인이 되어봐요❤', '황춘식'),
                                                                                 ('상상력 자극 가상체험', '2024-05-09', '2024-12-16', 'Understand database design and SQL.', '앙리 3세');

INSERT INTO cc_post (category_code, cls_no, post_title, post_content, post_create_date, user_no) VALUES
                                                                                                     ('자유', NULL, '러브코미디학과 송삼동 여자친구 있나요?', '안녕하세요. 산업디자인학과 김앙츄입니다. 러브코미디학과 송삼동 선배 여자친구 있을까요? 안경과 체크 셔츠가 너무 잘 어울려요!', '2024-05-17', 2),
                                                                                                     ('가상체험', 5, '이번 가상체험 실습 강추한다!', '이번 가상체험 실습 갔다온 평범한 3학년인데 진짜 의미있고 제대로 체험할 수 있는 찐 프로젝트임!', '2024-06-09', 4),
                                                                                                     ('뜨개질', 1, '이번 과목 시험 문제 밥 선생님이 내냐?', '1학년 패기 넘치는 삼패기인데 이번 시험 밥 교수님이라고 들은 것 같은데 큰일난 듯..', '2024-05-15', 3);

INSERT INTO cc_comment (cmt_content, user_no, post_no, cmt_create_date, cmt_up_date) VALUES
                                                                                         ('이 댓글은 첫 번째 댓글입니다.', 3, 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                                         ('이 댓글은 두 번째 댓글입니다.', 2, 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                                         ('이 댓글은 세 번째 댓글입니다.', 5, 2, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                                         ('이 댓글은 네 번째 댓글입니다.', 4, 2, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                                         ('이 댓글은 다섯 번째 댓글입니다.', 2, 3, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO cc_my_class (user_no, cls_no, score, add_count)
VALUES
    (2, 1, 92, 3),
    (2, 3, 88, 2),
    (3, 2, 80, 1),
    (3, 3, 75, 1),
    (4, 1, 88, 2),
    (4, 2, 82, 1),
    (5, 3, 90, 3),
    (5, 1, 85, 2);

INSERT INTO cc_like (create_date, delete_date, user_no, post_no) VALUES
                                                                     ('2024-05-16', NULL, 3, 1),
                                                                     ('2024-05-20', NULL, 2, 1),
                                                                     ('2024-06-08', '2024-06-09', 5, 2),
                                                                     (CURRENT_DATE, NULL, 3, 2),
                                                                     (CURRENT_DATE, NULL, 4, 3);


INSERT INTO cc_notice (user_no, noti_title, noti_content, noti_create_date, noti_up_date) VALUES
                                                                                              (5, '공지사항 제목 1', '공지사항 내용 1', '2024-05-20', '2024-06-20'),
                                                                                              (2, '공지사항 제목 2', '공지사항 내용 2', '2024-05-25', '2024-06-13'),
                                                                                              (4, '공지사항 제목 3', '공지사항 내용 3', '2024-05-27', '2024-06-12'),
                                                                                              (3, '공지사항 제목 4', '공지사항 내용 4', '2024-06-01', '2024-06-26'),
                                                                                              (2, '공지사항 제목 5', '공지사항 내용 5', '2024-06-03', '2024-06-24');