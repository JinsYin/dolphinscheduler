# EScheduler

大数据调度平台

## 模块

- `dolphinschduler-tools`
  - 汇聚
    - `dolphinsheduler-common` 模块的 `common.properties`
    - `dolphinschduler-dao` 模块的 SQL
    - `script` 目录下的 `dolphinscheduler_env.sh`，用于覆盖 Spring Boot 的应用配置
    - 本模块的 shell 、`application.yaml``
    - 归集 parent 项目的所有依赖到 `libs` 目录
  - 用法
    - 构建模块：`mvnw clean package -pl :dolphinscheduler-tools -am`
    - 构建 Docker 镜像：`mvnw exec:exec -pl :dolphinscheduler-tools -am -P docker -Dexec.executable="docker-build" [-Dexec.executable="docker-push]`
    - 初始化 SQL Schema：1. 修改 `conf/application.yaml` 以覆盖配置；2. `bash create-schema.sh`
