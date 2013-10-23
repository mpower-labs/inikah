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

import com.inikah.slayer.model.MMRegion;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing MMRegion in entity cache.
 *
 * @author Ahmed Hasan
 * @see MMRegion
 * @generated
 */
public class MMRegionCacheModel implements CacheModel<MMRegion>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{regionId=");
		sb.append(regionId);
		sb.append(", countryId=");
		sb.append(countryId);
		sb.append(", isoCode=");
		sb.append(isoCode);
		sb.append(", name=");
		sb.append(name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MMRegion toEntityModel() {
		MMRegionImpl mmRegionImpl = new MMRegionImpl();

		mmRegionImpl.setRegionId(regionId);
		mmRegionImpl.setCountryId(countryId);

		if (isoCode == null) {
			mmRegionImpl.setIsoCode(StringPool.BLANK);
		}
		else {
			mmRegionImpl.setIsoCode(isoCode);
		}

		if (name == null) {
			mmRegionImpl.setName(StringPool.BLANK);
		}
		else {
			mmRegionImpl.setName(name);
		}

		mmRegionImpl.resetOriginalValues();

		return mmRegionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		regionId = objectInput.readLong();
		countryId = objectInput.readLong();
		isoCode = objectInput.readUTF();
		name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(regionId);
		objectOutput.writeLong(countryId);

		if (isoCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(isoCode);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}
	}

	public long regionId;
	public long countryId;
	public String isoCode;
	public String name;
}