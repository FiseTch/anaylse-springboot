### annotation注解四大基本属性
####1. @Interface
* 所有的注解都必须拥有，代表继承了annotation接口
* 用法：
```java
public @interface 自定义注解名
```
####2. @Target
* 表示当前注解使用的范围，允许有多个
* 用法：
```java
@Target(ElementType.TYPE,ElementType.METHOD) 允许多个范围并存
```
* ElementType中的值
```java
public enum ElementType {
    TYPE,

    FIELD,

    METHOD,

    PARAMETER,

    CONSTRUCTOR,

    LOCAL_VARIABLE,

    ANNOTATION_TYPE,

    PACKAGE,

    TYPE_PARAMETER,

    TYPE_USE,
}
```
####3. @Retention
* 表示当前注解在jvm什么状态下可以运行
* 用法：
```java
@Retention(RetentionPolicy.SOURCE) 有且只能有一个状态
```
* RetentionPolicy的值
```java
public enum RetentionPolicy {
   
    SOURCE,

    CLASS,

    RUNTIME
}
```

####4. @Documented
* 表示当前注解是否放在javadoc中，
* 用法：
```java
@Documented
```
