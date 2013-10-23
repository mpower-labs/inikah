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
 * This class is used by SOAP remote services, specifically {@link com.inikah.slayer.service.http.MMRegionServiceSoap}.
 *
 * @author Ahmed Hasan
 * @see com.inikah.slayer.service.http.MMRegionServiceSoap
 * @generated
 */
public class MMRegionSoap implements Serializable {
	public static MMRegionSoap toSoapModel(MMRegion model) {
		MMRegionSoap soapModel = new MMRegionSoap();

		soapModel.setRegionId(model.getRegionId());
		soapModel.setCountryId(model.getCountryId());
		soapModel.setIsoCode(model.getIsoCode());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static MMRegionSoap[] toSoapModels(MMRegion[] models) {
		MMRegionSoap[] soapModels = new MMRegionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MMRegionSoap[][] toSoapModels(MMRegion[][] models) {
		MMRegionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MMRegionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MMRegionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MMRegionSoap[] toSoapModels(List<MMRegion> models) {
		List<MMRegionSoap> soapModels = new ArrayList<MMRegionSoap>(models.size());

		for (MMRegion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MMRegionSoap[soapModels.size()]);
	}

	public MMRegionSoap() {
	}

	public long getPrimaryKey() {
		return _regionId;
	}

	public void setPrimaryKey(long pk) {
		setRegionId(pk);
	}

	public long getRegionId() {
		return _regionId;
	}

	public void setRegionId(long regionId) {
		_regionId = regionId;
	}

	public long getCountryId() {
		return _countryId;
	}

	public void setCountryId(long countryId) {
		_countryId = countryId;
	}

	public String getIsoCode() {
		return _isoCode;
	}

	public void setIsoCode(String isoCode) {
		_isoCode = isoCode;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	private long _regionId;
	private long _countryId;
	private String _isoCode;
	private String _name;
}