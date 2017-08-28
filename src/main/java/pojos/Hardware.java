
package pojos;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cpus",
    "supports_multicore",
    "cpus_per_socket",
    "ram",
    "svms",
    "guestOS",
    "max_cpus",
    "min_ram",
    "max_ram",
    "vnc_keymap",
    "uuid",
    "disks",
    "storage",
    "upgradable",
    "instance_type",
    "time_sync_enabled",
    "rtc_start_time",
    "copy_paste_enabled",
    "nested_virtualization",
    "architecture"
})
public class Hardware {

    @JsonProperty("cpus")
    private int cpus;
    @JsonProperty("supports_multicore")
    private boolean supportsMulticore;
    @JsonProperty("cpus_per_socket")
    private int cpusPerSocket;
    @JsonProperty("ram")
    private int ram;
    @JsonProperty("svms")
    private int svms;
    @JsonProperty("guestOS")
    private String guestOS;
    @JsonProperty("max_cpus")
    private int maxCpus;
    @JsonProperty("min_ram")
    private int minRam;
    @JsonProperty("max_ram")
    private int maxRam;
    @JsonProperty("vnc_keymap")
    private Object vncKeymap;
    @JsonProperty("uuid")
    private Object uuid;
    @JsonProperty("disks")
    private List<Disk> disks = new ArrayList<Disk>();
    @JsonProperty("storage")
    private int storage;
    @JsonProperty("upgradable")
    private boolean upgradable;
    @JsonProperty("instance_type")
    private Object instanceType;
    @JsonProperty("time_sync_enabled")
    private boolean timeSyncEnabled;
    @JsonProperty("rtc_start_time")
    private Object rtcStartTime;
    @JsonProperty("copy_paste_enabled")
    private boolean copyPasteEnabled;
    @JsonProperty("nested_virtualization")
    private boolean nestedVirtualization;
    @JsonProperty("architecture")
    private String architecture;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The cpus
     */
    @JsonProperty("cpus")
    public int getCpus() {
        return cpus;
    }

    /**
     * 
     * @param cpus
     *     The cpus
     */
    @JsonProperty("cpus")
    public void setCpus(int cpus) {
        this.cpus = cpus;
    }

    /**
     * 
     * @return
     *     The supportsMulticore
     */
    @JsonProperty("supports_multicore")
    public boolean isSupportsMulticore() {
        return supportsMulticore;
    }

    /**
     * 
     * @param supportsMulticore
     *     The supports_multicore
     */
    @JsonProperty("supports_multicore")
    public void setSupportsMulticore(boolean supportsMulticore) {
        this.supportsMulticore = supportsMulticore;
    }

    /**
     * 
     * @return
     *     The cpusPerSocket
     */
    @JsonProperty("cpus_per_socket")
    public int getCpusPerSocket() {
        return cpusPerSocket;
    }

    /**
     * 
     * @param cpusPerSocket
     *     The cpus_per_socket
     */
    @JsonProperty("cpus_per_socket")
    public void setCpusPerSocket(int cpusPerSocket) {
        this.cpusPerSocket = cpusPerSocket;
    }

    /**
     * 
     * @return
     *     The ram
     */
    @JsonProperty("ram")
    public int getRam() {
        return ram;
    }

    /**
     * 
     * @param ram
     *     The ram
     */
    @JsonProperty("ram")
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * 
     * @return
     *     The svms
     */
    @JsonProperty("svms")
    public int getSvms() {
        return svms;
    }

    /**
     * 
     * @param svms
     *     The svms
     */
    @JsonProperty("svms")
    public void setSvms(int svms) {
        this.svms = svms;
    }

    /**
     * 
     * @return
     *     The guestOS
     */
    @JsonProperty("guestOS")
    public String getGuestOS() {
        return guestOS;
    }

    /**
     * 
     * @param guestOS
     *     The guestOS
     */
    @JsonProperty("guestOS")
    public void setGuestOS(String guestOS) {
        this.guestOS = guestOS;
    }

    /**
     * 
     * @return
     *     The maxCpus
     */
    @JsonProperty("max_cpus")
    public int getMaxCpus() {
        return maxCpus;
    }

    /**
     * 
     * @param maxCpus
     *     The max_cpus
     */
    @JsonProperty("max_cpus")
    public void setMaxCpus(int maxCpus) {
        this.maxCpus = maxCpus;
    }

