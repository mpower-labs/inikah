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

package com.inikah.slayer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MMRegionService}.
 *
 * @author Ahmed Hasan
 * @see MMRegionService
 * @generated
 */
public class MMRegionServiceWrapper implements MMRegionService,
	ServiceWrapper<MMRegionService> {
	public MMRegionServiceWrapper(MMRegionService mmRegionService) {
		_mmRegionService = mmRegionService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _mmRegionService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_mmRegionService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _mmRegionService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.inikah.slayer.model.MMRegion getRegion(long countryId,
		java.lang.String isoCode, java.lang.String name) {
		return _mmRegionService.getRegion(countryId, isoCode, name);
	}

	@Override
	public java.util.List<com.inikah.slayer.model.MMRegion> getRegions(
		long countryId) {
		return _mmRegionService.getRegions(countryId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MMRegionService getWrappedMMRegionService() {
		return _mmRegionService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMMRegionService(MMRegionService mmRegionService) {
		_mmRegionService = mmRegionService;
	}

	@Override
	public MMRegionService getWrappedService() {
		return _mmRegionService;
	}

	@Override
	public void setWrappedService(MMRegionService mmRegionService) {
		_mmRegionService = mmRegionService;
	}

	private MMRegionService _mmRegionService;
}