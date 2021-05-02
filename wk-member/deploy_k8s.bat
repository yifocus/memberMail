call mvn clean install -Dmaven.test.skip=true
cd member-svc
call mvn validate docker:build docker:push docker:remove