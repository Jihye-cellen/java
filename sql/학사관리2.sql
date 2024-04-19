create table professors(
    pcode char(3) not null primary key,
    pname varchar(15) not null,
    dept varchar(30), 
    hiredate date, 
    title varchar(15), 
    salary int default 0
);
desc professors;

create table students(
 scode char(8) not null, 
 sname varchar(15) not null, 
 dept varchar(30), 
 year int default 1, 
 birthday date, 
 advisor char(3), 
 primary key(scode), foreign key(advisor) 
 references professors(pcode) 
);

desc students;

create table courses(
 lcode char(4) not null, 
 lname varchar(50) not null, 
 hours int, 
 room char(3), 
 instructor char(3), 
 capacity int default 0, 
 persons int default 0, 
 primary key(lcode), /* constraint child_pk foreign key(instructor) references professors(pcode) */
 foreign key(instructor) 
 references professors(pcode)
);

desc courses;

create table enrollments(
 lcode char(4) not null, 
 scode char(8) not null, 
 edate date, 
 grade int default 0, 
 primary key(lcode, scode), 
 foreign key(lcode) references courses(lcode), 
 foreign key(scode) references students(scode)
);

desc enrollments;


drop table enrollments;
drop table students;
drop table courses;
drop table professors;


insert into professors(pcode,pname,dept,hiredate,title,salary) values('221','이병렬','전산','75/04/03','정교수',3000000);
insert into professors(pcode,pname,dept,hiredate,title,salary) values('228','이재광','전산','91/09/19','부교수',2500000);
insert into professors(pcode,pname,dept,hiredate,title,salary) values('311','강승일','전자','94/06/09','부교수',2300000);
insert into professors(pcode,pname,dept,hiredate,title,salary) values('509','오문환','건축','92/10/14','조교수',2000000);

select * from professors;

insert into students(scode,sname,dept,year,birthday,advisor) values('92414029','서연우','전산',3,'73/10/06','228');
insert into students(scode,sname,dept,year,birthday,advisor) values('92414033','김창덕','전산',4,'73/10/26','221');
insert into students(scode,sname,dept,year,birthday,advisor) values('92514009','이지행','전자',4,'73/11/16','311');
insert into students(scode,sname,dept,year,birthday,advisor) values('92514023','김형명','전자',4,'73/08/29','311');
insert into students(scode,sname,dept,year,birthday,advisor) values('92454018','이원구','건축',3,'74/09/30','509');
insert into students(scode,sname,dept,year,birthday,advisor) values('95454003','이재영','건축',4,'76/02/06','509');
insert into students(scode,sname,dept,year,birthday,advisor) values('95414058','박혜경','전산',4,'76/03/12','221');
insert into students(scode,sname,dept,year,birthday,advisor) values('96414404','김수정','전산',3,'77/12/22','228');

select * from students;

insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('C301','파일처리론', 3 ,'506','221',100,80);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('C401','데이터베이스',3,'414','221',80,80);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('C421','알고리즘',3,'510','228',80,72);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('C312','자료구조',2,'510','228',100,60);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('E221','논리회로',3,'304','311',100,80);
insert into courses(lcode,lname,hours,room,instructor,capacity,persons) values('A109','한국의건축문화',2,'101','509',120,36);

select * from courses;

