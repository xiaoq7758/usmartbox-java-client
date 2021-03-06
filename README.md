# swagger-java-client

电商对接API参考文档
- API version: 2.2.2
  - Build date: 2020-08-11T11:40:26.060Z[GMT]

电商对接API参考文档


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>cn.acey.integrate</groupId>
  <artifactId>sdk-usmartbod</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "cn.acey.integrate:sdk-usmartbod:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/sdk-usmartbod-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import cn.acey.integrate.usmartbox.client.*;
import cn.acey.integrate.usmartbox.client.auth.*;
import cn.acey.integrate.usmartbox.client.model.*;
import cn.acey.integrate.usmartbox.client.api.BoxApi;

import java.io.File;
import java.util.*;

public class BoxApiExample {

    public static void main(String[] args) {
        
        BoxApi apiInstance = new BoxApi();
        String apikey = "apikey_example"; // String | key
        String nonce = "nonce_example"; // String | 32位随机数
        String sign = "sign_example"; // String | 用于校验
        String boxno = "boxno_example"; // String | 柜子编号
        String butype = "butype_example"; // String | 业务类型
        String func = "func_example"; // String | 格子功能 目前1常温2冷藏
        String kphone = "kphone_example"; // String | 配送员手机号
        String orderid = "orderid_example"; // String | 订单号
        String phone = "phone_example"; // String | 收货人手机号
        String size = "size_example"; // String | 格子大小
        try {
            RemotePutInResponse result = apiInstance.remotePutInBox(apikey, nonce, sign, boxno, butype, func, kphone, orderid, phone, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BoxApi#remotePutInBox");
            e.printStackTrace();
        }
    }
}
import cn.acey.integrate.usmartbox.client.*;
import cn.acey.integrate.usmartbox.client.auth.*;
import cn.acey.integrate.usmartbox.client.model.*;
import cn.acey.integrate.usmartbox.client.api.BoxApi;

import java.io.File;
import java.util.*;

public class BoxApiExample {

    public static void main(String[] args) {
        
        BoxApi apiInstance = new BoxApi();
        String apikey = "apikey_example"; // String | key
        String nonce = "nonce_example"; // String | 32位随机数
        String sign = "sign_example"; // String | 用于校验
        String orderid = "orderid_example"; // String | 订单号
        try {
            RemotePutInHistoryResponse result = apiInstance.remotePutInBoxHistory(apikey, nonce, sign, orderid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BoxApi#remotePutInBoxHistory");
            e.printStackTrace();
        }
    }
}
import cn.acey.integrate.usmartbox.client.*;
import cn.acey.integrate.usmartbox.client.auth.*;
import cn.acey.integrate.usmartbox.client.model.*;
import cn.acey.integrate.usmartbox.client.api.BoxApi;

import java.io.File;
import java.util.*;

public class BoxApiExample {

    public static void main(String[] args) {
        
        BoxApi apiInstance = new BoxApi();
        String apikey = "apikey_example"; // String | key
        String nonce = "nonce_example"; // String | 32位随机数
        String sign = "sign_example"; // String | 用于校验
        String gridno = "gridno_example"; // String | 完整格号
        String opencode = "opencode_example"; // String | 取货密码
        String seqid = "seqid_example"; // String | 流水号
        try {
            RemoteTakeOutResponse result = apiInstance.remoteTakeOutBox(apikey, nonce, sign, gridno, opencode, seqid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BoxApi#remoteTakeOutBox");
            e.printStackTrace();
        }
    }
}
import cn.acey.integrate.usmartbox.client.*;
import cn.acey.integrate.usmartbox.client.auth.*;
import cn.acey.integrate.usmartbox.client.model.*;
import cn.acey.integrate.usmartbox.client.api.BoxApi;

import java.io.File;
import java.util.*;

public class BoxApiExample {

