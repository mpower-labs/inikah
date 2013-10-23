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
 * This class is used by SOAP remote services, specifically {@link com.inikah.slayer.service.http.BridgeServiceSoap}.
 *
 * @author Ahmed Hasan
 * @see com.inikah.slayer.service.http.BridgeServiceSoap
 * @generated
 */
public class BridgeSoap implements Serializable {
	public static BridgeSoap toSoapModel(Bridge model) {
		BridgeSoap soapModel = new BridgeSoap();

		soapModel.setRecId(model.getRecId());

		return soapModel;
	}

	public static BridgeSoap[] toSoapModels(Bridge[] models) {
		BridgeSoap[] soapModels = new BridgeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BridgeSoap[][] toSoapModels(Bridge[][] models) {
		BridgeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BridgeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BridgeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BridgeSoap[] toSoapModels(List<Bridge> models) {
		List<BridgeSoap> soapModels = new ArrayList<BridgeSoap>(models.size());

		for (Bridge model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BridgeSoap[soapModels.size()]);
	}

	public BridgeSoap() {
	}

	public long getPrimaryKey() {
		return _recId;
	}

	public void setPrimaryKey(long pk) {
		setRecId(pk);
	}

	public long getRecId() {
		return _recId;
	}

	public void setRecId(long recId) {
		_recId = recId;
	}

	private long _recId;
}