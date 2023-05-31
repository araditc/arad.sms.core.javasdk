# MessagePatternApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiPatternMessageSendMultiplePost**](MessagePatternApi.md#apiPatternMessageSendMultiplePost) | **POST** /api/patternMessage/sendMultiple | 
[**apiPatternMessageSendPost**](MessagePatternApi.md#apiPatternMessageSendPost) | **POST** /api/patternMessage/send | 

<a name="apiPatternMessageSendMultiplePost"></a>
# **apiPatternMessageSendMultiplePost**
> apiPatternMessageSendMultiplePost(body, returnLongId, apiVersion)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagePatternApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

MessagePatternApi apiInstance = new MessagePatternApi();
List<PatternApiDto> body = Arrays.asList(new PatternApiDto()); // List<PatternApiDto> | 
Boolean returnLongId = true; // Boolean | 
String apiVersion = "apiVersion_example"; // String | 
try {
    apiInstance.apiPatternMessageSendMultiplePost(body, returnLongId, apiVersion);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagePatternApi#apiPatternMessageSendMultiplePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;PatternApiDto&gt;**](PatternApiDto.md)|  | [optional]
 **returnLongId** | **Boolean**|  | [optional]
 **apiVersion** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="apiPatternMessageSendPost"></a>
# **apiPatternMessageSendPost**
> apiPatternMessageSendPost(body, returnLongId, apiVersion)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagePatternApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

MessagePatternApi apiInstance = new MessagePatternApi();
PatternApiDto body = new PatternApiDto(); // PatternApiDto | 
Boolean returnLongId = true; // Boolean | 
String apiVersion = "apiVersion_example"; // String | 
try {
    apiInstance.apiPatternMessageSendPost(body, returnLongId, apiVersion);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagePatternApi#apiPatternMessageSendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PatternApiDto**](PatternApiDto.md)|  | [optional]
 **returnLongId** | **Boolean**|  | [optional]
 **apiVersion** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

