/*
 * Arad SMS Core Api V1
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package arad.sms.core.javaclient.api;

import arad.sms.core.javaclient.model.PatternApiDto;
import arad.sms.core.javaclient.ApiCallback;
import arad.sms.core.javaclient.ApiClient;
import arad.sms.core.javaclient.ApiException;
import arad.sms.core.javaclient.ApiResponse;
import arad.sms.core.javaclient.Configuration;
import arad.sms.core.javaclient.Pair;
import arad.sms.core.javaclient.ProgressRequestBody;
import arad.sms.core.javaclient.ProgressResponseBody;

import java.io.IOException;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagePatternApi {
    private ApiClient apiClient;

    public MessagePatternApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MessagePatternApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for apiPatternMessageSendMultiplePost
     * @param body  (optional)
     * @param returnLongId  (optional)
     * @param apiVersion  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiPatternMessageSendMultiplePostCall(List<PatternApiDto> body, Boolean returnLongId, String apiVersion, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/patternMessage/sendMultiple";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (returnLongId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("returnLongId", returnLongId));
        if (apiVersion != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("api-version", apiVersion));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiPatternMessageSendMultiplePostValidateBeforeCall(List<PatternApiDto> body, Boolean returnLongId, String apiVersion, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = apiPatternMessageSendMultiplePostCall(body, returnLongId, apiVersion, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param body  (optional)
     * @param returnLongId  (optional)
     * @param apiVersion  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void apiPatternMessageSendMultiplePost(List<PatternApiDto> body, Boolean returnLongId, String apiVersion) throws ApiException {
        apiPatternMessageSendMultiplePostWithHttpInfo(body, returnLongId, apiVersion);
    }

    /**
     * 
     * 
     * @param body  (optional)
     * @param returnLongId  (optional)
     * @param apiVersion  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> apiPatternMessageSendMultiplePostWithHttpInfo(List<PatternApiDto> body, Boolean returnLongId, String apiVersion) throws ApiException {
        com.squareup.okhttp.Call call = apiPatternMessageSendMultiplePostValidateBeforeCall(body, returnLongId, apiVersion, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * 
     * @param body  (optional)
     * @param returnLongId  (optional)
     * @param apiVersion  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiPatternMessageSendMultiplePostAsync(List<PatternApiDto> body, Boolean returnLongId, String apiVersion, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiPatternMessageSendMultiplePostValidateBeforeCall(body, returnLongId, apiVersion, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for apiPatternMessageSendPost
     * @param body  (optional)
     * @param returnLongId  (optional)
     * @param apiVersion  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiPatternMessageSendPostCall(PatternApiDto body, Boolean returnLongId, String apiVersion, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/patternMessage/send";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (returnLongId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("returnLongId", returnLongId));
        if (apiVersion != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("api-version", apiVersion));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiPatternMessageSendPostValidateBeforeCall(PatternApiDto body, Boolean returnLongId, String apiVersion, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = apiPatternMessageSendPostCall(body, returnLongId, apiVersion, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param body  (optional)
     * @param returnLongId  (optional)
     * @param apiVersion  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void apiPatternMessageSendPost(PatternApiDto body, Boolean returnLongId, String apiVersion) throws ApiException {
        apiPatternMessageSendPostWithHttpInfo(body, returnLongId, apiVersion);
    }

    /**
     * 
     * 
     * @param body  (optional)
     * @param returnLongId  (optional)
     * @param apiVersion  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> apiPatternMessageSendPostWithHttpInfo(PatternApiDto body, Boolean returnLongId, String apiVersion) throws ApiException {
        com.squareup.okhttp.Call call = apiPatternMessageSendPostValidateBeforeCall(body, returnLongId, apiVersion, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * 
     * @param body  (optional)
     * @param returnLongId  (optional)
     * @param apiVersion  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiPatternMessageSendPostAsync(PatternApiDto body, Boolean returnLongId, String apiVersion, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiPatternMessageSendPostValidateBeforeCall(body, returnLongId, apiVersion, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
