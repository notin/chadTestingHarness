
package pojos;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "id",
    "name",
    "runstate",
    "hardware",
    "error",
    "asset_id",
    "hardware_version",
    "max_hardware_version",
    "interfaces",
    "notes",
    "labels",
    "credentials",
    "desktop_resizable",
    "local_mouse_cursor",
    "maintenance_lock_engaged",
    "region_backend",
    "created_at",
    "can_change_object_state",
    "containers",
    "display_server",
    "audio_in",
    "audio_out",
    "smartclient_connection",
    "template_url"
})
public class VMS {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("runstate")
    private String runstate;
    @JsonProperty("hardware")
    private Hardware hardware;
    @JsonProperty("error")
    private boolean error;
    @JsonProperty("asset_id")
    private Object assetId;
    @JsonProperty("hardware_version")
    private int hardwareVersion;
    @JsonProperty("max_hardware_version")
    private int maxHardwareVersion;
    @JsonProperty("interfaces")
    private List<Interface> interfaces = new ArrayList<Interface>();
    @JsonProperty("notes")
    private List<Object> notes = new ArrayList<Object>();
    @JsonProperty("labels")
    private List<Label> labels = new ArrayList<Label>();
    @JsonProperty("credentials")
    private List<Object> credentials = new ArrayList<Object>();
    @JsonProperty("desktop_resizable")
    private boolean desktopResizable;
    @JsonProperty("local_mouse_cursor")
    private boolean localMouseCursor;
    @JsonProperty("maintenance_lock_engaged")
    private boolean maintenanceLockEngaged;
    @JsonProperty("region_backend")
    private String regionBackend;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("can_change_object_state")
    private boolean canChangeObjectState;
    @JsonProperty("containers")
    private Object containers;
    @JsonProperty("display_server")
    private Object displayServer;
    @JsonProperty("audio_in")
    private boolean audioIn;
    @JsonProperty("audio_out")
    private boolean audioOut;
    @JsonProperty("smartclient_connection")
    private SmartclientConnection smartclientConnection;
    @JsonProperty("template_url")
    private String templateUrl;
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
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The runstate
     */
    @JsonProperty("runstate")
    public String getRunstate() {
        return runstate;
    }

    /**
     * 
     * @param runstate
     *     The runstate
     */
    @JsonProperty("runstate")
    public void setRunstate(String runstate) {
        this.runstate = runstate;
    }

    /**
     * 
     * @return
     *     The hardware
     */
    @JsonProperty("hardware")
    public Hardware getHardware() {
        return hardware;
    }

