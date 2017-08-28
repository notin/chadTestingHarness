
package pojos;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "id",
    "ip",
    "hostname",
    "mac",
    "services_count",
    "services",
    "public_ips_count",
    "public_ips",
    "vm_id",
    "vm_name",
    "status",
    "network_id",
    "network_name",
    "network_url",
    "network_type",
    "network_subnet",
    "nic_type",
    "secondary_ips",
    "public_ip_attachments"
})
public class Interface {

    @JsonProperty("id")
    private String id;
    @JsonProperty("ip")
    private String ip;
    @JsonProperty("hostname")
    private String hostname;
    @JsonProperty("mac")
    private String mac;
    @JsonProperty("services_count")
    private int servicesCount;
    @JsonProperty("services")

    private List<Object> services = new ArrayList<Object>();
    @JsonProperty("public_ips_count")
    private int publicIpsCount;
    @JsonProperty("public_ips")

    private List<Object> publicIps = new ArrayList<Object>();
    @JsonProperty("vm_id")
    private String vmId;
    @JsonProperty("vm_name")
    private String vmName;
    @JsonProperty("status")
    private String status;
    @JsonProperty("network_id")
    private String networkId;
    @JsonProperty("network_name")
    private String networkName;
    @JsonProperty("network_url")
    private String networkUrl;
    @JsonProperty("network_type")
    private String networkType;
    @JsonProperty("network_subnet")
    private String networkSubnet;
    @JsonProperty("nic_type")
    private String nicType;
    @JsonProperty("secondary_ips")

    private List<Object> secondaryIps = new ArrayList<Object>();
    @JsonProperty("public_ip_attachments")

    private List<Object> publicIpAttachments = new ArrayList<Object>();
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
     *     The ip
     */
    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    /**
     * 
     * @param ip
     *     The ip
     */
    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 
     * @return
     *     The hostname
     */
    @JsonProperty("hostname")
    public String getHostname() {
        return hostname;
    }

    /**
     * 
     * @param hostname
     *     The hostname
     */
    @JsonProperty("hostname")
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * 
     * @return
     *     The mac
     */
    @JsonProperty("mac")
    public String getMac() {
        return mac;
    }

    /**
     * 
     * @param mac
     *     The mac
     */
    @JsonProperty("mac")
    public void setMac(String mac) {
        this.mac = mac;
    }

    /**
     * 
     * @return
     *     The servicesCount
     */
    @JsonProperty("services_count")
    public int getServicesCount() {
        return servicesCount;
    }

    /**
     * 
     * @param servicesCount
     *     The services_count
     */
    @JsonProperty("services_count")
    public void setServicesCount(int servicesCount) {
        this.servicesCount = servicesCount;
    }

    /**
     * 
     * @return
     *     The services
     */
    @JsonProperty("services")
    public List<Object> getServices() {
        return services;
    }

    /**
     * 
     * @param services
     *     The services
     */
    @JsonProperty("services")
    public void setServices(List<Object> services) {
        this.services = services;
    }

    /**
     * 
     * @return
     *     The publicIpsCount
     */
    @JsonProperty("public_ips_count")
    public int getPublicIpsCount() {
        return publicIpsCount;
    }

    /**
     * 
     * @param publicIpsCount
     *     The public_ips_count
     */
    @JsonProperty("public_ips_count")
    public void setPublicIpsCount(int publicIpsCount) {
        this.publicIpsCount = publicIpsCount;
    }

    /**
     * 
     * @return
     *     The publicIps
     */
    @JsonProperty("public_ips")
    public List<Object> getPublicIps() {
        return publicIps;
    }

    /**
     * 
     * @param publicIps
     *     The public_ips
     */
    @JsonProperty("public_ips")
    public void setPublicIps(List<Object> publicIps) {
        this.publicIps = publicIps;
    }

    /**
     * 
     * @return
     *     The vmId
     */
    @JsonProperty("vm_id")
    public String getVmId() {
        return vmId;
    }

    /**
     * 
     * @param vmId
     *     The vm_id
     */
    @JsonProperty("vm_id")
    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    /**
     * 
     * @return
     *     The vmName
     */
    @JsonProperty("vm_name")
    public String getVmName() {
        return vmName;
    }

