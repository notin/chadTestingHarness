package functionalTest;

import org.springframework.http.HttpMethod;
import pojos.Credentials;
import pojos.VMS;
import utils.Caller;
import utils.JsonConverter;
import utils.QueryInfo;

public class BaseTest
{
    Caller caller = new Caller();

    protected void login(QueryInfo username, QueryInfo password, QueryInfo base, QueryInfo params, QueryInfo credentialsGiven, String id)
    {
        Credentials credentials = new Credentials();
        credentials.setText(username.toString()+"/"+password);

        JsonConverter jsonConverter = new JsonConverter();
        caller.makeCall(base.toString(), params.toString()+id+credentialsGiven.toString()+".json", jsonConverter.toJson(credentials), HttpMethod.POST, String.class, null);
    }

    protected <T>T getVMS(QueryInfo base, QueryInfo param, QueryInfo token, String id, Class<T> clazz)
    {
        return caller.makeCall(base.toString(), param.toString()+"/"+id, null, HttpMethod.GET, clazz, token.toString());
    }

    protected <T>T getRunVMS(QueryInfo base, QueryInfo param, QueryInfo token, Object vm, String id, Class<T> clazz)
    {
        JsonConverter jsonConverter = new JsonConverter();
        return caller.makeCall(base.toString(), param.toString()+id, jsonConverter.toJson(vm), HttpMethod.PUT, clazz, token.toString());
    }

}
