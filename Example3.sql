create table cls_data(Enroll_no int, stu_name varchar(40), Section varchar(10), sub_id int, marks int);
insert into cls_data values(1,"Tim","A",1,70);
insert into cls_data values(2,"Jim","A",2,75);
insert into cls_data values(3,"Kim","B",3,65);
insert into cls_data values(4,"Tom","B",4,77);
insert into cls_data values(5,"John","C",5,60);
insert into cls_data values(6,"Joe","C",1,82);
insert into cls_data values(7,"James","B",2,76);
insert into cls_data values(8,"Henry","C",5,68);
insert into cls_data values(9,"Matt","B",3,71);
insert into cls_data values(10,"Paul","A",4,79);

select distinct Section, count(marks) as 'No. of candidates greater then or equal to 75 marks' from cls_data where marks>=75;