    /**
     * 
     * @param vmName
     *     The vm_name
     */
    @JsonProperty("vm_name")
    public void setVmName(String vmName) {
        this.vmName = vmName;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The networkId
     */
    @JsonProperty("network_id")
    public String getNetworkId() {
        return networkId;
    }

    /**
     * 
     * @param networkId
     *     The network_id
     */
    @JsonProperty("network_id")
    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    /**
     * 
     * @return
     *     The networkName
     */
    @JsonProperty("network_name")
    public String getNetworkName() {
        return networkName;
    }

    /**
     * 
     * @param networkName
     *     The network_name
     */
    @JsonProperty("network_name")
    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    /**
     * 
     * @return
     *     The networkUrl
     */
    @JsonProperty("network_url")
    public String getNetworkUrl() {
        return networkUrl;
    }

    /**
     * 
     * @param networkUrl
     *     The network_url
     */
    @JsonProperty("network_url")
    public void setNetworkUrl(String networkUrl) {
        this.networkUrl = networkUrl;
    }

    /**
     * 
     * @return
     *     The networkType
     */
    @JsonProperty("network_type")
    public String getNetworkType() {
        return networkType;
    }

    /**
     * 
     * @param networkType
     *     The network_type
     */
    @JsonProperty("network_type")
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    /**
     * 
     * @return
     *     The networkSubnet
     */
    @JsonProperty("network_subnet")
    public String getNetworkSubnet() {
        return networkSubnet;
    }

    /**
     * 
     * @param networkSubnet
     *     The network_subnet
     */
    @JsonProperty("network_subnet")
    public void setNetworkSubnet(String networkSubnet) {
        this.networkSubnet = networkSubnet;
    }

    /**
     * 
     * @return
     *     The nicType
     */
    @JsonProperty("nic_type")
    public String getNicType() {
        return nicType;
    }

    /**
     * 
     * @param nicType
     *     The nic_type
     */
    @JsonProperty("nic_type")
    public void setNicType(String nicType) {
        this.nicType = nicType;
    }

    /**
     * 
     * @return
     *     The secondaryIps
     */
    @JsonProperty("secondary_ips")
    public List<Object> getSecondaryIps() {
        return secondaryIps;
    }

    /**
     * 
     * @param secondaryIps
     *     The secondary_ips
     */
    @JsonProperty("secondary_ips")
    public void setSecondaryIps(List<Object> secondaryIps) {
        this.secondaryIps = secondaryIps;
    }

    /**
     * 
     * @return
     *     The publicIpAttachments
     */
    @JsonProperty("public_ip_attachments")
    public List<Object> getPublicIpAttachments() {
        return publicIpAttachments;
    }

    /**
     * 
     * @param publicIpAttachments
     *     The public_ip_attachments
     */
    @JsonProperty("public_ip_attachments")
    public void setPublicIpAttachments(List<Object> publicIpAttachments) {
        this.publicIpAttachments = publicIpAttachments;
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
            if ("ip".equals(name)) {
                if (value instanceof String) {
                    setIp(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"ip\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("hostname".equals(name)) {
                    if (value instanceof String) {
                        setHostname(((String) value));
                    } else {
                        throw new IllegalArgumentException(("property \"hostname\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("mac".equals(name)) {
                        if (value instanceof String) {
                            setMac(((String) value));
                        } else {
                            throw new IllegalArgumentException(("property \"mac\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("services_count".equals(name)) {
                            if (value instanceof Integer) {
                                setServicesCount(((Integer) value));
                            } else {
                                throw new IllegalArgumentException(("property \"services_count\" is of type \"int\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("services".equals(name)) {
                                if (value instanceof List) {
                                    setServices(((List<Object> ) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"services\" is of type \"java.util.List<java.lang.Object>\", but got "+ value.getClass().toString()));
                                }
                                return true;
                            } else {
                                if ("public_ips_count".equals(name)) {
                                    if (value instanceof Integer) {
                                        setPublicIpsCount(((Integer) value));
                                    } else {
                                        throw new IllegalArgumentException(("property \"public_ips_count\" is of type \"int\", but got "+ value.getClass().toString()));
                                    }
                                    return true;
                                } else {
                                    if ("public_ips".equals(name)) {
                                        if (value instanceof List) {
                                            setPublicIps(((List<Object> ) value));
                                        } else {
                                            throw new IllegalArgumentException(("property \"public_ips\" is of type \"java.util.List<java.lang.Object>\", but got "+ value.getClass().toString()));
                                        }
                                        return true;
                                    } else {
                                        if ("vm_id".equals(name)) {
                                            if (value instanceof String) {
                                                setVmId(((String) value));
                                            } else {
                                                throw new IllegalArgumentException(("property \"vm_id\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                            }
                                            return true;
                                        } else {
                                            if ("vm_name".equals(name)) {
                                                if (value instanceof String) {
                                                    setVmName(((String) value));
                                                } else {
                                                    throw new IllegalArgumentException(("property \"vm_name\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                }
                                                return true;
                                            } else {
                                                if ("status".equals(name)) {
                                                    if (value instanceof String) {
                                                        setStatus(((String) value));
                                                    } else {
                                                        throw new IllegalArgumentException(("property \"status\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                    }
                                                    return true;
                                                } else {
                                                    if ("network_id".equals(name)) {
                                                        if (value instanceof String) {
                                                            setNetworkId(((String) value));
                                                        } else {
                                                            throw new IllegalArgumentException(("property \"network_id\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                        }
                                                        return true;
                                                    } else {
                                                        if ("network_name".equals(name)) {
                                                            if (value instanceof String) {
                                                                setNetworkName(((String) value));
                                                            } else {
                                                                throw new IllegalArgumentException(("property \"network_name\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                            }
                                                            return true;
                                                        } else {
                                                            if ("network_url".equals(name)) {
                                                                if (value instanceof String) {
                                                                    setNetworkUrl(((String) value));
                                                                } else {
                                                                    throw new IllegalArgumentException(("property \"network_url\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                }
                                                                return true;
                                                            } else {
                                                                if ("network_type".equals(name)) {
                                                                    if (value instanceof String) {
                                                                        setNetworkType(((String) value));
                                                                    } else {
                                                                        throw new IllegalArgumentException(("property \"network_type\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                    }
                                                                    return true;
                                                                } else {
                                                                    if ("network_subnet".equals(name)) {
                                                                        if (value instanceof String) {
                                                                            setNetworkSubnet(((String) value));
                                                                        } else {
                                                                            throw new IllegalArgumentException(("property \"network_subnet\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                        }
                                                                        return true;
                                                                    } else {
                                                                        if ("nic_type".equals(name)) {
                                                                            if (value instanceof String) {
                                                                                setNicType(((String) value));
                                                                            } else {
                                                                                throw new IllegalArgumentException(("property \"nic_type\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                            }
                                                                            return true;
                                                                        } else {
                                                                            if ("secondary_ips".equals(name)) {
                                                                                if (value instanceof List) {
                                                                                    setSecondaryIps(((List<Object> ) value));
                                                                                } else {
                                                                                    throw new IllegalArgumentException(("property \"secondary_ips\" is of type \"java.util.List<java.lang.Object>\", but got "+ value.getClass().toString()));
                                                                                }
                                                                                return true;
                                                                            } else {
                                                                                if ("public_ip_attachments".equals(name)) {
                                                                                    if (value instanceof List) {
                                                                                        setPublicIpAttachments(((List<Object> ) value));
                                                                                    } else {
                                                                                        throw new IllegalArgumentException(("property \"public_ip_attachments\" is of type \"java.util.List<java.lang.Object>\", but got "+ value.getClass().toString()));
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

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("id".equals(name)) {
            return getId();
        } else {
            if ("ip".equals(name)) {
                return getIp();
            } else {
                if ("hostname".equals(name)) {
                    return getHostname();
                } else {
                    if ("mac".equals(name)) {
                        return getMac();
                    } else {
                        if ("services_count".equals(name)) {
                            return getServicesCount();
                        } else {
                            if ("services".equals(name)) {
                                return getServices();
                            } else {
                                if ("public_ips_count".equals(name)) {
                                    return getPublicIpsCount();
                                } else {
                                    if ("public_ips".equals(name)) {
                                        return getPublicIps();
                                    } else {
                                        if ("vm_id".equals(name)) {
                                            return getVmId();
                                        } else {
                                            if ("vm_name".equals(name)) {
                                                return getVmName();
                                            } else {
                                                if ("status".equals(name)) {
                                                    return getStatus();
                                                } else {
                                                    if ("network_id".equals(name)) {
                                                        return getNetworkId();
                                                    } else {
                                                        if ("network_name".equals(name)) {
                                                            return getNetworkName();
                                                        } else {
                                                            if ("network_url".equals(name)) {
                                                                return getNetworkUrl();
                                                            } else {
                                                                if ("network_type".equals(name)) {
                                                                    return getNetworkType();
                                                                } else {
                                                                    if ("network_subnet".equals(name)) {
                                                                        return getNetworkSubnet();
                                                                    } else {
                                                                        if ("nic_type".equals(name)) {
                                                                            return getNicType();
                                                                        } else {
                                                                            if ("secondary_ips".equals(name)) {
                                                                                return getSecondaryIps();
                                                                            } else {
                                                                                if ("public_ip_attachments".equals(name)) {
                                                                                    return getPublicIpAttachments();
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

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Interface.NOT_FOUND_VALUE);
        if (Interface.NOT_FOUND_VALUE!= value) {
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
