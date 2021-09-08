# hello_oas_client.DefaultApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**say_greetings**](DefaultApi.md#say_greetings) | **GET** /greetings/{id} | 

# **say_greetings**
> list[Greeting] say_greetings(id, what)



### Example
```python
from __future__ import print_function
import time
import hello_oas_client
from hello_oas_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = hello_oas_client.DefaultApi()
id = 789 # int | greeting identification
what = hello_oas_client.What() # What | greeting type

try:
    api_response = api_instance.say_greetings(id, what)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->say_greetings: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| greeting identification | 
 **what** | [**What**](.md)| greeting type | 

### Return type

[**list[Greeting]**](Greeting.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

