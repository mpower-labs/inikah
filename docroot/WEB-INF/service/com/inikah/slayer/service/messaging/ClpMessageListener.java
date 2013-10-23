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

package com.inikah.slayer.service.messaging;

import com.inikah.slayer.service.BridgeServiceUtil;
import com.inikah.slayer.service.ClpSerializer;
import com.inikah.slayer.service.MMCityLocalServiceUtil;
import com.inikah.slayer.service.MMCityServiceUtil;
import com.inikah.slayer.service.MMRegionLocalServiceUtil;
import com.inikah.slayer.service.MMRegionServiceUtil;
import com.inikah.slayer.service.ProfileLocalServiceUtil;
import com.inikah.slayer.service.ProfileServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

/**
 * @author Ahmed Hasan
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			BridgeServiceUtil.clearService();
			MMCityLocalServiceUtil.clearService();

			MMCityServiceUtil.clearService();
			MMRegionLocalServiceUtil.clearService();

			MMRegionServiceUtil.clearService();
			ProfileLocalServiceUtil.clearService();

			ProfileServiceUtil.clearService();
		}
	}
}