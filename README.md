# 一个简单的策略工厂🍺


```xml
<dependency>
  <groupId>io.github.hjhhjhhjh.strategyfactory</groupId>
  <artifactId>strategyfactory-core</artifactId>
  <version>0.0.2</version>
</dependency>
```

Spring使用方法:

#### 
```java
//1. 定义一个业务的接口继承BaseHandlerKey
public interface Business extends BaseHandlerKey<String> {
    int handler(int a,int b);
}

//2.实现Business,例如 
@Component
public class AddBusiness implements Business{
    @Override
    public String getKey() {
        return "add";
    }
    public int handler(int a,int b){
        return a + b;
    }
}
@Component
public class ReduceBusiness implements Business{
    @Override
    public String getKey() {
        return "reduce";
    }
    public int handler(int a,int b){
        return a - b;
    }
}        
//3.定义一个业务的工厂继承SpringAutowriteHandlerFactory
@Component
public class BusinessStrategyFactory extends SpringAutowriteHandlerFactory<String,Business>){}


//4.使用
@Autowrite
BusinessStrategyFactory factory;

System.out.println(factory.getInstance("add").handler(5,1));#输出是 6
System.out.println(factory.getInstance("reduce").handler(5,1));#输出是 4


```








