
package pojos;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "display_protocol"
})
public class SmartclientConnection {

    @JsonProperty("display_protocol")
    private Object displayProtocol;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The displayProtocol
     */
    @JsonProperty("display_protocol")
    public Object getDisplayProtocol() {
        return displayProtocol;
    }

    /**
     * 
     * @param displayProtocol
     *     The display_protocol
     */
    @JsonProperty("display_protocol")
    public void setDisplayProtocol(Object displayProtocol) {
        this.displayProtocol = displayProtocol;
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected boolean declaredProperty(String name, Object value) {
        if ("display_protocol".equals(name)) {
            if (value instanceof Object) {
                setDisplayProtocol(((Object) value));
            } else {
                throw new IllegalArgumentException(("property \"display_protocol\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            return false;
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("display_protocol".equals(name)) {
            return getDisplayProtocol();
        } else {
            return notFoundValue;
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, SmartclientConnection.NOT_FOUND_VALUE);
        if (SmartclientConnection.NOT_FOUND_VALUE!= value) {
            return ((T) value);
        } else {
            throw new IllegalArgumentException((("property \""+ name)+"\" is not defined"));
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public void set(String name, Object value) {
        if (!declaredProperty(name, value)) {
            throw new IllegalArgumentException((("property \""+ name)+"\" is not defined"));
        }
    }

}
