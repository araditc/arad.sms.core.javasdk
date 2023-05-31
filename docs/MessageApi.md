# MessageApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiMessageBulkPost**](MessageApi.md#apiMessageBulkPost) | **POST** /api/message/bulk | 
[**apiMessageGetDLRPost**](MessageApi.md#apiMessageGetDLRPost) | **POST** /api/message/GetDLR | 
[**apiMessageGetMOByDateGet**](MessageApi.md#apiMessageGetMOByDateGet) | **GET** /api/message/GetMOByDate | 
[**apiMessageGetMOGet**](MessageApi.md#apiMessageGetMOGet) | **GET** /api/message/GetMO | 
[**apiMessageSendGet**](MessageApi.md#apiMessageSendGet) | **GET** /api/message/send | 
[**apiMessageSendPost**](MessageApi.md#apiMessageSendPost) | **POST** /api/message/send | 

<a name="apiMessageBulkPost"></a>
# **apiMessageBulkPost**
> apiMessageBulkPost(body, returnLongId, apiVersion)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

MessageApi apiInstance = new MessageApi();
AradBulkMessage body = new AradBulkMessage(); // AradBulkMessage | 
Boolean returnLongId = true; // Boolean | 
String apiVersion = "apiVersion_example"; // String | 
try {
    apiInstance.apiMessageBulkPost(body, returnLongId, apiVersion);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#apiMessageBulkPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AradBulkMessage**](AradBulkMessage.md)|  | [optional]
 **returnLongId** | **Boolean**|  | [optional]
 **apiVersion** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="apiMessageGetDLRPost"></a>
# **apiMessageGetDLRPost**
> apiMessageGetDLRPost(body, returnLongId, returnUDH, apiVersion)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

MessageApi apiInstance = new MessageApi();
List<String> body = Arrays.asList("body_example"); // List<String> | 
Boolean returnLongId = true; // Boolean | 
Boolean returnUDH = true; // Boolean | 
String apiVersion = "apiVersion_example"; // String | 
try {
    apiInstance.apiMessageGetDLRPost(body, returnLongId, returnUDH, apiVersion);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#apiMessageGetDLRPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **returnLongId** | **Boolean**|  | [optional]
 **returnUDH** | **Boolean**|  | [optional]
 **apiVersion** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="apiMessageGetMOByDateGet"></a>
# **apiMessageGetMOByDateGet**
> apiMessageGetMOByDateGet(startDateTime, endDateTime, returnId, apiVersion)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

MessageApi apiInstance = new MessageApi();
OffsetDateTime startDateTime = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime endDateTime = new OffsetDateTime(); // OffsetDateTime | 
Boolean returnId = true; // Boolean | 
String apiVersion = "apiVersion_example"; // String | 
try {
    apiInstance.apiMessageGetMOByDateGet(startDateTime, endDateTime, returnId, apiVersion);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#apiMessageGetMOByDateGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDateTime** | **OffsetDateTime**|  | [optional]
 **endDateTime** | **OffsetDateTime**|  | [optional]
 **returnId** | **Boolean**|  | [optional]
 **apiVersion** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiMessageGetMOGet"></a>
# **apiMessageGetMOGet**
> apiMessageGetMOGet(returnId, apiVersion)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

MessageApi apiInstance = new MessageApi();
Boolean returnId = true; // Boolean | 
String apiVersion = "apiVersion_example"; // String | 
try {
    apiInstance.apiMessageGetMOGet(returnId, apiVersion);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#apiMessageGetMOGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnId** | **Boolean**|  | [optional]
 **apiVersion** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiMessageSendGet"></a>
# **apiMessageSendGet**
> apiMessageSendGet(destinationAddress, sourceAddress, messageText, returnLongId, port, referenceNumberType, validityPeriod, apiVersion)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

MessageApi apiInstance = new MessageApi();
String destinationAddress = "destinationAddress_example"; // String | 
String sourceAddress = "sourceAddress_example"; // String | 
String messageText = "messageText_example"; // String | 
Boolean returnLongId = true; // Boolean | 
Integer port = 56; // Integer | 
String referenceNumberType = "8bit"; // String | 
OffsetDateTime validityPeriod = new OffsetDateTime(); // OffsetDateTime | 
String apiVersion = "apiVersion_example"; // String | 
try {
    apiInstance.apiMessageSendGet(destinationAddress, sourceAddress, messageText, returnLongId, port, referenceNumberType, validityPeriod, apiVersion);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#apiMessageSendGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **destinationAddress** | **String**|  | [optional]
 **sourceAddress** | **String**|  | [optional]
 **messageText** | **String**|  | [optional]
 **returnLongId** | **Boolean**|  | [optional]
 **port** | **Integer**|  | [optional]
 **referenceNumberType** | **String**|  | [optional] [default to 8bit]
 **validityPeriod** | **OffsetDateTime**|  | [optional]
 **apiVersion** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiMessageSendPost"></a>
# **apiMessageSendPost**
> apiMessageSendPost(body, returnLongId, apiVersion)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

MessageApi apiInstance = new MessageApi();
List<AradA2PMessage> body = Arrays.asList(new AradA2PMessage()); // List<AradA2PMessage> | 
Boolean returnLongId = true; // Boolean | 
String apiVersion = "apiVersion_example"; // String | 
try {
    apiInstance.apiMessageSendPost(body, returnLongId, apiVersion);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#apiMessageSendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;AradA2PMessage&gt;**](AradA2PMessage.md)|  | [optional]
 **returnLongId** | **Boolean**|  | [optional]
 **apiVersion** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