    /**
     * 
     * @param hardware
     *     The hardware
     */
    @JsonProperty("hardware")
    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }

    /**
     * 
     * @return
     *     The error
     */
    @JsonProperty("error")
    public boolean isError() {
        return error;
    }

    /**
     * 
     * @param error
     *     The error
     */
    @JsonProperty("error")
    public void setError(boolean error) {
        this.error = error;
    }

    /**
     * 
     * @return
     *     The assetId
     */
    @JsonProperty("asset_id")
    public Object getAssetId() {
        return assetId;
    }

    /**
     * 
     * @param assetId
     *     The asset_id
     */
    @JsonProperty("asset_id")
    public void setAssetId(Object assetId) {
        this.assetId = assetId;
    }

    /**
     * 
     * @return
     *     The hardwareVersion
     */
    @JsonProperty("hardware_version")
    public int getHardwareVersion() {
        return hardwareVersion;
    }

    /**
     * 
     * @param hardwareVersion
     *     The hardware_version
     */
    @JsonProperty("hardware_version")
    public void setHardwareVersion(int hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    /**
     * 
     * @return
     *     The maxHardwareVersion
     */
    @JsonProperty("max_hardware_version")
    public int getMaxHardwareVersion() {
        return maxHardwareVersion;
    }

    /**
     * 
     * @param maxHardwareVersion
     *     The max_hardware_version
     */
    @JsonProperty("max_hardware_version")
    public void setMaxHardwareVersion(int maxHardwareVersion) {
        this.maxHardwareVersion = maxHardwareVersion;
    }

    /**
     * 
     * @return
     *     The interfaces
     */
    @JsonProperty("interfaces")
    public List<Interface> getInterfaces() {
        return interfaces;
    }

    /**
     * 
     * @param interfaces
     *     The interfaces
     */
    @JsonProperty("interfaces")
    public void setInterfaces(List<Interface> interfaces) {
        this.interfaces = interfaces;
    }

    /**
     * 
     * @return
     *     The notes
     */
    @JsonProperty("notes")
    public List<Object> getNotes() {
        return notes;
    }

    /**
     * 
     * @param notes
     *     The notes
     */
    @JsonProperty("notes")
    public void setNotes(List<Object> notes) {
        this.notes = notes;
    }

    /**
     * 
     * @return
     *     The labels
     */
    @JsonProperty("labels")
    public List<Label> getLabels() {
        return labels;
    }

    /**
     * 
     * @param labels
     *     The labels
     */
    @JsonProperty("labels")
    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    /**
     * 
     * @return
     *     The credentials
     */
    @JsonProperty("credentials")
    public List<Object> getCredentials() {
        return credentials;
    }

    /**
     * 
     * @param credentials
     *     The credentials
     */
    @JsonProperty("credentials")
    public void setCredentials(List<Object> credentials) {
        this.credentials = credentials;
    }

    /**
     * 
     * @return
     *     The desktopResizable
     */
    @JsonProperty("desktop_resizable")
    public boolean isDesktopResizable() {
        return desktopResizable;
    }

    /**
     * 
     * @param desktopResizable
     *     The desktop_resizable
     */
    @JsonProperty("desktop_resizable")
    public void setDesktopResizable(boolean desktopResizable) {
        this.desktopResizable = desktopResizable;
    }

    /**
     * 
     * @return
     *     The localMouseCursor
     */
    @JsonProperty("local_mouse_cursor")
    public boolean isLocalMouseCursor() {
        return localMouseCursor;
    }

    /**
     * 
     * @param localMouseCursor
     *     The local_mouse_cursor
     */
    @JsonProperty("local_mouse_cursor")
    public void setLocalMouseCursor(boolean localMouseCursor) {
        this.localMouseCursor = localMouseCursor;
    }

    /**
     * 
     * @return
     *     The maintenanceLockEngaged
     */
    @JsonProperty("maintenance_lock_engaged")
    public boolean isMaintenanceLockEngaged() {
        return maintenanceLockEngaged;
    }

    /**
     * 
     * @param maintenanceLockEngaged
     *     The maintenance_lock_engaged
     */
    @JsonProperty("maintenance_lock_engaged")
    public void setMaintenanceLockEngaged(boolean maintenanceLockEngaged) {
        this.maintenanceLockEngaged = maintenanceLockEngaged;
    }

    /**
     * 
     * @return
     *     The regionBackend
     */
    @JsonProperty("region_backend")
    public String getRegionBackend() {
        return regionBackend;
    }

    /**
     * 
     * @param regionBackend
     *     The region_backend
     */
    @JsonProperty("region_backend")
    public void setRegionBackend(String regionBackend) {
        this.regionBackend = regionBackend;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The canChangeObjectState
     */
    @JsonProperty("can_change_object_state")
    public boolean isCanChangeObjectState() {
        return canChangeObjectState;
    }

    /**
     * 
     * @param canChangeObjectState
     *     The can_change_object_state
     */
    @JsonProperty("can_change_object_state")
    public void setCanChangeObjectState(boolean canChangeObjectState) {
        this.canChangeObjectState = canChangeObjectState;
    }

    /**
     * 
     * @return
     *     The containers
     */
    @JsonProperty("containers")
    public Object getContainers() {
        return containers;
    }

    /**
     * 
     * @param containers
     *     The containers
     */
    @JsonProperty("containers")
    public void setContainers(Object containers) {
        this.containers = containers;
    }

    /**
     * 
     * @return
     *     The displayServer
     */
    @JsonProperty("display_server")
    public Object getDisplayServer() {
        return displayServer;
    }

    /**
     * 
     * @param displayServer
     *     The display_server
     */
    @JsonProperty("display_server")
    public void setDisplayServer(Object displayServer) {
        this.displayServer = displayServer;
    }

    /**
     * 
     * @return
     *     The audioIn
     */
    @JsonProperty("audio_in")
    public boolean isAudioIn() {
        return audioIn;
    }

    /**
     * 
     * @param audioIn
     *     The audio_in
     */
    @JsonProperty("audio_in")
    public void setAudioIn(boolean audioIn) {
        this.audioIn = audioIn;
    }

    /**
     * 
     * @return
     *     The audioOut
     */
    @JsonProperty("audio_out")
    public boolean isAudioOut() {
        return audioOut;
    }

    /**
     * 
     * @param audioOut
     *     The audio_out
     */
    @JsonProperty("audio_out")
    public void setAudioOut(boolean audioOut) {
        this.audioOut = audioOut;
    }

    /**
     * 
     * @return
     *     The smartclientConnection
     */
    @JsonProperty("smartclient_connection")
    public SmartclientConnection getSmartclientConnection() {
        return smartclientConnection;
    }

    /**
     * 
     * @param smartclientConnection
     *     The smartclient_connection
     */
    @JsonProperty("smartclient_connection")
    public void setSmartclientConnection(SmartclientConnection smartclientConnection) {
        this.smartclientConnection = smartclientConnection;
    }

    /**
     * 
     * @return
     *     The templateUrl
     */
    @JsonProperty("template_url")
    public String getTemplateUrl() {
        return templateUrl;
    }

    /**
     * 
     * @param templateUrl
     *     The template_url
     */
    @JsonProperty("template_url")
    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
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
            if ("name".equals(name)) {
                if (value instanceof String) {
                    setName(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"name\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("runstate".equals(name)) {
                    if (value instanceof String) {
                        setRunstate(((String) value));
                    } else {
                        throw new IllegalArgumentException(("property \"runstate\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("hardware".equals(name)) {
                        if (value instanceof Hardware) {
                            setHardware(((Hardware) value));
                        } else {
                            throw new IllegalArgumentException(("property \"hardware\" is of type \"pojos.Hardware\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("error".equals(name)) {
                            if (value instanceof Boolean) {
                                setError(((Boolean) value));
                            } else {
                                throw new IllegalArgumentException(("property \"error\" is of type \"boolean\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("asset_id".equals(name)) {
                                if (value instanceof Object) {
                                    setAssetId(((Object) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"asset_id\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                }
                                return true;
                            } else {
                                if ("hardware_version".equals(name)) {
                                    if (value instanceof Integer) {
                                        setHardwareVersion(((Integer) value));
                                    } else {
                                        throw new IllegalArgumentException(("property \"hardware_version\" is of type \"int\", but got "+ value.getClass().toString()));
                                    }
                                    return true;
                                } else {
                                    if ("max_hardware_version".equals(name)) {
                                        if (value instanceof Integer) {
                                            setMaxHardwareVersion(((Integer) value));
                                        } else {
                                            throw new IllegalArgumentException(("property \"max_hardware_version\" is of type \"int\", but got "+ value.getClass().toString()));
                                        }
                                        return true;
                                    } else {
                                        if ("interfaces".equals(name)) {
                                            if (value instanceof List) {
                                                setInterfaces(((List<Interface> ) value));
                                            } else {
                                                throw new IllegalArgumentException(("property \"interfaces\" is of type \"java.util.List<pojos.Interface>\", but got "+ value.getClass().toString()));
                                            }
                                            return true;
                                        } else {
                                            if ("notes".equals(name)) {
                                                if (value instanceof List) {
                                                    setNotes(((List<Object> ) value));
                                                } else {
                                                    throw new IllegalArgumentException(("property \"notes\" is of type \"java.util.List<java.lang.Object>\", but got "+ value.getClass().toString()));
                                                }
                                                return true;
                                            } else {
                                                if ("labels".equals(name)) {
                                                    if (value instanceof List) {
                                                        setLabels(((List<Label> ) value));
                                                    } else {
                                                        throw new IllegalArgumentException(("property \"labels\" is of type \"java.util.List<pojos.Label>\", but got "+ value.getClass().toString()));
                                                    }
                                                    return true;
                                                } else {
                                                    if ("credentials".equals(name)) {
                                                        if (value instanceof List) {
                                                            setCredentials(((List<Object> ) value));
                                                        } else {
                                                            throw new IllegalArgumentException(("property \"credentials\" is of type \"java.util.List<java.lang.Object>\", but got "+ value.getClass().toString()));
                                                        }
                                                        return true;
                                                    } else {
                                                        if ("desktop_resizable".equals(name)) {
                                                            if (value instanceof Boolean) {
                                                                setDesktopResizable(((Boolean) value));
                                                            } else {
                                                                throw new IllegalArgumentException(("property \"desktop_resizable\" is of type \"boolean\", but got "+ value.getClass().toString()));
                                                            }
                                                            return true;
                                                        } else {
                                                            if ("local_mouse_cursor".equals(name)) {
                                                                if (value instanceof Boolean) {
                                                                    setLocalMouseCursor(((Boolean) value));
                                                                } else {
                                                                    throw new IllegalArgumentException(("property \"local_mouse_cursor\" is of type \"boolean\", but got "+ value.getClass().toString()));
                                                                }
                                                                return true;
                                                            } else {
                                                                if ("maintenance_lock_engaged".equals(name)) {
                                                                    if (value instanceof Boolean) {
                                                                        setMaintenanceLockEngaged(((Boolean) value));
                                                                    } else {
                                                                        throw new IllegalArgumentException(("property \"maintenance_lock_engaged\" is of type \"boolean\", but got "+ value.getClass().toString()));
                                                                    }
                                                                    return true;
                                                                } else {
                                                                    if ("region_backend".equals(name)) {
                                                                        if (value instanceof String) {
                                                                            setRegionBackend(((String) value));
                                                                        } else {
                                                                            throw new IllegalArgumentException(("property \"region_backend\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                        }
                                                                        return true;
                                                                    } else {
                                                                        if ("created_at".equals(name)) {
                                                                            if (value instanceof String) {
                                                                                setCreatedAt(((String) value));
                                                                            } else {
                                                                                throw new IllegalArgumentException(("property \"created_at\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                            }
                                                                            return true;
                                                                        } else {
                                                                            if ("can_change_object_state".equals(name)) {
                                                                                if (value instanceof Boolean) {
                                                                                    setCanChangeObjectState(((Boolean) value));
                                                                                } else {
                                                                                    throw new IllegalArgumentException(("property \"can_change_object_state\" is of type \"boolean\", but got "+ value.getClass().toString()));
                                                                                }
                                                                                return true;
                                                                            } else {
                                                                                if ("containers".equals(name)) {
                                                                                    if (value instanceof Object) {
                                                                                        setContainers(((Object) value));
                                                                                    } else {
                                                                                        throw new IllegalArgumentException(("property \"containers\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                                                    }
                                                                                    return true;
                                                                                } else {
                                                                                    if ("display_server".equals(name)) {
                                                                                        if (value instanceof Object) {
                                                                                            setDisplayServer(((Object) value));
                                                                                        } else {
                                                                                            throw new IllegalArgumentException(("property \"display_server\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                                                        }
                                                                                        return true;
                                                                                    } else {
                                                                                        if ("audio_in".equals(name)) {
                                                                                            if (value instanceof Boolean) {
                                                                                                setAudioIn(((Boolean) value));
                                                                                            } else {
                                                                                                throw new IllegalArgumentException(("property \"audio_in\" is of type \"boolean\", but got "+ value.getClass().toString()));
                                                                                            }
                                                                                            return true;
                                                                                        } else {
                                                                                            if ("audio_out".equals(name)) {
                                                                                                if (value instanceof Boolean) {
                                                                                                    setAudioOut(((Boolean) value));
                                                                                                } else {
                                                                                                    throw new IllegalArgumentException(("property \"audio_out\" is of type \"boolean\", but got "+ value.getClass().toString()));
                                                                                                }
                                                                                                return true;
                                                                                            } else {
                                                                                                if ("smartclient_connection".equals(name)) {
                                                                                                    if (value instanceof SmartclientConnection) {
                                                                                                        setSmartclientConnection(((SmartclientConnection) value));
                                                                                                    } else {
                                                                                                        throw new IllegalArgumentException(("property \"smartclient_connection\" is of type \"pojos.SmartclientConnection\", but got "+ value.getClass().toString()));
                                                                                                    }
                                                                                                    return true;
                                                                                                } else {
                                                                                                    if ("template_url".equals(name)) {
                                                                                                        if (value instanceof String) {
                                                                                                            setTemplateUrl(((String) value));
                                                                                                        } else {
                                                                                                            throw new IllegalArgumentException(("property \"template_url\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
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
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
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
            if ("name".equals(name)) {
                return getName();
            } else {
                if ("runstate".equals(name)) {
                    return getRunstate();
                } else {
                    if ("hardware".equals(name)) {
                        return getHardware();
                    } else {
                        if ("error".equals(name)) {
                            return isError();
                        } else {
                            if ("asset_id".equals(name)) {
                                return getAssetId();
                            } else {
                                if ("hardware_version".equals(name)) {
                                    return getHardwareVersion();
                                } else {
                                    if ("max_hardware_version".equals(name)) {
                                        return getMaxHardwareVersion();
                                    } else {
                                        if ("interfaces".equals(name)) {
                                            return getInterfaces();
                                        } else {
                                            if ("notes".equals(name)) {
                                                return getNotes();
                                            } else {
                                                if ("labels".equals(name)) {
                                                    return getLabels();
                                                } else {
                                                    if ("credentials".equals(name)) {
                                                        return getCredentials();
                                                    } else {
                                                        if ("desktop_resizable".equals(name)) {
                                                            return isDesktopResizable();
                                                        } else {
                                                            if ("local_mouse_cursor".equals(name)) {
                                                                return isLocalMouseCursor();
                                                            } else {
                                                                if ("maintenance_lock_engaged".equals(name)) {
                                                                    return isMaintenanceLockEngaged();
                                                                } else {
                                                                    if ("region_backend".equals(name)) {
                                                                        return getRegionBackend();
                                                                    } else {
                                                                        if ("created_at".equals(name)) {
                                                                            return getCreatedAt();
                                                                        } else {
                                                                            if ("can_change_object_state".equals(name)) {
                                                                                return isCanChangeObjectState();
                                                                            } else {
                                                                                if ("containers".equals(name)) {
                                                                                    return getContainers();
                                                                                } else {
                                                                                    if ("display_server".equals(name)) {
                                                                                        return getDisplayServer();
                                                                                    } else {
                                                                                        if ("audio_in".equals(name)) {
                                                                                            return isAudioIn();
                                                                                        } else {
                                                                                            if ("audio_out".equals(name)) {
                                                                                                return isAudioOut();
                                                                                            } else {
                                                                                                if ("smartclient_connection".equals(name)) {
                                                                                                    return getSmartclientConnection();
                                                                                                } else {
                                                                                                    if ("template_url".equals(name)) {
                                                                                                        return getTemplateUrl();
                                                                                                    } else {
                                                                                                        return notFoundValue;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
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
        Object value = declaredPropertyOrNotFound(name, VMS.NOT_FOUND_VALUE);
        if (VMS.NOT_FOUND_VALUE!= value) {
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
