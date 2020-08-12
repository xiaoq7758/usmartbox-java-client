# OrderApi

All URIs are relative to *https://api.usmartbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ordercreate**](OrderApi.md#ordercreate) | **POST** /ec/ordercreate.json | 电商端生成订单后通知智能柜服务器端

<a name="ordercreate"></a>
# **ordercreate**
> BasicApiResponse ordercreate(apikey, nonce, sign, orderid, phone, cardfaceno, cardno)

电商端生成订单后通知智能柜服务器端

### Example
```java
// Import classes:
//import ApiException;
//import OrderApi;


OrderApi apiInstance = new OrderApi();
String apikey = "apikey_example"; // String | key
String nonce = "nonce_example"; // String | 32位随机数
String sign = "sign_example"; // String | 用于校验
String orderid = "orderid_example"; // String | 订单号(条形码上内容)
String phone = "phone_example"; // String | 收件人手机号
String cardfaceno = "cardfaceno_example"; // String | 卡面号(印刷在卡表面的编号)
String cardno = "cardno_example"; // String | 卡内芯片号(取IC卡号前10位)
try {
    BasicApiResponse result = apiInstance.ordercreate(apikey, nonce, sign, orderid, phone, cardfaceno, cardno);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#ordercreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| key |
 **nonce** | **String**| 32位随机数 |
 **sign** | **String**| 用于校验 |
 **orderid** | **String**| 订单号(条形码上内容) |
 **phone** | **String**| 收件人手机号 |
 **cardfaceno** | **String**| 卡面号(印刷在卡表面的编号) | [optional]
 **cardno** | **String**| 卡内芯片号(取IC卡号前10位) | [optional]

### Return type

[**BasicApiResponse**](BasicApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: applicaiton/json

