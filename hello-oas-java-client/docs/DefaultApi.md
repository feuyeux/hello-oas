# DefaultApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sayGreetings**](DefaultApi.md#sayGreetings) | **GET** greetings/{id} | 

<a name="sayGreetings"></a>
# **sayGreetings**
> List&lt;Greeting&gt; sayGreetings(id, what)



### Example
```java
// Import classes:
//import org.feuyeux.oas.hello.ApiException;
//import org.feuyeux.oas.hello.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | greeting identification
What what = new What(); // What | greeting type
try {
    List<Greeting> result = apiInstance.sayGreetings(id, what);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#sayGreetings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| greeting identification |
 **what** | [**What**](.md)| greeting type |

### Return type

[**List&lt;Greeting&gt;**](Greeting.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

