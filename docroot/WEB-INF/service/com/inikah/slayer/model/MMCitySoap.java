/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.inikah.slayer.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.inikah.slayer.service.http.MMCityServiceSoap}.
 *
 * @author Ahmed Hasan
 * @see com.inikah.slayer.service.http.MMCityServiceSoap
 * @generated
 */
public class MMCitySoap implements Serializable {
	public static MMCitySoap toSoapModel(MMCity model) {
		MMCitySoap soapModel = new MMCitySoap();

		soapModel.setCityId(model.getCityId());
		soapModel.setRegionId(model.getRegionId());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static MMCitySoap[] toSoapModels(MMCity[] models) {
		MMCitySoap[] soapModels = new MMCitySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MMCitySoap[][] toSoapModels(MMCity[][] models) {
		MMCitySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MMCitySoap[models.length][models[0].length];
		}
		else {
			soapModels = new MMCitySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MMCitySoap[] toSoapModels(List<MMCity> models) {
		List<MMCitySoap> soapModels = new ArrayList<MMCitySoap>(models.size());

		for (MMCity model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MMCitySoap[soapModels.size()]);
	}

	public MMCitySoap() {
	}

	public long getPrimaryKey() {
		return _cityId;
	}

	public void setPrimaryKey(long pk) {
		setCityId(pk);
	}

	public long getCityId() {
		return _cityId;
	}

	public void setCityId(long cityId) {
		_cityId = cityId;
	}

	public long getRegionId() {
		return _regionId;
	}

	public void setRegionId(long regionId) {
		_regionId = regionId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	private long _cityId;
	private long _regionId;
	private String _name;
}