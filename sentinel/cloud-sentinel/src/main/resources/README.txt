1.spring-cloud 整合sentinel
2.spring-boot项目引入actuator ,可通过调用/actuator 的方式查看项目中信息
3.实现sentinel统一限流降级...等异常处理机制，实现BlockExceptionHandler ,可根据实现方法中 handle()参数的BlockException 的不同子类进行不同的处理