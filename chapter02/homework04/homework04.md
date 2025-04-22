环境变量的作用和配置方法

作用：任意目录可以直接运行程序，不用带上程序的路径
配置方法：
1. 为当前用户配置：修改～/.bash_profile 
添加如：
```
export JAVA_HOME=$(/usr/libexec/java_home -v 1.8)
export PATH=$JAVA_HOME/bin:$PATH
```
更新环境变量缓存 source ～/.bash_profile

2. 全局配置：修改 /etc/profile
同上