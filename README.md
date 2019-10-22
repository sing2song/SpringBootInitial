# Springboot 기초세팅
```
src/main/java/springboot/spring/config의 **DataAccessConfig.java**, **DataSourcesConfig.java**에서 mybatis, jdbc연결controller
src/main/java/springboot/spring/controller의 **HomeController**에서 페이지 연결. ModelAndView로 Data를 담아서 연결함.
src/main/java/springboot/spring/data에는 db에 담겨있는 데이터의 형식 지정.
src/main/java/springboot/spring/repository는 interface로 함수의 이름만 선언.
src/main/java/springboot/spring/service에서 repository를 통해서 가져온 데이터를 정리.
src/main/java/springboot/spring의 **Application.java**은 기본적으로 있어야할 것. 
src/main/java/springboot/spring의 **ServletInitializer.java**는 에러가 생기는것을 방지하려고 추가.
```
```
src/main/resources의 **application.properties**에 mysql의 정보와 jsp의 위치가 들어있음.
src/main/resources/mapper의 **user_mapper.xml**에서 디비에서 값을 가져옴. src/main/java/springboot/spring/repository랑 직접적으로 연결.
```
