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

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Profile service. Represents a row in the &quot;inikah_Profile&quot; database table, with each column mapped to a property of this class.
 *
 * @author Ahmed Hasan
 * @see ProfileModel
 * @see com.inikah.slayer.model.impl.ProfileImpl
 * @see com.inikah.slayer.model.impl.ProfileModelImpl
 * @generated
 */
public interface Profile extends ProfileModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.inikah.slayer.model.impl.ProfileImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* @return
	*/
	public double getComputeAge();

	/**
	* @return
	*/
	public java.lang.String getDisplayAge();

	public void setDefaultLocation(com.liferay.portal.model.User user);
}