    /**
     * 
     * @return
     *     The minRam
     */
    @JsonProperty("min_ram")
    public int getMinRam() {
        return minRam;
    }

    /**
     * 
     * @param minRam
     *     The min_ram
     */
    @JsonProperty("min_ram")
    public void setMinRam(int minRam) {
        this.minRam = minRam;
    }

    /**
     * 
     * @return
     *     The maxRam
     */
    @JsonProperty("max_ram")
    public int getMaxRam() {
        return maxRam;
    }

    /**
     * 
     * @param maxRam
     *     The max_ram
     */
    @JsonProperty("max_ram")
    public void setMaxRam(int maxRam) {
        this.maxRam = maxRam;
    }

    /**
     * 
     * @return
     *     The vncKeymap
     */
    @JsonProperty("vnc_keymap")
    public Object getVncKeymap() {
        return vncKeymap;
    }

    /**
     * 
     * @param vncKeymap
     *     The vnc_keymap
     */
    @JsonProperty("vnc_keymap")
    public void setVncKeymap(Object vncKeymap) {
        this.vncKeymap = vncKeymap;
    }

    /**
     * 
     * @return
     *     The uuid
     */
    @JsonProperty("uuid")
    public Object getUuid() {
        return uuid;
    }

    /**
     * 
     * @param uuid
     *     The uuid
     */
    @JsonProperty("uuid")
    public void setUuid(Object uuid) {
        this.uuid = uuid;
    }

    /**
     * 
     * @return
     *     The disks
     */
    @JsonProperty("disks")
    public List<Disk> getDisks() {
        return disks;
    }

    /**
     * 
     * @param disks
     *     The disks
     */
    @JsonProperty("disks")
    public void setDisks(List<Disk> disks) {
        this.disks = disks;
    }

    /**
     * 
     * @return
     *     The storage
     */
    @JsonProperty("storage")
    public int getStorage() {
        return storage;
    }

    /**
     * 
     * @param storage
     *     The storage
     */
    @JsonProperty("storage")
    public void setStorage(int storage) {
        this.storage = storage;
    }

    /**
     * 
     * @return
     *     The upgradable
     */
    @JsonProperty("upgradable")
    public boolean isUpgradable() {
        return upgradable;
    }

    /**
     * 
     * @param upgradable
     *     The upgradable
     */
    @JsonProperty("upgradable")
    public void setUpgradable(boolean upgradable) {
        this.upgradable = upgradable;
    }

    /**
     * 
     * @return
     *     The instanceType
     */
    @JsonProperty("instance_type")
    public Object getInstanceType() {
        return instanceType;
    }

