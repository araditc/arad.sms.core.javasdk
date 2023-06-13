//package arad.itc.client.api;
//
//import arad.itc.client.ApiClient;
//import arad.itc.client.ApiException;
//import arad.itc.client.Configuration;
//import arad.itc.client.auth.AccessToken;
//import arad.itc.client.auth.OAuth;
//import arad.itc.client.model.AradBulkMessage;
//import com.fasterxml.jackson.core.*;
//import com.fasterxml.jackson.databind.*;
//
//
//import java.util.ArrayList;
//
//
//
//public class MessageApiExample {
//
//
//
//
//    public static void MessageBulkPost() {
//
//        UserApi userApi = new UserApi();
//        String token = userApi.getAccessToken() ;
//
//        ObjectMapper mapper = new ObjectMapper();
//        AccessToken  accessToken = null ;
//        try {
//            accessToken = mapper.readValue(token, AccessToken.class);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//
//        ApiClient defaultClient = Configuration.getDefaultApiClient();
//
//        // Configure OAuth2 access token for authorization: OAuth2
//        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
//        OAuth2.setAccessToken(accessToken.getAccess_token());
//        MessageApi apiInstance = new MessageApi();
//        AradBulkMessage body = new AradBulkMessage(); // AradBulkMessage |
//        body.setMessageText("hello arad");
//        body.setSourceAddress("981000");
//        ArrayList destinations = new ArrayList();
//        destinations.add(0,"989123456789");
//        body.setDestinationAddress(destinations);
//        Boolean returnLongId = true; // Boolean |
//        String apiVersion = "1"; // String |
//        try {
//            apiInstance.apiMessageBulkPost(body, returnLongId, apiVersion);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling MessageApi#apiMessageBulkPost");
//            e.printStackTrace();
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//        MessageBulkPost();
//    }
//}
