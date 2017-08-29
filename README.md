## 重构基础：Java版

### 练习1

    使用防卫语句取代条件表达式（Replaced the Nexted Conditional with Guard Clauses）重构遗留代码

### 练习2

    使用提炼函数(Extract Method)手法重构遗留代码

### 练习3

    使用抽象方法对象(Extract Method Object)重构遗留代码


## 参考资料

1. [Gradle基础教程](http://tutorials.jenkov.com/gradle/gradle-tutorial.html)
2. [Java 基础](http://www.runoob.com/java/java-tutorial.html)
3. [Git 参考手册](http://gitref.org/zh/index.html)


## 答题流程
- 请用户仔细阅读题目要求和题目描述

- 在命令行中使用以下命令在用户本地任意目录下clone此题目库
```
git clone repo_of_this_template
```
- 删除目录下的.git文件夹
- 使用git init命令初始化一个新仓库
- 建立Github远程仓库，将本地仓库同步到Gitbub


## 如何本地运行

首先初次下载完需要安装依赖和建立项目相关配置：

```
  Mac/Linux: ./gradlew idea
  Whindows:  gradlew.bat idea
```

```
  Mac/Linux: ./gradlew clean build
  Whindows:  gradlew.bat clean build
```

然后才能执行测试：

```
  Mac/Linux: ./gradlew clean test
  Whindows:  gradlew.bat clean test.
```

