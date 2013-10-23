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
 * This class is a wrapper for {@link MMRegion}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see MMRegion
 * @generated
 */
public class MMRegionWrapper implements MMRegion, ModelWrapper<MMRegion> {
	public MMRegionWrapper(MMRegion mmRegion) {
		_mmRegion = mmRegion;
	}

	@Override
	public Class<?> getModelClass() {
		return MMRegion.class;
	}

	@Override
	public String getModelClassName() {
		return MMRegion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("regionId", getRegionId());
		attributes.put("countryId", getCountryId());
		attributes.put("isoCode", getIsoCode());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long regionId = (Long)attributes.get("regionId");

		if (regionId != null) {
			setRegionId(regionId);
		}

		Long countryId = (Long)attributes.get("countryId");

		if (countryId != null) {
			setCountryId(countryId);
		}

		String isoCode = (String)attributes.get("isoCode");

		if (isoCode != null) {
			setIsoCode(isoCode);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	/**
	* Returns the primary key of this m m region.
	*
	* @return the primary key of this m m region
	*/
	@Override
	public long getPrimaryKey() {
		return _mmRegion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this m m region.
	*
	* @param primaryKey the primary key of this m m region
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_mmRegion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the region ID of this m m region.
	*
	* @return the region ID of this m m region
	*/
	@Override
	public long getRegionId() {
		return _mmRegion.getRegionId();
	}

	/**
	* Sets the region ID of this m m region.
	*
	* @param regionId the region ID of this m m region
	*/
	@Override
	public void setRegionId(long regionId) {
		_mmRegion.setRegionId(regionId);
	}

	/**
	* Returns the country ID of this m m region.
	*
	* @return the country ID of this m m region
	*/
	@Override
	public long getCountryId() {
		return _mmRegion.getCountryId();
	}

	/**
	* Sets the country ID of this m m region.
	*
	* @param countryId the country ID of this m m region
	*/
	@Override
	public void setCountryId(long countryId) {
		_mmRegion.setCountryId(countryId);
	}

	/**
	* Returns the iso code of this m m region.
	*
	* @return the iso code of this m m region
	*/
	@Override
	public java.lang.String getIsoCode() {
		return _mmRegion.getIsoCode();
	}

	/**
	* Sets the iso code of this m m region.
	*
	* @param isoCode the iso code of this m m region
	*/
	@Override
	public void setIsoCode(java.lang.String isoCode) {
		_mmRegion.setIsoCode(isoCode);
	}

	/**
	* Returns the name of this m m region.
	*
	* @return the name of this m m region
	*/
	@Override
	public java.lang.String getName() {
		return _mmRegion.getName();
	}

	/**
	* Sets the name of this m m region.
	*
	* @param name the name of this m m region
	*/
	@Override
	public void setName(java.lang.String name) {
		_mmRegion.setName(name);
	}

	@Override
	public boolean isNew() {
		return _mmRegion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_mmRegion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _mmRegion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_mmRegion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _mmRegion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _mmRegion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_mmRegion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _mmRegion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_mmRegion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_mmRegion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_mmRegion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MMRegionWrapper((MMRegion)_mmRegion.clone());
	}

	@Override
	public int compareTo(com.inikah.slayer.model.MMRegion mmRegion) {
		return _mmRegion.compareTo(mmRegion);
	}

	@Override
	public int hashCode() {
		return _mmRegion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.inikah.slayer.model.MMRegion> toCacheModel() {
		return _mmRegion.toCacheModel();
	}

	@Override
	public com.inikah.slayer.model.MMRegion toEscapedModel() {
		return new MMRegionWrapper(_mmRegion.toEscapedModel());
	}

	@Override
	public com.inikah.slayer.model.MMRegion toUnescapedModel() {
		return new MMRegionWrapper(_mmRegion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _mmRegion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _mmRegion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_mmRegion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MMRegionWrapper)) {
			return false;
		}

		MMRegionWrapper mmRegionWrapper = (MMRegionWrapper)obj;

		if (Validator.equals(_mmRegion, mmRegionWrapper._mmRegion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MMRegion getWrappedMMRegion() {
		return _mmRegion;
	}

	@Override
	public MMRegion getWrappedModel() {
		return _mmRegion;
	}

	@Override
	public void resetOriginalValues() {
		_mmRegion.resetOriginalValues();
	}

	private MMRegion _mmRegion;
}