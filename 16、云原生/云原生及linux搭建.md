参考文档：https://www.yuque.com/leifengyang/oncloud/vfvmcd

## 私有网络

# 云平台核心

# 1、为什么用云平台

- 环境统一
- 按需付费 

- 即开即用 
- 稳定性强

- ......



国内常见云平台：

- [阿里云](https://promotion.aliyun.com/ntms/act/ambassador/sharetouser.html?userCode=50sid5bu&utm_source=50sid5bu)、百度云、[腾讯云](https://curl.qcloud.com/iyFTRSJb)、[华为云](https://activity.huaweicloud.com/discount_area_v5/index.html?fromacct=d1a6f32e-d6d0-4702-9213-eafe022a0708&utm_source=bGVpZmVuZ3lhbmc==&utm_medium=cps&utm_campaign=201905)、青云......

国外常见云平台：

- 亚马逊 AWS、微软 Azure ...

## 1、公有云

购买云服务商提供的公共服务器



公有云是最常见的云计算部署类型。公有云资源（例如服务器和存储空间）由第三方云服务提供商拥有和运营，这些资源通过 Internet 提供。在公有云中，所有硬件、软件和其他支持性基础结构均为云提供商所拥有和管理。Microsoft Azure 是公有云的一个示例。

在公有云中，你与其他组织或云“租户”共享相同的硬件、存储和网络设备，并且你可以使用 Web 浏览器访问服务和管理帐户。公有云部署通常用于提供基于 Web 的电子邮件、网上办公应用、存储以及测试和开发环境。

公有云优势：

- **成本更低**：无需购买硬件或软件，仅对使用的服务付费。
- **无需维护**：维护由服务提供商提供。

- **近乎无限制的缩放性**：提供按需资源，可满足业务需求。
- **高可靠性**：具备众多服务器，确保免受故障影响。

- - 可用性： N个9   9   全年的故障时间： 365*24*3600*(1-99.9999%)

## 2、私有云

自己搭建云平台，或者购买



私有云由专供一个企业或组织使用的云计算资源构成。私有云可在物理上位于组织的现场数据中心，也可由第三方服务提供商托管。但是，在私有云中，服务和基础结构始终在私有网络上进行维护，硬件和软件专供组织使用。

这样，私有云可使组织更加方便地自定义资源，从而满足特定的 IT 需求。私有云的使用对象通常为政府机构、金融机构以及其他具备业务关键性运营且希望对环境拥有更大控制权的中型到大型组织。

私有云优势：

- **灵活性更强**：组织可自定义云环境以满足特定业务需求。
- **控制力更强**：资源不与其他组织共享，因此能获得更高的控制力以及更高的隐私级别。

- **可伸缩性更强**：与本地基础结构相比，私有云通常具有更强的可伸缩性。





***没有一种云计算类型适用于所有人。多种不同的云计算模型、类型和服务已得到发展，可以满足组织快速变化的技术需求。\***



***部署云计算资源有三种不同的方法：公共云、私有云和混合云。采用的部署方法取决于业务需求。\***

# 2、核心构架

## 0、所需软件

[electerm](https://electerm.github.io/electerm/)：  https://electerm.github.io/electerm/

https://wwa.lanzoui.com/b016k9bha

密码:900h

xshell



注册云平台：

- [阿里云](https://www.aliyun.com/daily-act/ecs/activity_selection?userCode=50sid5bu)   aliyun.com 
- [腾讯云](https://curl.qcloud.com/iyFTRSJb)   cloud.tencent.com

- [华为云](https://activity.huaweicloud.com/discount_area_v5/index.html?fromacct=d1a6f32e-d6d0-4702-9213-eafe022a0708&utm_source=bGVpZmVuZ3lhbmc==&utm_medium=cps&utm_campaign=201905)   cloud.huawei.com

[青云](https://www.qingcloud.com/promotion2021)       qingcloud.com

[百度云](http://cloud.baidu.com)    cloud.baidu.com

.......

## 1、基础概念

- 云服务器作为应用的最终载体
- VPC为所有云服务器提供网络隔离

- 所有云服务器都是绑定某个私有网络
- 安全组控制每个服务器的防火墙规则

- 公网IP使得资源可访问
- 端口转发的方式访问到具体服务器

## 2、实战操作

1、开通按量付费服务器

你做完了吗？



2、开通基于VPC的服务器集群

理解VPC了吗？

# **Docker基础**

# Docker基本概念

# 1、解决的问题

## 1、统一标准

- 应用构建 

- - Java、C++、JavaScript
  - 打成软件包

- - .exe
  - docker build ....   镜像

- 应用分享

- - 所有软件的镜像放到一个指定地方  docker hub
  - 安卓，应用市场

- 应用运行

- - 统一标准的 **镜像**
  - docker run

- .......



容器化







## 2、资源隔离

- cpu、memory资源隔离与限制
- 访问设备隔离与限制

- 网络隔离与限制
- 用户、用户组隔离限制

- ......



# 2、架构

![img](https://cdn.nlark.com/yuque/0/2021/svg/1613913/1624937894925-f437bd98-94e2-4334-9657-afa69bb52179.svg)





- Docker_Host：

- - 安装Docker的主机

- Docker Daemon：

- - 运行在Docker主机上的Docker后台进程

- Client：

- - 操作Docker主机的客户端（命令行、UI等）

- Registry：

- - 镜像仓库
  - Docker Hub

- Images：

- - 镜像，带环境打包好的程序，可以直接启动运行

- Containers：

- - 容器，由镜像启动起来正在运行中的程序



交互逻辑

装好**Docker**，然后去 **软件市场** 寻找**镜像**，下载并运行，查看**容器**状态日志等排错



# 3、安装

## 1、centos下安装docker

其他系统参照如下文档

https://docs.docker.com/engine/install/centos/



### 1、移除以前docker相关包

```bash
sudo yum remove docker \
                  docker-client \
                  docker-client-latest \
                  docker-common \
                  docker-latest \
                  docker-latest-logrotate \
                  docker-logrotate \
                  docker-engine
```





### 2、配置yum源

```bash
sudo yum install -y yum-utils
sudo yum-config-manager \
--add-repo \
http://mirrors.aliyun.com/docker-ce/linux/centos/docker-ce.repo
```



### 3、安装docker

```bash
sudo yum install -y docker-ce docker-ce-cli containerd.io


#以下是在安装k8s的时候使用
yum install -y docker-ce-20.10.7 docker-ce-cli-20.10.7  containerd.io-1.4.6
```



### 4、启动

```bash
systemctl enable docker --now
```



### 5、配置加速

这里额外添加了docker的生产环境核心配置cgroup

```bash
sudo mkdir -p /etc/docker
sudo tee /etc/docker/daemon.json <<-'EOF'
{
  "registry-mirrors": ["https://82m9ar63.mirror.aliyuncs.com",
  "https://docker.mirrors.ustc.edu.cn",
        "http://f1361db2.m.daocloud.io",
        "https://registry.docker-cn.com"],
  "exec-opts": ["native.cgroupdriver=systemd"],
  "log-driver": "json-file",
  "log-opts": {
    "max-size": "100m"
  },
  "storage-driver": "overlay2"
}
EOF
sudo systemctl daemon-reload
sudo systemctl restart docker
```



## 2、centos下安装jdk

1.先看linux中是否已经存在jdk

```
1.可通过命令：java -version 查看

2.通过命令rpm -qa | grep java 查看
```

![image-20211220172552309](images\image-20211220172552309.png)

2.删除已存在的java

```
rpm -e --nodeps 文件名（通过命令rpm -qa | grep java 查出来的）
```

![img](https://pics2.baidu.com/feed/faf2b2119313b07e27be94c85deca62596dd8cb5.jpeg?token=f20cef1d684c665c0d99c3c7146bd2bc&s=457011C2DBBCB0490ADCF5090000A0C3)

3.查看yum原中的jdk

```
yum search java|grep jdk
```

![image-20211220174253009](images\image-20211220174253009.png)

4.安装jdk1.8，安装默认的目录为： /usr/lib/jvm/

```
yum install java-1.8.0-openjdk java-1.8.0-openjdk-devel.x86_64
```

![image-20211220181114075](images\image-20211220181114075.png)

5.配置环境变量

```
vi /etc/profile
按Shitf+G进入最后一行，然后按字母i进入编辑模式，插入以下数据，按Esc，输入:wq回车
export JAVA_HOME=/usr/lib/jvm/java-1.8.0
export JRE_HOME=$JAVA_HOME/jre  
export PATH=$PATH:$JAVA_HOME/bin:$JRE_HOME/bin
export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar:$JRE_HOME/lib


```



6.环境变量配置生效

```
source /etc/profile
```



7.验证是否安装配置成功

```
java -version
```

![image-20211220181924214](images\image-20211220181924214.png)



# Docker Hub 镜像加速器

# **一、概述**

国内从 Docker Hub 拉取镜像有时会遇到困难，此时可以配置镜像加速器。Docker 官方和国内很多云服务商都提供了国内加速器服务。

二、配置加速地址

```javascript
Ubuntu 16.04+、Debian 8+、CentOS 7+
```

创建或修改 `/etc/docker/daemon.json`：

```javascript
sudo mkdir -p /etc/docker
sudo tee /etc/docker/daemon.json <<-'EOF'
{
    "registry-mirrors": [
        "https://1nj0zren.mirror.aliyuncs.com",
        "https://docker.mirrors.ustc.edu.cn",
        "http://f1361db2.m.daocloud.io",
        "https://registry.docker-cn.com"
    ]
}
EOF
sudo systemctl daemon-reload
sudo systemctl restart docker
```

## **Docker Hub 镜像加速器列表**

| 镜像加速器          | 镜像加速器地址                          | 专属加速器？     | 其它加速？            |
| :------------------ | :-------------------------------------- | :--------------- | :-------------------- |
| Docker 中国官方镜像 | https://registry.docker-cn.com          |                  | Docker Hub            |
| DaoCloud 镜像站     | http://f1361db2.m.daocloud.io           | 可登录，系统分配 | Docker Hub            |
| Azure 中国镜像      | https://dockerhub.azk8s.cn              |                  | Docker Hub、GCR、Quay |
| 科大镜像站          | https://docker.mirrors.ustc.edu.cn      |                  | Docker Hub、GCR、Quay |
| 阿里云              | https://<your_code>.mirror.aliyuncs.com | 需登录，系统分配 | Docker Hub            |
| 七牛云              | https://reg-mirror.qiniu.com            |                  | Docker Hub、GCR、Quay |
| 网易云              | https://hub-mirror.c.163.com            |                  | Docker Hub            |
| 腾讯云              | https://mirror.ccs.tencentyun.com       |                  | Docker Hub            |

## **检查加速器是否生效**

命令行执行 `docker info`，如果从结果中看到了如下内容，说明配置成功。

```javascript
Registry Mirrors:
 [...]
 https://registry.docker-cn.com/
```

## **Docker Hub 镜像测速**

使用镜像前后，可使用 `time` 统计所花费的总时间。测速前先移除本地的镜像！

```javascript
Registry Mirrors:
 [...]
 https://registry.docker-cn.com/
```

# Docker命令实战

# 常用命令 

![img](https://cdn.nlark.com/yuque/0/2021/png/1613913/1625373590853-2aaaa76e-d5b5-446b-850a-f6cfa26ac70a.png?x-oss-process=image%2Fwatermark%2Ctype_d3F5LW1pY3JvaGVp%2Csize_85%2Ctext_YXRndWlndS5jb20gIOWwmuehheiwtw%3D%3D%2Ccolor_FFFFFF%2Cshadow_50%2Ct_80%2Cg_se%2Cx_10%2Cy_10)

# 基础实战

## 1、找镜像

去[docker hub](http://hub.docker.com)，找到nginx镜像

```bash
docker pull nginx  #下载最新版

镜像名:版本名（标签）

docker pull nginx:1.20.1


docker pull redis  #下载最新
docker pull redis:6.2.4

## 下载来的镜像都在本地
docker images  #查看所有镜像

redis = redis:latest

docker rmi 镜像名:版本号/镜像id
```





## 2、启动容器

启动nginx应用容器，并映射88端口，测试的访问

```bash
docker run [OPTIONS] IMAGE [COMMAND] [ARG...]

【docker run  设置项   镜像名  】 镜像启动运行的命令（镜像里面默认有的，一般不会写）

# -d：后台运行
# --restart=always: 开机自启
docker run --name=mynginx   -d  --restart=always -p  88:80   nginx




# 查看正在运行的容器
docker ps
# 查看所有
docker ps -a
# 删除停止的容器
docker rm  容器id/名字
docker rm -f mynginx   #强制删除正在运行中的

#停止容器
docker stop 容器id/名字
#再次启动
docker start 容器id/名字

#应用开机自启
docker update 容器id/名字 --restart=always
```



## 3、修改容器内容

修改默认的index.html 页面

### 1、进容器内部修改

```bash
# 进入容器内部的系统，修改容器内容
docker exec -it 容器id  /bin/bash

# 进入到静态页面下对html文件进行修改
cd /usr/share/nginx/html

# docker没有vim等操作命令时
apt-get install vim
```

## 3、修改容器内容

修改默认的index.html 页面

### 1、进容器内部修改

```bash
# 进入容器内部的系统，修改容器内容
docker exec -it 容器id  /bin/bash
```



### 2、挂载数据到外部修改

```bash
docker run --name=mynginx   \
-d  --restart=always \
-p  88:80 -v /data/html:/usr/share/nginx/html:ro  \
nginx

# 修改页面只需要去 主机的 /data/html
```



 4、提交改变 

将自己修改好的镜像提交



```
docker commit [OPTIONS] CONTAINER [REPOSITORY[:TAG]]
docker commit -a "leifengyang"  -m "首页变化" 341d81f7504f guignginx:v1.0
```



### 1、镜像传输

```
# 将镜像保存成压缩包
docker save -o abc.tar guignginx:v1.0

# 别的机器加载这个镜像
docker load -i abc.tar


# 离线安装

# 服务器之间传输
scp abc.tar root@ip地址:文件存放位置
```

## 5、推送远程仓库

推送镜像到docker hub；应用市场

```
docker tag local-image:tagname new-repo:tagname
docker push new-repo:tagname
```

```
# 把旧镜像的名字，改成仓库要求的新版名字
docker tag guignginx:v1.0 leifengyang/guignginx:v1.0

# 登录到docker hub
docker login       


docker logout（推送完成镜像后退出）

# 推送
docker push leifengyang/guignginx:v1.0


# 别的机器下载
docker pull leifengyang/guignginx:v1.0
```

## 6、补充

```
docker logs 容器名/id   排错

docker exec -it 容器id /bin/bash


# docker 经常修改nginx配置文件
docker run -d -p 80:80 \
-v /data/html:/usr/share/nginx/html:ro \
-v /data/conf/nginx.conf:/etc/nginx/nginx.conf \
--name mynginx-02 \
nginx


#把容器指定位置的东西复制出来 
docker cp 5eff66eec7e1:/etc/nginx/nginx.conf  /data/conf/nginx.conf
#把外面的内容复制到容器里面
docker cp  /data/conf/nginx.conf  5eff66eec7e1:/etc/nginx/nginx.conf
```

# 进阶实战

## 1、编写自己的应用

编写一个HelloWorld应用

https://start.spring.io/



示例代码：  https://gitee.com/leifengyang/java-demo.git

## 2、将应用打包成镜像

编写Dockerfile将自己的应用打包镜像

### 1、以前

Java为例

- SpringBoot打包成可执行jar
- 把jar包上传给服务

- 服务器运行java -jar





### 2、现在

所有机器都安装Docker，任何应用都是镜像，所有机器都可以运行



### 3、怎么打包-Dockerfile

```
FROM openjdk:8-jdk-slim
LABEL maintainer=leifengyang

COPY target/*.jar   /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
```



```
docker build -t java-demo:v1.0 .
```



思考：

每个应用每次打包，都需要本地编译、再上传服务器、再进行docker构建，如果有1000个应用要打包镜像怎么办？有没有更好的方式？



## 3、启动容器

启动应用容器

```
docker run -d -p 8080:8080 --name myjava-app java-demo:v1.0 
```



分享镜像

```
# 登录docker hub
docker login

#给旧镜像起名
docker tag java-demo:v1.0  leifengyang/java-demo:v1.0

# 推送到docker hub
docker push leifengyang/java-demo:v1.0

# 别的机器
docker pull leifengyang/java-demo:v1.0

# 别的机器运行
docker run -d -p 8080:8080 --name myjava-app java-demo:v1.0 
```



## 4、部署中间件

部署一个Redis+应用，尝试应用操作Redis产生数据



```
# 在服务器中创建目录及配置文件
/data/redis/redis.conf



docker run [OPTIONS] IMAGE [COMMAND] [ARG...]

#redis使用自定义配置文件启动

docker run -v /data/redis/redis.conf:/etc/redis/redis.conf \
-v /data/redis/data:/data \
-d --name myredis \
-p 6379:6379 \
redis:6.2.6  redis-server /etc/redis/redis.conf
```



# Kubernetes基础概念

# 1、是什么 

![image.png](https://cdn.nlark.com/yuque/0/2021/png/1613913/1625452569657-833e64b2-1403-4fb6-9ee3-1e166504ccf0.png?x-oss-process=image%2Fwatermark%2Ctype_d3F5LW1pY3JvaGVp%2Csize_54%2Ctext_YXRndWlndS5jb20gIOWwmuehheiwtw%3D%3D%2Ccolor_FFFFFF%2Cshadow_50%2Ct_80%2Cg_se%2Cx_10%2Cy_10)

我们急需一个大规模容器编排系统

kubernetes具有以下特性：

- **服务发现和负载均衡**
  Kubernetes 可以使用 DNS 名称或自己的 IP 地址公开容器，如果进入容器的流量很大， Kubernetes 可以负载均衡并分配网络流量，从而使部署稳定。
- **存储编排**
  Kubernetes 允许你自动挂载你选择的存储系统，例如本地存储、公共云提供商等。

- **自动部署和回滚**
  你可以使用 Kubernetes 描述已部署容器的所需状态，它可以以受控的速率将实际状态 更改为期望状态。例如，你可以自动化 Kubernetes 来为你的部署创建新容器， 删除现有容器并将它们的所有资源用于新容器。
- **自动完成装箱计算**
  Kubernetes 允许你指定每个容器所需 CPU 和内存（RAM）。 当容器指定了资源请求时，Kubernetes 可以做出更好的决策来管理容器的资源。

- **自我修复**
  Kubernetes 重新启动失败的容器、替换容器、杀死不响应用户定义的 运行状况检查的容器，并且在准备好服务之前不将其通告给客户端。
- **密钥与配置管理**
  Kubernetes 允许你存储和管理敏感信息，例如密码、OAuth 令牌和 ssh 密钥。 你可以在不重建容器镜像的情况下部署和更新密钥和应用程序配置，也无需在堆栈配置中暴露密钥。

***Kubernetes 为你提供了一个可弹性运行分布式系统的框架。 Kubernetes 会满足你的扩展要求、故障转移、部署模式等。 例如，Kubernetes 可以轻松管理系统的 Canary 部署。\***

Kubernetes 集群架构以及相关的核心组件如下图所示：一个 Kubernetes 集群一般包含一个 Master 节点和多个 Node 节点，一个节点可以看成是一台物理机或虚拟机。

![img](https://img2018.cnblogs.com/blog/856154/201910/856154-20191023003358108-1816205812.png)

### 1、控制平面组件（Control Plane Components） 

控制平面的组件对集群做出全局决策(比如调度)，以及检测和响应集群事件（例如，当不满足部署的 `replicas` 字段时，启动新的 [pod](https://kubernetes.io/docs/concepts/workloads/pods/pod-overview/)）。

控制平面组件可以在集群中的任何节点上运行。 然而，为了简单起见，设置脚本通常会在同一个计算机上启动所有控制平面组件， 并且不会在此计算机上运行用户容器。 请参阅[使用 kubeadm 构建高可用性集群](https://kubernetes.io/zh/docs/setup/production-environment/tools/kubeadm/high-availability/) 中关于多 VM 控制平面设置的示例。

#### kube-apiserver

API 服务器是 Kubernetes [控制面](https://kubernetes.io/zh/docs/reference/glossary/?all=true#term-control-plane)的组件， 该组件公开了 Kubernetes API。 API 服务器是 Kubernetes 控制面的前端。

Kubernetes API 服务器的主要实现是 [kube-apiserver](https://kubernetes.io/zh/docs/reference/command-line-tools-reference/kube-apiserver/)。 kube-apiserver 设计上考虑了水平伸缩，也就是说，它可通过部署多个实例进行伸缩。 你可以运行 kube-apiserver 的多个实例，并在这些实例之间平衡流量。

#### etcd

etcd 是兼具一致性和高可用性的键值数据库，可以作为保存 Kubernetes 所有集群数据的后台数据库。

您的 Kubernetes 集群的 etcd 数据库通常需要有个备份计划。

要了解 etcd 更深层次的信息，请参考 [etcd 文档](https://etcd.io/docs/)。

#### kube-scheduler

控制平面组件，负责监视新创建的、未指定运行[节点（node）](https://kubernetes.io/zh/docs/concepts/architecture/nodes/)的 [Pods](https://kubernetes.io/docs/concepts/workloads/pods/pod-overview/)，选择节点让 Pod 在上面运行。

调度决策考虑的因素包括单个 Pod 和 Pod 集合的资源需求、硬件/软件/策略约束、亲和性和反亲和性规范、数据位置、工作负载间的干扰和最后时限。

#### kube-controller-manager

在主节点上运行 [控制器](https://kubernetes.io/zh/docs/concepts/architecture/controller/) 的组件。

从逻辑上讲，每个[控制器](https://kubernetes.io/zh/docs/concepts/architecture/controller/)都是一个单独的进程， 但是为了降低复杂性，它们都被编译到同一个可执行文件，并在一个进程中运行。

这些控制器包括:

- 节点控制器（Node Controller）: 负责在节点出现故障时进行通知和响应
- 任务控制器（Job controller）: 监测代表一次性任务的 Job 对象，然后创建 Pods 来运行这些任务直至完成

- 端点控制器（Endpoints Controller）: 填充端点(Endpoints)对象(即加入 Service 与 Pod)
- 服务帐户和令牌控制器（Service Account & Token Controllers）: 为新的命名空间创建默认帐户和 API 访问令牌

#### cloud-controller-manager

云控制器管理器是指嵌入特定云的控制逻辑的 [控制平面](https://kubernetes.io/zh/docs/reference/glossary/?all=true#term-control-plane)组件。 云控制器管理器允许您链接集群到云提供商的应用编程接口中， 并把和该云平台交互的组件与只和您的集群交互的组件分离开。

`cloud-controller-manager` 仅运行特定于云平台的控制回路。 如果你在自己的环境中运行 Kubernetes，或者在本地计算机中运行学习环境， 所部署的环境中不需要云控制器管理器。

与 `kube-controller-manager` 类似，`cloud-controller-manager` 将若干逻辑上独立的 控制回路组合到同一个可执行文件中，供你以同一进程的方式运行。 你可以对其执行水平扩容（运行不止一个副本）以提升性能或者增强容错能力。

下面的控制器都包含对云平台驱动的依赖：

- 节点控制器（Node Controller）: 用于在节点终止响应后检查云提供商以确定节点是否已被删除
- 路由控制器（Route Controller）: 用于在底层云基础架构中设置路由

- 服务控制器（Service Controller）: 用于创建、更新和删除云提供商负载均衡器



### 2、Node

### 2、Node 组件 

节点组件在每个节点上运行，维护运行的 Pod 并提供 Kubernetes 运行环境。

#### kubelet

一个在集群中每个[节点（node）](https://kubernetes.io/zh/docs/concepts/architecture/nodes/)上运行的代理。 它保证[容器（containers）](https://kubernetes.io/zh/docs/concepts/overview/what-is-kubernetes/#why-containers)都 运行在 [Pod](https://kubernetes.io/docs/concepts/workloads/pods/pod-overview/) 中。

kubelet 接收一组通过各类机制提供给它的 PodSpecs，确保这些 PodSpecs 中描述的容器处于运行状态且健康。 kubelet 不会管理不是由 Kubernetes 创建的容器。

#### kube-proxy

[kube-proxy](https://kubernetes.io/zh/docs/reference/command-line-tools-reference/kube-proxy/) 是集群中每个节点上运行的网络代理， 实现 Kubernetes [服务（Service）](https://kubernetes.io/zh/docs/concepts/services-networking/service/) 概念的一部分。

kube-proxy 维护节点上的网络规则。这些网络规则允许从集群内部或外部的网络会话与 Pod 进行网络通信。

如果操作系统提供了数据包过滤层并可用的话，kube-proxy 会通过它来实现网络规则。否则， kube-proxy 仅转发流量本身。

![image.png](https://cdn.nlark.com/yuque/0/2021/png/1613913/1626605698082-bf4351dd-6751-44b7-aaf7-7608c847ea42.png?x-oss-process=image%2Fwatermark%2Ctype_d3F5LW1pY3JvaGVp%2Csize_37%2Ctext_YXRndWlndS5jb20gIOWwmuehheiwtw%3D%3D%2Ccolor_FFFFFF%2Cshadow_50%2Ct_80%2Cg_se%2Cx_10%2Cy_10%2Fresize%2Cw_1145%2Climit_0)

③ **docker engine**

Docker 引擎，负责本机的容器创建和管理工作。

Node 节点可以在运行期间动态增加到 K8S 集群中，前提是这个节点上已经正确安装、配置和启动了上述关键组件。在默认情况下 kubelet 会向 Master 注册自己，一旦 Node 被纳入集群管理范围，kubelet 就会定时向 Master 节点汇报自身的情况，例如操作系统、Docker 版本、机器的 CPU 和内存情况，以及之前有哪些 Pod 在运行等，这样 Master 可以获知每个 Node 的资源使用情况，并实现高效均衡的资源调度策略。而某个 Node 超过指定时间不上报信息时，会被 Master 判定为“失联”，Node 的状态被标记为不可用（Not Ready），随后 Master 会触发“工作负载大转移”的自动流程。

# 3、kubeadm创建集群

请参照以前Docker安装。先提前为所有机器安装Docker。

centos8.0的参照https://www.kubernetes.org.cn/7189.html

## 1、安装kubeadm

- 一台兼容的 Linux 主机。Kubernetes 项目为基于 Debian 和 Red Hat 的 Linux 发行版以及一些不提供包管理器的发行版提供通用的指令
- 每台机器 2 GB 或更多的 RAM （如果少于这个数字将会影响你应用的运行内存)

- 2 CPU 核或更多
- 集群中的所有机器的网络彼此均能相互连接(公网和内网都可以)

- - **设置防火墙放行规则**

- 节点之中不可以有重复的主机名、MAC 地址或 product_uuid。请参见[这里](https://kubernetes.io/zh/docs/setup/production-environment/tools/kubeadm/install-kubeadm/#verify-mac-address)了解更多详细信息。

- - **设置不同hostname**

- 开启机器上的某些端口。请参见[这里](https://kubernetes.io/zh/docs/setup/production-environment/tools/kubeadm/install-kubeadm/#check-required-ports) 了解更多详细信息。

- - **内网互信**

- 禁用交换分区。为了保证 kubelet 正常工作，你 **必须** 禁用交换分区。

- - **永久关闭**

- 

- ### 1、基础环境

- 所有机器执行以下操作

- ```
  #各个机器设置自己的域名
  hostnamectl set-hostname xxxx
  
  
  # 将 SELinux 设置为 permissive 模式（相当于将其禁用）
  sudo setenforce 0
  sudo sed -i 's/^SELINUX=enforcing$/SELINUX=permissive/' /etc/selinux/config
  
  #关闭swap
  swapoff -a  
  sed -ri 's/.*swap.*/#&/' /etc/fstab
  
  #允许 iptables 检查桥接流量
  cat <<EOF | sudo tee /etc/modules-load.d/k8s.conf
  br_netfilter
  EOF
  
  cat <<EOF | sudo tee /etc/sysctl.d/k8s.conf
  net.bridge.bridge-nf-call-ip6tables = 1
  net.bridge.bridge-nf-call-iptables = 1
  EOF
  sudo sysctl --system
  ```

- 

- ### 2、安装kubelet、kubeadm、kubectl

- ```
  cat <<EOF | sudo tee /etc/yum.repos.d/kubernetes.repo
  [kubernetes]
  name=Kubernetes
  baseurl=http://mirrors.aliyun.com/kubernetes/yum/repos/kubernetes-el7-x86_64
  enabled=1
  gpgcheck=0
  repo_gpgcheck=0
  gpgkey=http://mirrors.aliyun.com/kubernetes/yum/doc/yum-key.gpg
     http://mirrors.aliyun.com/kubernetes/yum/doc/rpm-package-key.gpg
  exclude=kubelet kubeadm kubectl
  EOF
  
  
  sudo yum install -y kubelet-1.20.9 kubeadm-1.20.9 kubectl-1.20.9 --disableexcludes=kubernetes
  
  sudo systemctl enable --now kubelet
  ```

- kubelet 现在每隔几秒就会重启，因为它陷入了一个等待 kubeadm 指令的死循环

- 

- ## 2、使用kubeadm引导集群

- 

- ### 1、下载各个机器需要的镜像

- ```
  sudo tee ./images.sh <<-'EOF'
  #!/bin/bash
  images=(
  kube-apiserver:v1.20.9
  kube-proxy:v1.20.9
  kube-controller-manager:v1.20.9
  kube-scheduler:v1.20.9
  coredns:1.7.0
  etcd:3.4.13-0
  pause:3.2
  )
  for imageName in ${images[@]} ; do
  docker pull registry.cn-hangzhou.aliyuncs.com/lfy_k8s_images/$imageName
  done
  EOF
     
  chmod +x ./images.sh && ./images.sh
  ```

- ### 2、初始化主节点

- ```
  #所有机器添加master域名映射，以下需要修改为自己的
  echo "172.31.0.4  cluster-endpoint" >> /etc/hosts
  
  
  
  #主节点初始化
  kubeadm init \
  --apiserver-advertise-address=172.31.0.4 \
  --control-plane-endpoint=cluster-endpoint \
  --image-repository registry.cn-hangzhou.aliyuncs.com/lfy_k8s_images \
  --kubernetes-version v1.20.9 \
  --service-cidr=10.96.0.0/16 \
  --pod-network-cidr=192.168.0.0/16
  
  #所有网络范围不重叠
  
  ```

- 

- ```
  Your Kubernetes control-plane has initialized successfully!
  
  To start using your cluster, you need to run the following as a regular user:
  
    mkdir -p $HOME/.kube
    sudo cp -i /etc/kubernetes/admin.conf $HOME/.kube/config
    sudo chown $(id -u):$(id -g) $HOME/.kube/config
  
  Alternatively, if you are the root user, you can run:
  
    export KUBECONFIG=/etc/kubernetes/admin.conf
  
  You should now deploy a pod network to the cluster.
  Run "kubectl apply -f [podnetwork].yaml" with one of the options listed at:
    https://kubernetes.io/docs/concepts/cluster-administration/addons/
  
  You can now join any number of control-plane nodes by copying certificate authorities
  and service account keys on each node and then running the following as root:
  
    kubeadm join cluster-endpoint:6443 --token hums8f.vyx71prsg74ofce7 \
      --discovery-token-ca-cert-hash sha256:a394d059dd51d68bb007a532a037d0a477131480ae95f75840c461e85e2c6ae3 \
      --control-plane 
  
  Then you can join any number of worker nodes by running the following on each as root:
  
  kubeadm join cluster-endpoint:6443 --token hums8f.vyx71prsg74ofce7 \
      --discovery-token-ca-cert-hash sha256:a394d059dd51d68bb007a532a037d0a477131480ae95f75840c461e85e2c6ae3
  ```

- 

- ```
  #查看集群所有节点
  kubectl get nodes
  
  #根据配置文件，给集群创建资源
  kubectl apply -f xxxx.yaml
  
  #查看集群部署了哪些应用？
  docker ps   ===   kubectl get pods -A
  # 运行中的应用在docker里面叫容器，在k8s里面叫Pod
  kubectl get pods -A
  ```

- 

- ### 3、根据提示继续

- master成功后提示如下：

- ![image.png](https://cdn.nlark.com/yuque/0/2021/png/1613913/1625467146849-06edb92b-9e09-4118-a5eb-8296c23d0c7c.png?x-oss-process=image%2Fwatermark%2Ctype_d3F5LW1pY3JvaGVp%2Csize_37%2Ctext_YXRndWlndS5jb20gIOWwmuehheiwtw%3D%3D%2Ccolor_FFFFFF%2Cshadow_50%2Ct_80%2Cg_se%2Cx_10%2Cy_10)

- #### 1、设置.kube/config

- 复制上面命令

- #### 2、安装网络组件

- [calico官网](https://docs.projectcalico.org/getting-started/kubernetes/self-managed-onprem/onpremises#install-calico-with-kubernetes-api-datastore-more-than-50-nodes)

- ```
  curl https://docs.projectcalico.org/manifests/calico.yaml -O
  
  kubectl apply -f calico.yaml
  ```

- ### 4、加入node节点

- ```
  kubeadm join cluster-endpoint:6443 --token x5g4uy.wpjjdbgra92s25pp \
  	--discovery-token-ca-cert-hash sha256:6255797916eaee52bf9dda9429db616fcd828436708345a308f4b917d3457a22
  ```

- 新令牌

- kubeadm token create --print-join-command

- ***高可用部署方式，也是在这一步的时候，使用添加主节点的命令即可\***

- 

- ### 5、验证集群

- - 验证集群节点状态

- - - kubectl get nodes

  - ### 6、部署dashboard

  - #### 1、部署

  - kubernetes官方提供的可视化界面

  - https://github.com/kubernetes/dashboard

  - ```
    kubectl apply -f https://raw.githubusercontent.com/kubernetes/dashboard/v2.3.1/aio/deploy/recommended.yaml
    ```

  - 

  - ```
    # Copyright 2017 The Kubernetes Authors.
    #
    # Licensed under the Apache License, Version 2.0 (the "License");
    # you may not use this file except in compliance with the License.
    # You may obtain a copy of the License at
    #
    #     http://www.apache.org/licenses/LICENSE-2.0
    #
    # Unless required by applicable law or agreed to in writing, software
    # distributed under the License is distributed on an "AS IS" BASIS,
    # WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    # See the License for the specific language governing permissions and
    # limitations under the License.
    
    apiVersion: v1
    kind: Namespace
    metadata:
      name: kubernetes-dashboard
    
    ---
    
    apiVersion: v1
    kind: ServiceAccount
    metadata:
      labels:
        k8s-app: kubernetes-dashboard
      name: kubernetes-dashboard
      namespace: kubernetes-dashboard
    
    ---
    
    kind: Service
    apiVersion: v1
    metadata:
      labels:
        k8s-app: kubernetes-dashboard
      name: kubernetes-dashboard
      namespace: kubernetes-dashboard
    spec:
      ports:
        - port: 443
          targetPort: 8443
      selector:
        k8s-app: kubernetes-dashboard
    
    ---
    
    apiVersion: v1
    kind: Secret
    metadata:
      labels:
        k8s-app: kubernetes-dashboard
      name: kubernetes-dashboard-certs
      namespace: kubernetes-dashboard
    type: Opaque
    
    ---
    
    apiVersion: v1
    kind: Secret
    metadata:
      labels:
        k8s-app: kubernetes-dashboard
      name: kubernetes-dashboard-csrf
      namespace: kubernetes-dashboard
    type: Opaque
    data:
      csrf: ""
    
    ---
    
    apiVersion: v1
    kind: Secret
    metadata:
      labels:
        k8s-app: kubernetes-dashboard
      name: kubernetes-dashboard-key-holder
      namespace: kubernetes-dashboard
    type: Opaque
    
    ---
    
    kind: ConfigMap
    apiVersion: v1
    metadata:
      labels:
        k8s-app: kubernetes-dashboard
      name: kubernetes-dashboard-settings
      namespace: kubernetes-dashboard
    
    ---
    
    kind: Role
    apiVersion: rbac.authorization.k8s.io/v1
    metadata:
      labels:
        k8s-app: kubernetes-dashboard
      name: kubernetes-dashboard
      namespace: kubernetes-dashboard
    rules:
      # Allow Dashboard to get, update and delete Dashboard exclusive secrets.
      - apiGroups: [""]
        resources: ["secrets"]
        resourceNames: ["kubernetes-dashboard-key-holder", "kubernetes-dashboard-certs", "kubernetes-dashboard-csrf"]
        verbs: ["get", "update", "delete"]
        # Allow Dashboard to get and update 'kubernetes-dashboard-settings' config map.
      - apiGroups: [""]
        resources: ["configmaps"]
        resourceNames: ["kubernetes-dashboard-settings"]
        verbs: ["get", "update"]
        # Allow Dashboard to get metrics.
      - apiGroups: [""]
        resources: ["services"]
        resourceNames: ["heapster", "dashboard-metrics-scraper"]
        verbs: ["proxy"]
      - apiGroups: [""]
        resources: ["services/proxy"]
        resourceNames: ["heapster", "http:heapster:", "https:heapster:", "dashboard-metrics-scraper", "http:dashboard-metrics-scraper"]
        verbs: ["get"]
    
    ---
    
    kind: ClusterRole
    apiVersion: rbac.authorization.k8s.io/v1
    metadata:
      labels:
        k8s-app: kubernetes-dashboard
      name: kubernetes-dashboard
    rules:
      # Allow Metrics Scraper to get metrics from the Metrics server
      - apiGroups: ["metrics.k8s.io"]
        resources: ["pods", "nodes"]
        verbs: ["get", "list", "watch"]
    
    ---
    
    apiVersion: rbac.authorization.k8s.io/v1
    kind: RoleBinding
    metadata:
      labels:
        k8s-app: kubernetes-dashboard
      name: kubernetes-dashboard
      namespace: kubernetes-dashboard
    roleRef:
      apiGroup: rbac.authorization.k8s.io
      kind: Role
      name: kubernetes-dashboard
    subjects:
      - kind: ServiceAccount
        name: kubernetes-dashboard
        namespace: kubernetes-dashboard
    
    ---
    
    apiVersion: rbac.authorization.k8s.io/v1
    kind: ClusterRoleBinding
    metadata:
      name: kubernetes-dashboard
    roleRef:
      apiGroup: rbac.authorization.k8s.io
      kind: ClusterRole
      name: kubernetes-dashboard
    subjects:
      - kind: ServiceAccount
        name: kubernetes-dashboard
        namespace: kubernetes-dashboard
    
    ---
    
    kind: Deployment
    apiVersion: apps/v1
    metadata:
      labels:
        k8s-app: kubernetes-dashboard
      name: kubernetes-dashboard
      namespace: kubernetes-dashboard
    spec:
      replicas: 1
      revisionHistoryLimit: 10
      selector:
        matchLabels:
          k8s-app: kubernetes-dashboard
      template:
        metadata:
          labels:
            k8s-app: kubernetes-dashboard
        spec:
          containers:
            - name: kubernetes-dashboard
              image: kubernetesui/dashboard:v2.3.1
              imagePullPolicy: Always
              ports:
                - containerPort: 8443
                  protocol: TCP
              args:
                - --auto-generate-certificates
                - --namespace=kubernetes-dashboard
                # Uncomment the following line to manually specify Kubernetes API server Host
                # If not specified, Dashboard will attempt to auto discover the API server and connect
                # to it. Uncomment only if the default does not work.
                # - --apiserver-host=http://my-address:port
              volumeMounts:
                - name: kubernetes-dashboard-certs
                  mountPath: /certs
                  # Create on-disk volume to store exec logs
                - mountPath: /tmp
                  name: tmp-volume
              livenessProbe:
                httpGet:
                  scheme: HTTPS
                  path: /
                  port: 8443
                initialDelaySeconds: 30
                timeoutSeconds: 30
              securityContext:
                allowPrivilegeEscalation: false
                readOnlyRootFilesystem: true
                runAsUser: 1001
                runAsGroup: 2001
          volumes:
            - name: kubernetes-dashboard-certs
              secret:
                secretName: kubernetes-dashboard-certs
            - name: tmp-volume
              emptyDir: {}
          serviceAccountName: kubernetes-dashboard
          nodeSelector:
            "kubernetes.io/os": linux
          # Comment the following tolerations if Dashboard must not be deployed on master
          tolerations:
            - key: node-role.kubernetes.io/master
              effect: NoSchedule
    
    ---
    
    kind: Service
    apiVersion: v1
    metadata:
      labels:
        k8s-app: dashboard-metrics-scraper
      name: dashboard-metrics-scraper
      namespace: kubernetes-dashboard
    spec:
      ports:
        - port: 8000
          targetPort: 8000
      selector:
        k8s-app: dashboard-metrics-scraper
    
    ---
    
    kind: Deployment
    apiVersion: apps/v1
    metadata:
      labels:
        k8s-app: dashboard-metrics-scraper
      name: dashboard-metrics-scraper
      namespace: kubernetes-dashboard
    spec:
      replicas: 1
      revisionHistoryLimit: 10
      selector:
        matchLabels:
          k8s-app: dashboard-metrics-scraper
      template:
        metadata:
          labels:
            k8s-app: dashboard-metrics-scraper
          annotations:
            seccomp.security.alpha.kubernetes.io/pod: 'runtime/default'
        spec:
          containers:
            - name: dashboard-metrics-scraper
              image: kubernetesui/metrics-scraper:v1.0.6
              ports:
                - containerPort: 8000
                  protocol: TCP
              livenessProbe:
                httpGet:
                  scheme: HTTP
                  path: /
                  port: 8000
                initialDelaySeconds: 30
                timeoutSeconds: 30
              volumeMounts:
              - mountPath: /tmp
                name: tmp-volume
              securityContext:
                allowPrivilegeEscalation: false
                readOnlyRootFilesystem: true
                runAsUser: 1001
                runAsGroup: 2001
          serviceAccountName: kubernetes-dashboard
          nodeSelector:
            "kubernetes.io/os": linux
          # Comment the following tolerations if Dashboard must not be deployed on master
          tolerations:
            - key: node-role.kubernetes.io/master
              effect: NoSchedule
          volumes:
            - name: tmp-volume
              emptyDir: {}
    ```

  - #### 2、设置访问端口

  - ```
    kubectl edit svc kubernetes-dashboard -n kubernetes-dashboard
    ```

  - type: ClusterIP 改为 type: NodePort

  - 

  - ```
    kubectl get svc -A |grep kubernetes-dashboard
    ## 找到端口，在安全组放行
    ```

  - 访问： https://集群任意IP:端口      https://139.198.165.238:32759

  - 

  - #### 3、创建访问账号

  - ```
    #创建访问账号，准备一个yaml文件； vi dash.yaml
    apiVersion: v1
    kind: ServiceAccount
    metadata:
      name: admin-user
      namespace: kubernetes-dashboard
    ---
    apiVersion: rbac.authorization.k8s.io/v1
    kind: ClusterRoleBinding
    metadata:
      name: admin-user
    roleRef:
      apiGroup: rbac.authorization.k8s.io
      kind: ClusterRole
      name: cluster-admin
    subjects:
    - kind: ServiceAccount
      name: admin-user
      namespace: kubernetes-dashboard
    ```

  - ```
    kubectl apply -f dash.yaml
    ```

  - 

  - #### 4、令牌访问

  - ```
    #获取访问令牌
    kubectl -n kubernetes-dashboard get secret $(kubectl -n kubernetes-dashboard get sa/admin-user -o jsonpath="{.secrets[0].name}") -o go-template="{{.data.token | base64decode}}"
    ```

  - 

  - ```
    eyJhbGciOiJSUzI1NiIsImtpZCI6InpXSkU0TjhCUmVKQzBJaC03Nk9ES2NMZ1daRTRmQ1FMZU9rRUJ3VXRnM3MifQ.eyJpc3MiOiJrdWJlcm5ldGVzL3NlcnZpY2VhY2NvdW50Iiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9uYW1lc3BhY2UiOiJrdWJlcm5ldGVzLWRhc2hib2FyZCIsImt1YmVybmV0ZXMuaW8vc2VydmljZWFjY291bnQvc2VjcmV0Lm5hbWUiOiJhZG1pbi11c2VyLXRva2VuLXgyczhmIiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9zZXJ2aWNlLWFjY291bnQubmFtZSI6ImFkbWluLXVzZXIiLCJrdWJlcm5ldGVzLmlvL3NlcnZpY2VhY2NvdW50L3NlcnZpY2UtYWNjb3VudC51aWQiOiIzOTZmYjdlNS0wMjA2LTQxMjctOGQzYS0xMzRlODVmYjU0MDAiLCJzdWIiOiJzeXN0ZW06c2VydmljZWFjY291bnQ6a3ViZXJuZXRlcy1kYXNoYm9hcmQ6YWRtaW4tdXNlciJ9.Hf5mhl35_R0iBfBW7fF198h_klEnN6pRKfk_roAzOtAN-Aq21E4804PUhe9Rr9e_uFzLfoFDXacjJrHCuhiML8lpHIfJLK_vSD2pZNaYc2NWZq2Mso-BMGpObxGA23hW0nLQ5gCxlnxIAcyE76aYTAB6U8PxpvtVdgUknBVrwXG8UC_D8kHm9PTwa9jgbZfSYAfhOHWmZxNYo7CF2sHH-AT_WmIE8xLmB7J11vDzaunv92xoUoI0ju7OBA2WRr61bOmSd8WJgLCDcyBblxz4Wa-3zghfKlp0Rgb8l56AAI7ML_snF59X6JqaCuAcCJjIu0FUTS5DuyIObEeXY-z-Rw
    ```

  - 

  - #### 5、界面

  - ![image.png](https://cdn.nlark.com/yuque/0/2021/png/1613913/1625476485187-1893393c-5e0b-4d0a-ab57-e403b3a714dd.png?x-oss-process=image%2Fwatermark%2Ctype_d3F5LW1pY3JvaGVp%2Csize_54%2Ctext_YXRndWlndS5jb20gIOWwmuehheiwtw%3D%3D%2Ccolor_FFFFFF%2Cshadow_50%2Ct_80%2Cg_se%2Cx_10%2Cy_10)

  - 

  - 

## 三、核心概念

**1、Pod**

Pod 是 K8S 中最重要也是最基本的概念，Pod 是最小的部署单元，是一组容器的集合。每个 Pod 都由一个特殊的根容器 Pause 容器，以及一个或多个紧密相关的用户业务容器组成。

Pause 容器作为 Pod 的根容器，以它的状态代表整个容器组的状态。K8S 为每个 Pod 都分配了唯一的 IP 地址，称之为 Pod IP。Pod 里的多个业务容器共享 Pause 容器的IP，共享 Pause 容器挂载的 Volume。

**2、Label**

标签，附加到某个资源上，用于关联对象、查询和筛选。一个 Label 是一个 key=value 的键值对，key 与 value 由用户自己指定。Label 可以附加到各种资源上，一个资源对象可以定义任意数量的 Label，同一个 Label 也可以被添加到任意数量的资源上。

我们可以通过给指定的资源对象捆绑一个或多个不同的 Label 来实现多维度的资源分组管理功能，以便于灵活、方便地进行资源分配、调度、配置、部署等工作。

K8S 通过 Label Selector（标签选择器）来查询和筛选拥有某些 Label 的资源对象。Label Selector 有基于等式（ name=label1 ）和基于集合（ name in (label1, label2) ）的两种方式。

**3、ReplicaSet（RC）**

ReplicaSet 用来确保预期的 Pod 副本数量，如果有过多的 Pod 副本在运行，系统就会停掉一些 Pod，否则系统就会再自动创建一些 Pod。

我们很少单独使用 ReplicaSet，它主要被 Deployment 这个更高层的资源对象使用，从而形成一整套 Pod 创建、删除、更新的编排机制。

**4、Deployment**

Deployment 用于部署无状态应用，Deployment 为 Pod 和 ReplicaSet 提供声明式更新，只需要在 Deployment 描述想要的目标状态，Deployment 就会将 Pod 和 ReplicaSet 的实际状态改变到目标状态。

**5、Horizontal Pod Autoscaler（HPA）**

HPA 为 Pod 横向自动扩容，也是 K8S 的一种资源对象。HPA 通过追踪分析 RC 的所有目标 Pod 的负载变化情况，来确定是否需要针对性调整目标 Pod 的副本数量。

**6、Service**

Service 定义了一个服务的访问入口，通过 Label Selector 与 Pod 副本集群之间“无缝对接”，定义了一组 Pod 的访问策略，防止 Pod 失联。

创建 Service 时，K8S会自动为它分配一个全局唯一的虚拟 IP 地址，即 Cluster IP。服务发现就是通过 Service 的 Name 和 Service 的 ClusterIP 地址做一个 DNS 域名映射来解决的。

**7、Namespace**

命名空间，Namespace 多用于实现多租户的资源隔离。Namespace 通过将集群内部的资源对象“分配”到不同的Namespace中，形成逻辑上分组的不同项目、小组或用户组。

K8S 集群在启动后，会创建一个名为 default 的 Namespace，如果不特别指明 Namespace，创建的 Pod、RC、Service 都将被创建到 default 下。

当我们给每个租户创建一个 Namespace 来实现多租户的资源隔离时，还可以结合 K8S 的资源配额管理，限定不同租户能占用的资源，例如 CPU 使用量、内存使用量等。





# 四、PostgreSQL安装

### 准备工作

> 系统：Centos7.6 / 64 位
> [PostgreSQL](https://links.jianshu.com/go?to=https%3A%2F%2Fwww.postgresql.org%2Fdownload%2Flinux%2Fredhat%2F)：v12.7

```
# Install the repository RPM:
sudo yum install -y https://download.postgresql.org/pub/repos/yum/reporpms/EL-7-x86_64/pgdg-redhat-repo-latest.noarch.rpm

# Install PostgreSQL:
sudo yum install -y postgresql12-server

# Optionally initialize the database and enable automatic start:
sudo /usr/pgsql-12/bin/postgresql-12-setup initdb
sudo systemctl enable postgresql-12
sudo systemctl start postgresql-12
```

![img](https://upload-images.jianshu.io/upload_images/13766704-7e3c519ee208b146.png?imageMogr2/auto-orient/strip|imageView2/2/format/webp)



### 修改配置（设置密码 + 远程访问）

###### 设置密码

https://www.jianshu.com/p/3bbb97c88ca4

## docker安装并持久化PostgreSQL

- 拉取镜像

```
docker pull postgres:13.5
```

![image-20211222161946878](images\image-20211222161946878.png)



- 创建`/usr/postgresql/data`文件夹，用来做持久化并启动容器

```
docker run --name postgresql_001 -e POSTGRES_PASSWORD=密码 -p 5432:5432 -v /usr/postgresql/data:/var/lib/postgresql/data -d postgres:13.5
```

