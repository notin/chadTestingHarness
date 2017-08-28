
package pojos;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "id",
    "size",
    "type",
    "controller",
    "lun"
})
public class Disk {

    @JsonProperty("id")
    private String id;
    @JsonProperty("size")
    private int size;
    @JsonProperty("type")
    private String type;
    @JsonProperty("controller")
    private String controller;
    @JsonProperty("lun")
    private String lun;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The size
     */
    @JsonProperty("size")
    public int getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    @JsonProperty("size")
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The controller
     */
    @JsonProperty("controller")
    public String getController() {
        return controller;
    }

    /**
     * 
     * @param controller
     *     The controller
     */
    @JsonProperty("controller")
    public void setController(String controller) {
        this.controller = controller;
    }

    /**
     * 
     * @return
     *     The lun
     */
    @JsonProperty("lun")
    public String getLun() {
        return lun;
    }

    /**
     * 
     * @param lun
     *     The lun
     */
    @JsonProperty("lun")
    public void setLun(String lun) {
        this.lun = lun;
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected boolean declaredProperty(String name, Object value) {
        if ("id".equals(name)) {
            if (value instanceof String) {
                setId(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"id\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("size".equals(name)) {
                if (value instanceof Integer) {
                    setSize(((Integer) value));
                } else {
                    throw new IllegalArgumentException(("property \"size\" is of type \"int\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("type".equals(name)) {
                    if (value instanceof String) {
                        setType(((String) value));
                    } else {
                        throw new IllegalArgumentException(("property \"type\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("controller".equals(name)) {
                        if (value instanceof String) {
                            setController(((String) value));
                        } else {
                            throw new IllegalArgumentException(("property \"controller\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("lun".equals(name)) {
                            if (value instanceof String) {
                                setLun(((String) value));
                            } else {
                                throw new IllegalArgumentException(("property \"lun\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("id".equals(name)) {
            return getId();
        } else {
            if ("size".equals(name)) {
                return getSize();
            } else {
                if ("type".equals(name)) {
                    return getType();
                } else {
                    if ("controller".equals(name)) {
                        return getController();
                    } else {
                        if ("lun".equals(name)) {
                            return getLun();
                        } else {
                            return notFoundValue;
                        }
                    }
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Disk.NOT_FOUND_VALUE);
        if (Disk.NOT_FOUND_VALUE!= value) {
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
