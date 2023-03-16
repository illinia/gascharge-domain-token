# gascharge-domain-token

토큰 도메인 관련 모듈

* token 엔티티, 레포지토리 클래스들

*module-yml, module-jpa 의존, 독립적으로 실행 불가능*

로컬, 원격 메이븐 레포지토리
```groovy
implementation 'com.gascharge.taemin:gascharge-domain-token:0.0.1-SNAPSHOT'
```

멀티 모듈 프로젝트
```groovy
// settings.gradle
includeProject("token", "domain")
```
```groovy
// build.gradle
implementation project(":gascharge-domain-token")
```

YAML 파일 설정은 https://github.com/illinia/gascharge-module-yml 참조