    public static void main(String[] args) {
        
        BoxApi apiInstance = new BoxApi();
        String apikey = "apikey_example"; // String | key
        String nonce = "nonce_example"; // String | 32位随机数
        String sign = "sign_example"; // String | 用于校验
        String gridno = "gridno_example"; // String | 完整格号
        String seqid = "seqid_example"; // String | 流水号
        try {
            RemoteTakeOutResponse result = apiInstance.remoteTakeOutHistory(apikey, nonce, sign, gridno, seqid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BoxApi#remoteTakeOutHistory");
            e.printStackTrace();
        }
    }
}
import cn.acey.integrate.usmartbox.client.*;
import cn.acey.integrate.usmartbox.client.auth.*;
import cn.acey.integrate.usmartbox.client.model.*;
import cn.acey.integrate.usmartbox.client.api.BoxApi;

import java.io.File;
import java.util.*;

public class BoxApiExample {

    public static void main(String[] args) {
        
        BoxApi apiInstance = new BoxApi();
        String apikey = "apikey_example"; // String | key
        String nonce = "nonce_example"; // String | 32位随机数
        String sign = "sign_example"; // String | 用于校验
        String city = "city_example"; // String | 城市编号
        String district = "district_example"; // String | 区号编号
        String branchno = "branchno_example"; // String | 网点编号
        try {
            BoxSearchResponse result = apiInstance.searchBox(apikey, nonce, sign, city, district, branchno);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BoxApi#searchBox");
            e.printStackTrace();
        }
    }
}
import cn.acey.integrate.usmartbox.client.*;
import cn.acey.integrate.usmartbox.client.auth.*;
import cn.acey.integrate.usmartbox.client.model.*;
import cn.acey.integrate.usmartbox.client.api.BoxApi;

import java.io.File;
import java.util.*;

public class BoxApiExample {

    public static void main(String[] args) {
        
        BoxApi apiInstance = new BoxApi();
        String apikey = "apikey_example"; // String | key
        String nonce = "nonce_example"; // String | 32位随机数
        String sign = "sign_example"; // String | 用于校验
        String city = "city_example"; // String | 城市编号
        String district = "district_example"; // String | 区号编号
        try {
            BranchBoxSearchResponse result = apiInstance.searchBranchBox(apikey, nonce, sign, city, district);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BoxApi#searchBranchBox");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.usmartbox.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BoxApi* | [**remotePutInBox**](docs/BoxApi.md#remotePutInBox) | **POST** /ec/cun.json | 远程存
*BoxApi* | [**remotePutInBoxHistory**](docs/BoxApi.md#remotePutInBoxHistory) | **POST** /ec/cunr.json | 远程存
*BoxApi* | [**remoteTakeOutBox**](docs/BoxApi.md#remoteTakeOutBox) | **POST** /ec/qu.json | 远程取
*BoxApi* | [**remoteTakeOutHistory**](docs/BoxApi.md#remoteTakeOutHistory) | **POST** /ec/qur.json | 查询取件状态
*BoxApi* | [**searchBox**](docs/BoxApi.md#searchBox) | **POST** /ec/box.json | 根据城市及区号及网点编号查询下属柜子
*BoxApi* | [**searchBranchBox**](docs/BoxApi.md#searchBranchBox) | **POST** /ec/branchbox.json | 根据城市及区号查询下属网点及柜子
*BranchApi* | [**searchBranch**](docs/BranchApi.md#searchBranch) | **POST** /ec/branch.json | 根据城市及区号查询下属网点
*OrderApi* | [**ordercreate**](docs/OrderApi.md#ordercreate) | **POST** /ec/ordercreate.json | 电商端生成订单后通知智能柜服务器端

## Documentation for Models

 - [BasicApiResponse](docs/BasicApiResponse.md)
 - [Box](docs/Box.md)
 - [BoxSearchResponse](docs/BoxSearchResponse.md)
 - [Branch](docs/Branch.md)
 - [BranchBox](docs/BranchBox.md)
 - [BranchBoxSearchResponse](docs/BranchBoxSearchResponse.md)
 - [BranchSearchResponse](docs/BranchSearchResponse.md)
 - [RemotePutInHistoryResponse](docs/RemotePutInHistoryResponse.md)
 - [RemotePutInResponse](docs/RemotePutInResponse.md)
 - [RemoteTakeOutHistoryResponse](docs/RemoteTakeOutHistoryResponse.md)
 - [RemoteTakeOutResponse](docs/RemoteTakeOutResponse.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: apikey
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

qyang@yicksolutions.com
