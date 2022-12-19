-- 코드를 입력하세요
-- PT_NO, PT_NAME, GEND_CD, AGE, TLNO
-- 환자번호, 환자이름, 성별코드, 나이, 전화번호

SELECT  PT_NAME,PT_NO, GEND_CD, AGE, ifnull(TLNO,'NONE') as TMLO
FROM PATIENT
WHERE AGE < 13
AND GEND_CD = 'W'
order by age desc, pt_name
;