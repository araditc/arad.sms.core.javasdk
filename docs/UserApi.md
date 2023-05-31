# UserApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiUserUserInfoGet**](UserApi.md#apiUserUserInfoGet) | **GET** /api/user/UserInfo | 

<a name="apiUserUserInfoGet"></a>
# **apiUserUserInfoGet**
> apiUserUserInfoGet(apiVersion)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
String apiVersion = "apiVersion_example"; // String | 
try {
    apiInstance.apiUserUserInfoGet(apiVersion);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#apiUserUserInfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiVersion** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

