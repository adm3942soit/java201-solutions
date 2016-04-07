:: Go to "android-tools" directory
cd C:\MyWork\edutrack\Spring\v4.0\mvc\task_01
SET M2_HOME=C:\Program Files\apache-maven-3.3.3
set path=%M2_HOME%\bin;
rem call mvn clean package
call mvn clean install tomcat7:run

