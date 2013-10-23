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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MMCity}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see MMCity
 * @generated
 */
public class MMCityWrapper implements MMCity, ModelWrapper<MMCity> {
	public MMCityWrapper(MMCity mmCity) {
		_mmCity = mmCity;
	}

	@Override
	public Class<?> getModelClass() {
		return MMCity.class;
	}

	@Override
	public String getModelClassName() {
		return MMCity.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cityId", getCityId());
		attributes.put("regionId", getRegionId());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cityId = (Long)attributes.get("cityId");

		if (cityId != null) {
			setCityId(cityId);
		}

		Long regionId = (Long)attributes.get("regionId");

		if (regionId != null) {
			setRegionId(regionId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	/**
	* Returns the primary key of this m m city.
	*
	* @return the primary key of this m m city
	*/
	@Override
	public long getPrimaryKey() {
		return _mmCity.getPrimaryKey();
	}

	/**
	* Sets the primary key of this m m city.
	*
	* @param primaryKey the primary key of this m m city
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_mmCity.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the city ID of this m m city.
	*
	* @return the city ID of this m m city
	*/
	@Override
	public long getCityId() {
		return _mmCity.getCityId();
	}

	/**
	* Sets the city ID of this m m city.
	*
	* @param cityId the city ID of this m m city
	*/
	@Override
	public void setCityId(long cityId) {
		_mmCity.setCityId(cityId);
	}

	/**
	* Returns the region ID of this m m city.
	*
	* @return the region ID of this m m city
	*/
	@Override
	public long getRegionId() {
		return _mmCity.getRegionId();
	}

	/**
	* Sets the region ID of this m m city.
	*
	* @param regionId the region ID of this m m city
	*/
	@Override
	public void setRegionId(long regionId) {
		_mmCity.setRegionId(regionId);
	}

	/**
	* Returns the name of this m m city.
	*
	* @return the name of this m m city
	*/
	@Override
	public java.lang.String getName() {
		return _mmCity.getName();
	}

	/**
	* Sets the name of this m m city.
	*
	* @param name the name of this m m city
	*/
	@Override
	public void setName(java.lang.String name) {
		_mmCity.setName(name);
	}

	@Override
	public boolean isNew() {
		return _mmCity.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_mmCity.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _mmCity.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_mmCity.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _mmCity.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _mmCity.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_mmCity.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _mmCity.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_mmCity.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_mmCity.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_mmCity.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MMCityWrapper((MMCity)_mmCity.clone());
	}

	@Override
	public int compareTo(com.inikah.slayer.model.MMCity mmCity) {
		return _mmCity.compareTo(mmCity);
	}

	@Override
	public int hashCode() {
		return _mmCity.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.inikah.slayer.model.MMCity> toCacheModel() {
		return _mmCity.toCacheModel();
	}

	@Override
	public com.inikah.slayer.model.MMCity toEscapedModel() {
		return new MMCityWrapper(_mmCity.toEscapedModel());
	}

	@Override
	public com.inikah.slayer.model.MMCity toUnescapedModel() {
		return new MMCityWrapper(_mmCity.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _mmCity.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _mmCity.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_mmCity.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MMCityWrapper)) {
			return false;
		}

		MMCityWrapper mmCityWrapper = (MMCityWrapper)obj;

		if (Validator.equals(_mmCity, mmCityWrapper._mmCity)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MMCity getWrappedMMCity() {
		return _mmCity;
	}

	@Override
	public MMCity getWrappedModel() {
		return _mmCity;
	}

	@Override
	public void resetOriginalValues() {
		_mmCity.resetOriginalValues();
	}

	private MMCity _mmCity;
}