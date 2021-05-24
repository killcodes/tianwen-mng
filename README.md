# tianwen-mng
人员管理系统

1.Spring的依赖注入

  1.1 使用XML文件管理bean
    优点：配置集中，方便管理；
  1.2 使用注解管理bean(2.5之后)：
    优点：使用这种方式xml文件就很少，会少些许多代码；
    缺点：配置分散
  scope：作用域
     singleton:单例；
     prototype:多例

  Spring框架能够管理对象与对象之间的依赖关系，来降低两者之间的耦合，从而提供程序的复用性和扩展性

ORM框架：MyBatis:在数据库的表和Java实体之间建立一个映射关系

MyBatis Plus:对MyBatis进行了一层封装，封装了通用的数据库操作，如增、删、改、查，地址：https://mp.baomidou.com/
为什么要用数据库连接池：
  1.数据库支持的连接数是有限制的；
  2.创建数据连接是小消耗资源和时间的；
  3.可以节约资源和时间；
  
  代码地址：https://github.com/killcodes/tianwen-mng.git
  
  运行准备：
  
  1.创建数据库：tianwen;
  
  2.然后在tianwen数据库中执行tianwen.sql中的sql；
  
  3.默认登录账号: test/123456