insert into enrollments(lcode, scode, edate, grade) values('C401','92414033','98/03/02',85);
insert into enrollments(lcode, scode, edate, grade) values('C301','92414033','98/03/02',80);
insert into enrollments(lcode, scode, edate, grade) values('C421','92414033','98/03/02', 0);
insert into enrollments(lcode, scode, edate, grade) values('C401','95414058','98/03/03',90);
insert into enrollments(lcode, scode, edate, grade) values('C301','95414058','98/03/03',80);
insert into enrollments(lcode, scode, edate, grade) values('C312','95414058','98/03/03',80);
insert into enrollments(lcode, scode, edate, grade) values('C401','92514023','98/03/03',70);
insert into enrollments(lcode, scode, edate, grade) values('C301','92514023','98/03/03',70);
insert into enrollments(lcode, scode, edate, grade) values('C421','92514023','98/03/03',70);
insert into enrollments(lcode, scode, edate, grade) values('C301','92414029','98/03/03',90);
insert into enrollments(lcode, scode, edate, grade) values('C421','92414029','98/03/03',0);
insert into enrollments(lcode, scode, edate, grade) values('C312','92414029','98/03/03',70);
insert into enrollments(lcode, scode, edate, grade) values('E221','92414029','98/03/03',75);
insert into enrollments(lcode, scode, edate, grade) values('A109','92414029','98/03/03',90);
insert into enrollments(lcode, scode, edate, grade) values('C301','92514009','98/03/03',70);
insert into enrollments(lcode, scode, edate, grade) values('C401','92514009','98/03/03',85);
insert into enrollments(lcode, scode, edate, grade) values('E221','92514009','98/03/03',85);
insert into enrollments(lcode, scode, edate, grade) values('C301','96414404','98/03/04',75);
insert into enrollments(lcode, scode, edate, grade) values('C401','96414404','98/03/04',75);
insert into enrollments(lcode, scode, edate, grade) values('C421','96414404','98/03/04',75);
insert into enrollments(lcode, scode, edate, grade) values('C312','92454018','98/03/04',90);
insert into enrollments(lcode, scode, edate, grade) values('E221','92454018','98/03/04',90);
insert into enrollments(lcode, scode, edate, grade) values('A109','95454003','98/03/05',85);
insert into enrollments(lcode, scode, edate, grade) values('C301','95454003','98/03/05',83);
insert into enrollments(lcode, scode, edate, grade) values('E221','95454003','98/03/05',75);

select count(*) from enrollments;

select * from professors;
select distinct dept from professors;

/*학생 테이블에서 '전산'이면서 '3'학년 학생들의 이름, 학번, 생년월일을 검색하시오. */
select sname, scode, birthday from students where dept='전산' and year='3';

select pname, dept, hiredate from professors where hiredate < = '1993/03/01';

select * from students where advisor != '221';

select lcode, scode, grade from enrollments where grade >= 80;

select lcode, lname, instructor, hours from courses where lname like '%건축%';

select lcode, scode, edate from enrollments where edate between '98/03/01' and '98/03/03'; 

select * from professors where title = '정교수' or title = '부교수';

select * from professors where title in ('정교수', '부교수');

select scode, sname, birthday from students where dept ='전산' order by sname asc, birthday desc;

/*학생들의 학과, 학생이름, 지도교수이름을 검색하시오.*/
select s.dept, s.sname, p.pname from professors p, students s where p.pcode = s.advisor; /*조인*/
select pcode from professors;

/*강좌번호, 강좌명, 교수이름을 검색하시오.*/
select c.lcode, c.lname, p.pname from professors p, courses c where p.pcode = c.instructor order by lcode asc;
/*학번, 학생이름, 학생들이 수강신청 한 강좌번호, 수강신청일을 검색하시오*/
select s.scode, s.sname, e.lcode, e.edate from students s, enrollments e where s.scode = e.scode order by lcode asc;
/*1. 학번, 학생들이 수강신청 한 강좌번호, 강좌명, 성적을 검색하시오.*/
create view view1 as
select s.scode, s.sname, e.lcode, c.lname, e.edate from students s, enrollments e, courses c  where s.scode = e.scode and e.lcode = c.lcode order by lcode asc;

select *from view1;
/*'이병렬'과 교수가 지도하는 학생들의 이름, 학년, 생년월일을 검색하시오*/
select s.sname, s.year, s.birthday from professors p, students s where p.pname = '이병렬' and p.pcode =s.advisor;

/*'98/03/03'에 수강신청 한 학생들의 학번, 학생이름, 강좌번호를 검색하시오.*/
select s.scode, s.sname, e.lcode from students s, enrollments e where e.edate = '98/03/03' and s.scode = e.scode;

/*'전산'과 교수들이 지도하는 학생들의 이름, 학년, 생년월일을 검색하시오.*/
select s.sname, s.year, s.birthday from professors p, students s where p.dept='전산' and s.advisor = p.pcode;

/*자료구조'를 강의하는 교수의 학과명, 교수 명을 검색하시오.*/
select p.dept, p.pname from professors p, courses c where c.lname = '자료구조' and p.pcode = c.instructor;

/*'파일처리론'을 수강신청 한 학생들의 학번, 수강신청일, 점수를 검색하시오.*/
select e.scode, e.edate, e.grade  from enrollments e, courses c where c.lname ='파일처리론' and e.lcode = c.lcode;

/*'자료구조' 과목을 수강신청 한 학생들의 학과, 학생이름, 성적을 검색하시오.*/
select s.dept, s.sname, e.grade from students s, enrollments e, courses c where c.lname = '자료구조' and e.lcode= c.lcode and s.scode = e.scode;

