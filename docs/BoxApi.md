# BoxApi

All URIs are relative to *https://api.usmartbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**remotePutInBox**](BoxApi.md#remotePutInBox) | **POST** /ec/cun.json | 远程存
[**remotePutInBoxHistory**](BoxApi.md#remotePutInBoxHistory) | **POST** /ec/cunr.json | 远程存
[**remoteTakeOutBox**](BoxApi.md#remoteTakeOutBox) | **POST** /ec/qu.json | 远程取
[**remoteTakeOutHistory**](BoxApi.md#remoteTakeOutHistory) | **POST** /ec/qur.json | 查询取件状态
[**searchBox**](BoxApi.md#searchBox) | **POST** /ec/box.json | 根据城市及区号及网点编号查询下属柜子
[**searchBranchBox**](BoxApi.md#searchBranchBox) | **POST** /ec/branchbox.json | 根据城市及区号查询下属网点及柜子

<a name="remotePutInBox"></a>
# **remotePutInBox**
> RemotePutInResponse remotePutInBox(apikey, nonce, sign, boxno, butype, func, kphone, orderid, phone, size)

远程存

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoxApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| key |
 **nonce** | **String**| 32位随机数 |
 **sign** | **String**| 用于校验 |
 **boxno** | **String**| 柜子编号 | [optional]
 **butype** | **String**| 业务类型 | [optional]
 **func** | **String**| 格子功能 目前1常温2冷藏 | [optional] [enum: 1, 2]
 **kphone** | **String**| 配送员手机号 | [optional]
 **orderid** | **String**| 订单号 | [optional]
 **phone** | **String**| 收货人手机号 | [optional]
 **size** | **String**| 格子大小 | [optional]

### Return type

[**RemotePutInResponse**](RemotePutInResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: applicaiton/json

<a name="remotePutInBoxHistory"></a>
# **remotePutInBoxHistory**
> RemotePutInHistoryResponse remotePutInBoxHistory(apikey, nonce, sign, orderid)

远程存

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoxApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| key |
 **nonce** | **String**| 32位随机数 |
 **sign** | **String**| 用于校验 |
 **orderid** | **String**| 订单号 | [optional]

### Return type

[**RemotePutInHistoryResponse**](RemotePutInHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: applicaiton/json

<a name="remoteTakeOutBox"></a>
# **remoteTakeOutBox**
> RemoteTakeOutResponse remoteTakeOutBox(apikey, nonce, sign, gridno, opencode, seqid)

远程取

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoxApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| key |
 **nonce** | **String**| 32位随机数 |
 **sign** | **String**| 用于校验 |
 **gridno** | **String**| 完整格号 |
 **opencode** | **String**| 取货密码 |
 **seqid** | **String**| 流水号 |

### Return type

[**RemoteTakeOutResponse**](RemoteTakeOutResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: applicaiton/json

<a name="remoteTakeOutHistory"></a>
# **remoteTakeOutHistory**
> RemoteTakeOutResponse remoteTakeOutHistory(apikey, nonce, sign, gridno, seqid)

查询取件状态

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoxApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| key |
 **nonce** | **String**| 32位随机数 |
 **sign** | **String**| 用于校验 |
 **gridno** | **String**| 完整格号 |
 **seqid** | **String**| 流水号 |

### Return type

[**RemoteTakeOutResponse**](RemoteTakeOutResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: applicaiton/json

<a name="searchBox"></a>
# **searchBox**
> BoxSearchResponse searchBox(apikey, nonce, sign, city, district, branchno)

根据城市及区号及网点编号查询下属柜子

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoxApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| key |
 **nonce** | **String**| 32位随机数 |
 **sign** | **String**| 用于校验 |
 **city** | **String**| 城市编号 | [optional]
 **district** | **String**| 区号编号 | [optional]
 **branchno** | **String**| 网点编号 | [optional]

### Return type

[**BoxSearchResponse**](BoxSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: applicaiton/json

<a name="searchBranchBox"></a>
# **searchBranchBox**
> BranchBoxSearchResponse searchBranchBox(apikey, nonce, sign, city, district)

根据城市及区号查询下属网点及柜子

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoxApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| key |
 **nonce** | **String**| 32位随机数 |
 **sign** | **String**| 用于校验 |
 **city** | **String**| 城市编号 | [optional]
 **district** | **String**| 区号编号 | [optional]

### Return type

[**BranchBoxSearchResponse**](BranchBoxSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: applicaiton/json