    /**
     * 
     * @param instanceType
     *     The instance_type
     */
    @JsonProperty("instance_type")
    public void setInstanceType(Object instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * 
     * @return
     *     The timeSyncEnabled
     */
    @JsonProperty("time_sync_enabled")
    public boolean isTimeSyncEnabled() {
        return timeSyncEnabled;
    }

    /**
     * 
     * @param timeSyncEnabled
     *     The time_sync_enabled
     */
    @JsonProperty("time_sync_enabled")
    public void setTimeSyncEnabled(boolean timeSyncEnabled) {
        this.timeSyncEnabled = timeSyncEnabled;
    }

    /**
     * 
     * @return
     *     The rtcStartTime
     */
    @JsonProperty("rtc_start_time")
    public Object getRtcStartTime() {
        return rtcStartTime;
    }

    /**
     * 
     * @param rtcStartTime
     *     The rtc_start_time
     */
    @JsonProperty("rtc_start_time")
    public void setRtcStartTime(Object rtcStartTime) {
        this.rtcStartTime = rtcStartTime;
    }

    /**
     * 
     * @return
     *     The copyPasteEnabled
     */
    @JsonProperty("copy_paste_enabled")
    public boolean isCopyPasteEnabled() {
        return copyPasteEnabled;
    }

    /**
     * 
     * @param copyPasteEnabled
     *     The copy_paste_enabled
     */
    @JsonProperty("copy_paste_enabled")
    public void setCopyPasteEnabled(boolean copyPasteEnabled) {
        this.copyPasteEnabled = copyPasteEnabled;
    }

    /**
     * 
     * @return
     *     The nestedVirtualization
     */
    @JsonProperty("nested_virtualization")
    public boolean isNestedVirtualization() {
        return nestedVirtualization;
    }

    /**
     * 
     * @param nestedVirtualization
     *     The nested_virtualization
     */
    @JsonProperty("nested_virtualization")
    public void setNestedVirtualization(boolean nestedVirtualization) {
        this.nestedVirtualization = nestedVirtualization;
    }

    /**
     * 
     * @return
     *     The architecture
     */
    @JsonProperty("architecture")
    public String getArchitecture() {
        return architecture;
    }

    /**
     * 
     * @param architecture
     *     The architecture
     */
    @JsonProperty("architecture")
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected boolean declaredProperty(String name, Object value) {
        if ("cpus".equals(name)) {
            if (value instanceof Integer) {
                setCpus(((Integer) value));
            } else {
                throw new IllegalArgumentException(("property \"cpus\" is of type \"int\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("supports_multicore".equals(name)) {
                if (value instanceof Boolean) {
                    setSupportsMulticore(((Boolean) value));
                } else {
                    throw new IllegalArgumentException(("property \"supports_multicore\" is of type \"boolean\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("cpus_per_socket".equals(name)) {
                    if (value instanceof Integer) {
                        setCpusPerSocket(((Integer) value));
                    } else {
                        throw new IllegalArgumentException(("property \"cpus_per_socket\" is of type \"int\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("ram".equals(name)) {
                        if (value instanceof Integer) {
                            setRam(((Integer) value));
                        } else {
                            throw new IllegalArgumentException(("property \"ram\" is of type \"int\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("svms".equals(name)) {
                            if (value instanceof Integer) {
                                setSvms(((Integer) value));
                            } else {
                                throw new IllegalArgumentException(("property \"svms\" is of type \"int\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("guestOS".equals(name)) {
                                if (value instanceof String) {
                                    setGuestOS(((String) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"guestOS\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                }
                                return true;
                            } else {
                                if ("max_cpus".equals(name)) {
                                    if (value instanceof Integer) {
                                        setMaxCpus(((Integer) value));
                                    } else {
                                        throw new IllegalArgumentException(("property \"max_cpus\" is of type \"int\", but got "+ value.getClass().toString()));
                                    }
                                    return true;
                                } else {
                                    if ("min_ram".equals(name)) {
                                        if (value instanceof Integer) {
                                            setMinRam(((Integer) value));
                                        } else {
                                            throw new IllegalArgumentException(("property \"min_ram\" is of type \"int\", but got "+ value.getClass().toString()));
                                        }
                                        return true;
                                    } else {
                                        if ("max_ram".equals(name)) {
                                            if (value instanceof Integer) {
                                                setMaxRam(((Integer) value));
                                            } else {
                                                throw new IllegalArgumentException(("property \"max_ram\" is of type \"int\", but got "+ value.getClass().toString()));
                                            }
                                            return true;
                                        } else {
                                            if ("vnc_keymap".equals(name)) {
                                                if (value instanceof Object) {
                                                    setVncKeymap(((Object) value));
                                                } else {
                                                    throw new IllegalArgumentException(("property \"vnc_keymap\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                }
                                                return true;
                                            } else {
                                                if ("uuid".equals(name)) {
                                                    if (value instanceof Object) {
                                                        setUuid(((Object) value));
                                                    } else {
                                                        throw new IllegalArgumentException(("property \"uuid\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                    }
                                                    return true;
                                                } else {
                                                    if ("disks".equals(name)) {
                                                        if (value instanceof List) {
                                                            setDisks(((List<Disk> ) value));
                                                        } else {
                                                            throw new IllegalArgumentException(("property \"disks\" is of type \"java.util.List<pojos.Disk>\", but got "+ value.getClass().toString()));
                                                        }
                                                        return true;
                                                    } else {
                                                        if ("storage".equals(name)) {
                                                            if (value instanceof Integer) {
                                                                setStorage(((Integer) value));
                                                            } else {
                                                                throw new IllegalArgumentException(("property \"storage\" is of type \"int\", but got "+ value.getClass().toString()));
                                                            }
                                                            return true;
                                                        } else {
                                                            if ("upgradable".equals(name)) {
                                                                if (value instanceof Boolean) {
                                                                    setUpgradable(((Boolean) value));
                                                                } else {
                                                                    throw new IllegalArgumentException(("property \"upgradable\" is of type \"boolean\", but got "+ value.getClass().toString()));
                                                                }
                                                                return true;
                                                            } else {
                                                                if ("instance_type".equals(name)) {
                                                                    if (value instanceof Object) {
                                                                        setInstanceType(((Object) value));
                                                                    } else {
                                                                        throw new IllegalArgumentException(("property \"instance_type\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                                    }
                                                                    return true;
                                                                } else {
                                                                    if ("time_sync_enabled".equals(name)) {
                                                                        if (value instanceof Boolean) {
                                                                            setTimeSyncEnabled(((Boolean) value));
                                                                        } else {
                                                                            throw new IllegalArgumentException(("property \"time_sync_enabled\" is of type \"boolean\", but got "+ value.getClass().toString()));
                                                                        }
                                                                        return true;
                                                                    } else {
                                                                        if ("rtc_start_time".equals(name)) {
                                                                            if (value instanceof Object) {
                                                                                setRtcStartTime(((Object) value));
                                                                            } else {
                                                                                throw new IllegalArgumentException(("property \"rtc_start_time\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                                            }
                                                                            return true;
                                                                        } else {
                                                                            if ("copy_paste_enabled".equals(name)) {
                                                                                if (value instanceof Boolean) {
                                                                                    setCopyPasteEnabled(((Boolean) value));
                                                                                } else {
                                                                                    throw new IllegalArgumentException(("property \"copy_paste_enabled\" is of type \"boolean\", but got "+ value.getClass().toString()));
                                                                                }
                                                                                return true;
                                                                            } else {
                                                                                if ("nested_virtualization".equals(name)) {
                                                                                    if (value instanceof Boolean) {
                                                                                        setNestedVirtualization(((Boolean) value));
                                                                                    } else {
                                                                                        throw new IllegalArgumentException(("property \"nested_virtualization\" is of type \"boolean\", but got "+ value.getClass().toString()));
                                                                                    }
                                                                                    return true;
                                                                                } else {
                                                                                    if ("architecture".equals(name)) {
                                                                                        if (value instanceof String) {
                                                                                            setArchitecture(((String) value));
                                                                                        } else {
                                                                                            throw new IllegalArgumentException(("property \"architecture\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
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

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("cpus".equals(name)) {
            return getCpus();
        } else {
            if ("supports_multicore".equals(name)) {
                return isSupportsMulticore();
            } else {
                if ("cpus_per_socket".equals(name)) {
                    return getCpusPerSocket();
                } else {
                    if ("ram".equals(name)) {
                        return getRam();
                    } else {
                        if ("svms".equals(name)) {
                            return getSvms();
                        } else {
                            if ("guestOS".equals(name)) {
                                return getGuestOS();
                            } else {
                                if ("max_cpus".equals(name)) {
                                    return getMaxCpus();
                                } else {
                                    if ("min_ram".equals(name)) {
                                        return getMinRam();
                                    } else {
                                        if ("max_ram".equals(name)) {
                                            return getMaxRam();
                                        } else {
                                            if ("vnc_keymap".equals(name)) {
                                                return getVncKeymap();
                                            } else {
                                                if ("uuid".equals(name)) {
                                                    return getUuid();
                                                } else {
                                                    if ("disks".equals(name)) {
                                                        return getDisks();
                                                    } else {
                                                        if ("storage".equals(name)) {
                                                            return getStorage();
                                                        } else {
                                                            if ("upgradable".equals(name)) {
                                                                return isUpgradable();
                                                            } else {
                                                                if ("instance_type".equals(name)) {
                                                                    return getInstanceType();
                                                                } else {
                                                                    if ("time_sync_enabled".equals(name)) {
                                                                        return isTimeSyncEnabled();
                                                                    } else {
                                                                        if ("rtc_start_time".equals(name)) {
                                                                            return getRtcStartTime();
                                                                        } else {
                                                                            if ("copy_paste_enabled".equals(name)) {
                                                                                return isCopyPasteEnabled();
                                                                            } else {
                                                                                if ("nested_virtualization".equals(name)) {
                                                                                    return isNestedVirtualization();
                                                                                } else {
                                                                                    if ("architecture".equals(name)) {
                                                                                        return getArchitecture();
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

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Hardware.NOT_FOUND_VALUE);
        if (Hardware.NOT_FOUND_VALUE!= value) {
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
