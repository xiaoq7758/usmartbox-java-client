# BranchApi

All URIs are relative to *https://api.usmartbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchBranch**](BranchApi.md#searchBranch) | **POST** /ec/branch.json | 根据城市及区号查询下属网点

<a name="searchBranch"></a>
# **searchBranch**
> BranchSearchResponse searchBranch(apikey, nonce, sign, city, district, orderid, phone)

根据城市及区号查询下属网点

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BranchApi;


BranchApi apiInstance = new BranchApi();
String apikey = "apikey_example"; // String | key
String nonce = "nonce_example"; // String | 32位随机数
String sign = "sign_example"; // String | 用于校验
String city = "city_example"; // String | 城市编号
String district = "district_example"; // String | 区号编号
String orderid = "orderid_example"; // String | 订单号(条形码上内容)
String phone = "phone_example"; // String | 收件人手机号
try {
    BranchSearchResponse result = apiInstance.searchBranch(apikey, nonce, sign, city, district, orderid, phone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchApi#searchBranch");
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
 **orderid** | **String**| 订单号(条形码上内容) | [optional]
 **phone** | **String**| 收件人手机号 | [optional]

### Return type

[**BranchSearchResponse**](BranchSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: applicaiton/json

