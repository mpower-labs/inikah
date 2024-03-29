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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Bridge. This utility wraps
 * {@link com.inikah.slayer.service.impl.BridgeServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Ahmed Hasan
 * @see BridgeService
 * @see com.inikah.slayer.service.base.BridgeServiceBaseImpl
 * @see com.inikah.slayer.service.impl.BridgeServiceImpl
 * @generated
 */
public class BridgeServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.inikah.slayer.service.impl.BridgeServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.liferay.portal.model.Country getCountry(
		java.lang.String isoCode) {
		return getService().getCountry(isoCode);
	}

	public static java.util.List<com.liferay.portal.model.Country> getCountries() {
		return getService().getCountries();
	}

	public static void createListItem(java.lang.String type,
		java.lang.String value) {
		getService().createListItem(type, value);
	}

	public static boolean maxMindCoordinatesSet(
		com.liferay.portal.model.User user) {
		return getService().maxMindCoordinatesSet(user);
	}

	public static com.liferay.portal.model.Address getMaxMindAddress(
		com.liferay.portal.model.User user) {
		return getService().getMaxMindAddress(user);
	}

	public static void clearService() {
		_service = null;
	}

	public static BridgeService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					BridgeService.class.getName());

			if (invokableService instanceof BridgeService) {
				_service = (BridgeService)invokableService;
			}
			else {
				_service = new BridgeServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(BridgeServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(BridgeService service) {
	}

	private static BridgeService _service;
}