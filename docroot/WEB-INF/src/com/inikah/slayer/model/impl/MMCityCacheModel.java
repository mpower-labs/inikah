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

package com.inikah.slayer.model.impl;

import com.inikah.slayer.model.MMCity;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing MMCity in entity cache.
 *
 * @author Ahmed Hasan
 * @see MMCity
 * @generated
 */
public class MMCityCacheModel implements CacheModel<MMCity>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{cityId=");
		sb.append(cityId);
		sb.append(", regionId=");
		sb.append(regionId);
		sb.append(", name=");
		sb.append(name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MMCity toEntityModel() {
		MMCityImpl mmCityImpl = new MMCityImpl();

		mmCityImpl.setCityId(cityId);
		mmCityImpl.setRegionId(regionId);

		if (name == null) {
			mmCityImpl.setName(StringPool.BLANK);
		}
		else {
			mmCityImpl.setName(name);
		}

		mmCityImpl.resetOriginalValues();

		return mmCityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cityId = objectInput.readLong();
		regionId = objectInput.readLong();
		name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cityId);
		objectOutput.writeLong(regionId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}
	}

	public long cityId;
	public long regionId;
	public String name;
}