/*'전자'과 학생들의 학번, 학생이름, 수강신청 한 강좌번호, 강좌 명, 성적을 검색하시오.*/
select s.scode, s.sname, e.lcode, c.lname, e.grade from students s, enrollments e, courses c where s.dept='전자' and e.lcode = c.lcode and s.scode = e.scode;

/*'파일처리론'을 강의하는 교수의 이름, 이 교수가 지도하는 학생들의 학번, 학생명을 검색하시오.*/
select p.pname, s.scode, s.sname from professors p, students s , courses c where c.lname='파일처리론' and p.pcode=s.advisor and c.instructor=p.pcode;

/*'데이터베이스'를 강의하는 교수명, 이 과목을 수강신청 한 학생들의 학과, 이름, 성적을 검색하시오.*/
select p.pname, s.dept, s.sname, e.grade from professors p, students s, courses c, enrollments e where c.lname = '데이터베이스' and c.lcode = e.lcode and c.instructor = p.pcode and s.scode = e.scode;

/*성적이 80점 이상인 학생들의 학번, 학생이름, 강좌번호, 강좌명, 담당교수 명을 검색하시오.*/
select s.scode, s.sname, c.lcode, c.lname, p.pname from professors p, students s, courses c, enrollments e where e.grade>=80 and s.scode = e.scode and c.instructor = p.pcode and c.lcode = e.lcode;


/*3.조회*/
/*3.교수들의 총 급여액과 평균 급여액을 구하시오.*/
select sum(salary) salary_sum, avg(salary) salary_avg from professors;

/*전산과 교수들의 총 급여액과 평균 급여액을 구하시오.*/
select sum(salary) salary_sum, avg(salary) salary_avg from professors where dept='전산';

/*수강신청 한 과목들 중에서 최고 점수와 최저 점수를 구하시오.*/
select max(grade), min(grade) from enrollments;

/*전산과 학생들은 모두 몇 명인지 구하시오.*/
select count(*) from students where dept = '전산';

/*수강신청 한 학생들은 모두 몇 명인지 구하시오.*/
select count(distinct(scode))from enrollments;

/*각 학과별 학생들의 수를 구하시오.*/
select dept, count(scode) from students group by dept order by count(scode) desc;

/*교수들을 소속학과별, 직급별로 분류하여 각 직급별 평균 급여액수를 구하시오.*/
select dept, title, avg(salary), count(pcode) from professors group by dept, title order by dept, title;

/*각 학생들에 대해 학번, 학생이름, 수강신청 과목들의 평균 점수를 구하시오.*/
select s.scode, s.sname, s.dept, avg(e.grade), count(lcode), p.pname from students s, enrollments e, professors p 
where s.scode = e.scode and p.pcode=s.advisor group by s.scode, s.sname, s.dept, p.pname order by avg(e.grade) desc;

drop view enr_stu_pro;
create view enr_stu_pro as
select e.*, sname, s.dept stu_dept, pname, p.dept pro_dept 
from enrollments e, students s, professors p 
where e.scode = s. scode and s.advisor= p.pcode;
select * from enr_stu_pro;

/*각 학생들에 대해 수강신청 과목들의 평균 점수를 구하시오.*/
select s.sname, c.lname, avg(e.grade) from students s, enrollments e, courses c where s.scode = e.scode and e.lcode = c.lcode group by s.sname, c.lname;

create view eno_stu_cou as
select e.*, s.sname, c.lname from enrollments e, students s, courses c where e.scode=s.scode and e.lcode=c.lcode;

/*수강신청 한 과목들을 학생별로 그룹핑하여 평균 점수를 구한 다음, 학생번호, 평균 점수를 성적이 높은 순으로 정렬하여 출력하시오.*/
/*수강신청 과목들의 평균 점수가 85점 이상인 학생들의 학생번호, 평균 점수를 구하시오.*/
/*강좌별 평균점수가 80점 이상인 강좌들의 강좌번호와 평균점수를 출력하시오.*/
/*학생수가 3명 이상인 학과 구한 다음, 학과명, 학생수를 출력하시오.*/
/*수강신청 평균점수가 85점 이상인 학생들의 학생번호, 학생이름, 평균 점수를 평균점수가 높은 순으로 출력하시오.*/
/*강좌별 평균점수가 80점 이상인 강좌들의 강좌번호, 강좌명, 평균점수를 평균점수가 높은 순으로 출력하시오.*/
