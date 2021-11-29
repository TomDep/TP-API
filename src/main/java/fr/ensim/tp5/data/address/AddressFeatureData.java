package fr.ensim.tp5.data.address;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressFeatureData {

	private AddressData properties;
	private GeometryData geometry;
	
	public AddressFeatureData() {

	}

	public AddressData getProperties() {
		return properties;
	}

	public void setProperties(AddressData properties) {
		this.properties = properties;
	}

	public GeometryData getGeometry() {
		return geometry;
	}

	public void setGeometry(GeometryData geometry) {
		this.geometry = geometry;
	}
}
