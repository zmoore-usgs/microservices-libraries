package gov.usgs.cida.microservices.api.discovery;

import gov.usgs.cida.microservices.config.ServiceConfig;
import java.util.List;
import java.util.Map;

public interface Client {

	/**
	 * Registers a service into the catalog
	 *
	 */
	public void registerService();
	
	/**
	 * Removes a service from registration
	 */
	public void deregisterService();
	
	/**
	 * Retrieves a list of known services 
	 * @return 
	 */
	public Map<String, List<String>> getServices();
	
	/**
	 * Get a service by name
	 * 
	 * @param serviceName
	 * @return 
	 */
	public List<ServiceConfig> getService(String serviceName);
}