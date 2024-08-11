# DROP TABLE IF EXISTS cc_course;
#
# CREATE TABLE cc_course (
#                            cls_no INT AUTO_INCREMENT PRIMARY KEY,
#                            cls_name VARCHAR(255) NOT NULL,
#                            open_date DATE NOT NULL,
#                            close_date DATE NOT NULL,
#                            cls_intro TEXT NOT NULL,
#                            cls_prof VARCHAR(255) NOT NULL
# );

INSERT INTO cc_course (cls_name, open_date, close_date, cls_intro, cls_prof) VALUES
                                                                                          ('뜨개질 고수로 한걸음', '2024-05-09', '2024-12-16', '뜨개질 입문을 해보아요', 'Professor.B'),
                                                                                          ('핸드 드립 브루잉', '2024-05-09', '2024-12-16', '핸드 드립 기초부터 마스터까지 완벽 정복!', 'Dr.J'),
                                                                                          ('두근두근 게임 소프트웨어 만들기', '2024-05-09', '2024-12-16', '어떤 프로그램이든 간편하고 쉽게 만들어봅시다!', 'Dr. Lee'),
                                                                                          ('간편 시 노래 창작', '2024-05-09', '2024-12-16', '아아~~ 모두 같이 음유시인이 되어봐요❤', '황춘식'),
                                                                                          ('상상력 자극 가상체험', '2024-05-09', '2024-12-16', 'Understand database design and SQL.', '앙리 3세');
