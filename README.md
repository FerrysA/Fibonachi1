# Fibonacci-7kyu
# 22.11.2022
# нахождение энного числа фибоначи
# [ссылка на задание](https://www.codewars.com/kata/57a1d5ef7cb1f3db590002af)
# код :
```java
public static long fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    
```    
 # понравивщееся   решение (автор etezadi)

``` java 
 public static long fib (int n) {
    if (n <= 1) {
      return n;
    }
    return fib(n - 1) + fib(n -2);
  }
